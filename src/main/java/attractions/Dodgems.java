package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    public double defaultPrice() {
        return 4.50;
    }


    public double priceFor() {
        return 0;
    }

    public double kidsPayHalf(Visitor visitor) {
        if (visitor.getAge() < 15) {
            return defaultPrice() / 2;
        }
        return defaultPrice();
    }
}
