package Classroom;

import javax.jws.soap.SOAPBinding;

public class Car {
    int year = 2006;
    String color = "red";
    String number = "GH2001";
    int speed = 200;
    int tank = 50;

    public void printInformation() {
        System.out.println("Info about car");
        System.out.println("Number: " + number);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
        System.out.println("Max speed: " + speed);

    }

    public int fullTankPrice(int fuelCount) { //int - ja vajag atgriezt
        return fuelCount * 2;
    }

    public boolean isCarOld() {
        boolean isOld;
        if (year < 2000) {
            System.out.println("House is old!");
            isOld = true;
        } else {
            System.out.println("Pretty new");
            isOld = false;
        }
        return isOld;
    }

}
