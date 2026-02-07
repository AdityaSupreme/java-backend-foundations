package lld.parkinglot;

import lld.parkinglot.core.ParkingSlot;
import lld.parkinglot.core.ParkingTicket;
import lld.parkinglot.core.Vehicle;
import lld.parkinglot.core.VehicleType;
import lld.parkinglot.model.ParkingLot;
import java.util.*;

public class App {
    public static void main(String[] args) {
        List<ParkingSlot> slots = List.of(
                new ParkingSlot("S1", VehicleType.CAR),
                new ParkingSlot("S2", VehicleType.BIKE),
                new ParkingSlot("S3", VehicleType.TRUCK)
        );
        ParkingLot parkingLot = new ParkingLot(slots);
        Vehicle car = new Vehicle("KA-01-1234", VehicleType.CAR);
        ParkingTicket ticket = parkingLot.parkVehicle(car);

        System.out.println("Parked with ticket: " + ticket.getTicketId());

        parkingLot.unpark(ticket.getTicketId());
        System.out.println("Vehicle unparked");
    }
}
