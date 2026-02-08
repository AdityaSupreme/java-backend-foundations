package lld.parkinglot.core;

import java.util.List;

public interface SlotAllocation {
    public ParkingSlot selectSlot(List<ParkingSlot> slots, Vehicle vehicle);
}
