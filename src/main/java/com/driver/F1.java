package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 4, 6, isManual, "F1", 1);
    }

    public void accelerate(int rate){
        int newSpeed = this.getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate
        /*
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed > 250) this.changeGear(6);
        else if(newSpeed > 200) this.changeGear(5);
        else if(newSpeed > 150) this.changeGear(4);
        else if(newSpeed > 100) this.changeGear(3);
        else if(newSpeed > 50) this.changeGear(2);
        else this.changeGear(1);
        //for all other cases, change the gear accordingly

        this.changeSpeed(Math.max(newSpeed, 0), this.getCurrentDirection());
    }
}
