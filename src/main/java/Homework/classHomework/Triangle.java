package Homework.classHomework;

public class Triangle {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        int x = (a + b + c) / 2;
        double S = Math.sqrt(x * (x - a) * (x - b) * (x - c));
        System.out.println("S = " + S);

        if(a + b > c) {
            if (a + c > b) {
                if (c + b > a) {
                    System.out.println("True");
                }else{
                    System.out.println("False");
                }
            }
        }
        }

    public Triangle() {
        System.out.println("Creating Triangle");
    }




}

