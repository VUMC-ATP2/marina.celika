package HomeworkTwo;
import java.util.Scanner;

import javax.naming.Name;
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
        System.out.println("Enter the number of month");
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
        String krasa = "Sarkana";
        String krasa1 = "Dzeltena";
        String krasa3 = "Zaļa";
        if (krasa3.equals("Zaļa")) {
            System.out.println("ir atļauts šķērsot ielu");
        } else if (krasa1.equals("dzeltena")) {
            System.out.println("jāsagatavojas, drīz varēsim šķērsot ielu");
        } else if (krasa.equals("sarkana")) {
            System.out.println(" ir aizliegts šķērsot ielu");
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
    public static void sum(String[] args) {
        Scanner summa = new Scanner(System.in);
        System.out.println("Enter the number А = ");
        int a = summa.nextInt();
        System.out.println("Enter the number = ");
        int b = summa.nextInt();
        System.out.println("Sum = " + (a + b));
    }
        //8.uzdevums
        public static void Average(String[] args){
            Scanner average = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double number1 = average.nextDouble();
            System.out.print("Enter second number: ");
            double number2 = average.nextDouble();
            System.out.print("Enter third number: ");
            double number3 = average.nextDouble();
            System.out.print("The average is: " + ((number1 + number2 + number3)/3));
        }



}







