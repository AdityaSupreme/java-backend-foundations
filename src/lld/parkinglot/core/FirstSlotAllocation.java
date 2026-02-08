package lld.parkinglot.core;

import java.util.List;

public class FirstSlotAllocation implements SlotAllocation {

    @Override
    public ParkingSlot selectSlot(List<ParkingSlot> slots, Vehicle vehicle) {

        for (ParkingSlot slot : slots) {
            if(slot.isAvailable() && slot.canPark(vehicle)){
                return slot;
            }
        }
        return null;
    }
}
