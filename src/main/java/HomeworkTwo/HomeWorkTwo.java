package HomeworkTwo;
import java.util.Scanner;

import javax.naming.Name;
import javax.print.attribute.IntegerSyntax;
import javax.xml.namespace.QName;

public class HomeWorkTwo {
    public static void main(String[] args) {

        //1. uzdevums
        int x = 4;
        System.out.println(x > 3);

        int y = 3;
        System.out.println(y > 5);

        int k = 6;
        System.out.println(k > 5 && k <= 10);

        int l = 6;
        System.out.println(!(l <= 5 && x < 10));

        int a = 3;
        System.out.println(a == 0 || a == 10);

        int b = 3;
        System.out.println((x * x) > 10);

        System.out.println();

        //2. uzdevums
        Scanner scanner = new Scanner(System.in);
        String months;
        System.out.println("Enter the number of months");
        months = scanner.nextLine();
        int month = 4;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        System.out.println();

        //3.uzdevums
        double p1 = 5, p2 = 6, p3 = 7;
        if (p1 >= p2 && p1 >= p3)
            System.out.println(p1 + " is the largest number.");
        else if (p2 >= p1 && p2 >= p3)
            System.out.println(p2 + " is the largest number.");
        else
            System.out.println(p3 + " is the largest number.");

        System.out.println();

        //4.uzdevums
        Scanner scanner1 = new Scanner(System.in);
        String light;
        System.out.println("Enter the color of traffic light");
        light = scanner1.nextLine();
        String krasa = "Red";
        String krasa1 = "Yellow";
        String krasa3 = "Green";
        if (krasa3.equals("Green")) {
            System.out.println("is allowed to cross the street");
        } else if (krasa1.equals("Yellow")) {
            System.out.println("be prepared, we will soon be able to cross the street");
        } else if (krasa.equals("Red")) {
            System.out.println("it is forbidden to cross the street");
        }

        System.out.println();

    }


    //5.uzdevums
    void printBusinessCard() {
        String title = "Vizītkarte";
        System.out.println(title);
        System.out.println(" ######## ");
        String name = "Marina";
        System.out.println("Vārds: " + name);
        String surname = "Čelika";
        System.out.println("Uzvārds: " + surname);
        String phone = "+371 26882635";
        System.out.println("Telefona numurs: " + phone);
        String birth = "1987";
        System.out.println("Dzimšanas gads: " + birth);
        System.out.println(" ######## ");
        String title1 = "Vizītkarte";
        System.out.println(title1);
        System.out.println(" ######## ");
        String name1 = "Marina";
        System.out.println("Vārds: " + name1);
        String surname1 = "Čelika";
        System.out.println("Uzvārds: " + surname1);
        String phone1 = "+371 26882635";
        System.out.println("Telefona numurs: " + phone1);
        String birth1 = "1987";
        System.out.println("Dzimšanas gads: " + birth1);
        System.out.println(" ######## ");
        String title2 = "Vizītkarte";
        System.out.println(title2);
        System.out.println(" ######## ");
        String name2 = "Marina";
        System.out.println("Vārds: " + name2);
        String surname2 = "Čelika";
        System.out.println("Uzvārds: " + surname2);
        String phone2 = "+371 26882635";
        System.out.println("Telefona numurs: " + phone2);
        String birth2 = "1987";
        System.out.println("Dzimšanas gads: " + birth2);
        System.out.println(" ######## ");

        System.out.println();

    }
    //6.uzdevums

    void printBusinessCardTwo() {

        String name = "Marina";
        String surname = "Čelika";
        int phoneNumber = 26882635;
        int dateOfBirth = 1987;

        System.out.print("Vizītkarte " + name + surname + "+371 " + phoneNumber + dateOfBirth);

    }

    //7. uzdevums
    public static int sum(int a, int b) {
        int result = a + b;
        return result;


    }
        //8.uzdevums
        public static int average(int a, int b, int c){
            int average = (a+b+c)/3;
            return average;

                    }



}







