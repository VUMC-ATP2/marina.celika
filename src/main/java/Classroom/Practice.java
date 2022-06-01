package Classroom;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number");
              /*  int inputResult = scanner.nextInt();
                if(inputResult > 0);
                System.out.println("Number is > 0 which is: " + inputResult);*/

       /*System.out.println("Please write your age");
        int inputResult = scanner.nextInt();
        if(inputResult > 0);
        System.out.println("Number is > 0 which is: " + inputResult);*/

        /*int inputResult = scanner.nextInt();
        System.out.println("Please write a number from 1 to 7");
        if (inputResult == 1) {
            System.out.println("Pirmdiena");
        } else if (inputResult == 2) {
            System.out.println("Otrdiena");
        } else if (inputResult == 3) {
            System.out.println("Trešdiena");
        } else if (inputResult == 4) {
            System.out.println("Ceturtdiena");
        } else if (inputResult == 5) {
            System.out.println("Piektdiena");
        } else if (inputResult == 6) {
            System.out.println("Sestdiena");
        } else if (inputResult == 7) {
            System.out.println("Svētdiena");
        }*/


        System.out.println("Please write a number");
        int inputResult = scanner.nextInt();
        if (inputResult % 2 == 0) {
            System.out.println("Pāra");
        } else {
            System.out.println("Nepāra");


        }
    }
}








