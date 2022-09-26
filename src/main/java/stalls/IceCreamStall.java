package stalls;

import people.Visitor;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    public boolean isAllowedTo(Visitor visitor) {
        return false;
    }


    public int getRating() {
        return 0;
    }
}
