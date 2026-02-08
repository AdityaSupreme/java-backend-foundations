package lld.parkinglot;

import lld.parkinglot.core.*;
import lld.parkinglot.model.ParkingLot;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<ParkingSlot> slots = List.of(
                new ParkingSlot("S1", VehicleType.CAR),
                new ParkingSlot("S2", VehicleType.BIKE),
                new ParkingSlot("S3", VehicleType.TRUCK)
        );
        SlotAllocation slotStrategy = new FirstSlotAllocation();
        ParkingLot parkingLot = new ParkingLot(slots, slotStrategy);
        Vehicle car = new Vehicle("KA-01-1234", VehicleType.CAR);
        ParkingTicket ticket = parkingLot.parkVehicle(car);

        System.out.println("Parked with ticket: " + ticket.getTicketId());

        parkingLot.unpark(ticket.getTicketId());
        System.out.println("Vehicle unparked");
    }
}
