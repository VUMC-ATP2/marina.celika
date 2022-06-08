package Classroom;

public class Classes {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.printInformation();

        System.out.println("==============");

        System.out.println(myCar.fullTankPrice(20));
        myCar.isCarOld();

        Circle aplis = new Circle();
        System.out.println(aplis.circleArea(50));

    }
}