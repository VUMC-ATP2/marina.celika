package Classroom;

public class Circle {
    double PI = 3.14;
    double circleRadius;

    //PI * R ^ 2
    public double circleArea(double radius) {
        this.circleRadius = PI * (radius * radius);
        return this.circleRadius; //atšķirās no double radius

        //return PI * (radius * radius);

    }
}

