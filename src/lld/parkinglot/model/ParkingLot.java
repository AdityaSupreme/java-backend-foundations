package lld.parkinglot.model;

import lld.parkinglot.core.ParkingSlot;
import lld.parkinglot.core.ParkingTicket;

import lld.parkinglot.core.Vehicle;

import java.util.*;


public class ParkingLot {
    List<ParkingSlot> slots;
    HashMap<String, ParkingTicket> activeTickets =  new HashMap<>();
    public ParkingLot(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    private ParkingSlot findParkingSlots(Vehicle vehicle) {
        for (ParkingSlot slot : slots) {
            if (slot.isAvailable() && slot.canPark(vehicle)) {
                return slot;
            }
        }
        return null;
    }
    public ParkingTicket parkVehicle(Vehicle vehicle) {
        ParkingSlot slot = findParkingSlots(vehicle);
        if (slot == null) {
            throw  new RuntimeException("Slot not found");
        }else{
            slot.park(vehicle);
            String ticketId = UUID.randomUUID().toString();
            ParkingTicket ticket = new ParkingTicket(ticketId,slot.getSlotId(),vehicle.getRegistrationNumber());
            activeTickets.put(ticketId,ticket);
            return ticket;
        }
    }
    public void unpark(String ticketId) {
        ParkingTicket ticket = activeTickets.remove(ticketId);
        if (ticket == null) {
            throw new IllegalArgumentException("Invalid ticket");
        }

        for (ParkingSlot slot : slots) {
            if (slot.getSlotId().equals(ticket.getSlotId())) {
                slot.unpark();
                return;
            }
        }
    }

}
