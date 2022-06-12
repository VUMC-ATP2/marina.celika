package Homework;

import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        //1.uzdevums

        int i = 100;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        System.out.println("Readdy");

        System.out.println();

        // 2.uzdevums
        int j, k;
        boolean isPrime;
        for (j = 2; j < 100; j++) {
            isPrime = true;
            for (k = 2; k <= j / k; k++)
                if ((j % k) == 0) isPrime = false;
            if (isPrime)
                System.out.println(j + " is Prime number ");
        }
        System.out.println();

        //3.uzdevums
        int price = 200;


        while (price >= 150) {
            System.out.println(price);
            price--;
        }
        System.out.println();

        do {
            System.out.print(price + ", ");
            price++;
        } while (price <= 100);

        System.out.println();

        String[] color = new String[]{"blue", "orange", "green"};
        for (int l = 0; l < 3; l++) {
            System.out.println(color[l]);
        }
        System.out.println();

        char[] letter = {'a', 'b', 'c'};
        for (char Letter : letter) {
            System.out.println(letter);
        }
        System.out.println();

        //4.uzdevums
        int[] total = new int[90];
        for (int p = 1; p <= total.length; p++) {
            if (total.length % 2 == 0) {
                System.out.printf(String.valueOf(p));

            }

        }
        System.out.println();
    }

    // 5.uzdevums
    public static int factorial(int value) {
        int x = 5;
        for (int h = 2; h <= value; h++) {
            x = x * h;

        }
        return x;


    }


    //6.uzdevums
    public final boolean checkPinCode() {

        Scanner scanner1 = new Scanner(System.in);
        String userInput;
        System.out.println("Enter password");
        String password = "123";
        userInput = scanner1.nextLine();
        int i = 0;
        while (i < 3) {
            System.out.println("Enter password");

            if (userInput.equals(password)) {
                System.out.println("PIN accepted, welcome back");
            }
            i++;
        }
        System.out.println("Incorrect PIN, please try again");
        return false;
    }

}






