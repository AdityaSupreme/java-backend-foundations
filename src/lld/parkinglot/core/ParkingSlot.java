package lld.parkinglot.core;

import lld.parkinglot.core.Vehicle;
import lld.parkinglot.core.VehicleType;

public class ParkingSlot {
    private final String slotId;
    private final VehicleType supportedType;
    private Vehicle parkedVehicle;

    public ParkingSlot(String slotId, VehicleType supportedType) {
        this.slotId = slotId;
        this.supportedType = supportedType;
    }

    public boolean isAvailable() {
        return parkedVehicle == null;
    }

    public boolean canPark(Vehicle vehicle) {
        return isAvailable() && vehicle.getVehicleType() == supportedType;
    }

    public void park(Vehicle vehicle) {
        if (!canPark(vehicle)) {
            throw new IllegalStateException("Cannot park vehicle in this slot");
        }
        this.parkedVehicle = vehicle;
    }

    public void unpark() {
        this.parkedVehicle = null;
    }

    public String getSlotId() {
        return slotId;
    }
}
