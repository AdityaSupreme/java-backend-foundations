package lld.parkinglot.core;
public class ParkingTicket {
    private final String ticketId;
    private final String slotId;
    private final String vehicleRegNumber;

    public ParkingTicket(String ticketId, String slotId, String vehicleRegNumber) {
        this.ticketId = ticketId;
        this.slotId = slotId;
        this.vehicleRegNumber = vehicleRegNumber;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getSlotId() {
        return slotId;
    }
}
