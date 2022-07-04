package Homework.oop_homework;
import java.util.List;
import java.util.Scanner;


public class DiscountRate {
    public static void main(String[] arg) {

        int visitPrice = 50;
        int productPrice = 40;
        Scanner scanner = new Scanner(System.in);
        String customerType;
        String customerType1 = "premium";
        String customerType2 = "gold";
        String customerType3 = "silver";
        System.out.println("Beauty Salon services");
        System.out.println("Enter customer type:");
        customerType = scanner.nextLine();



        if (customerType1.equals("premium")) {
            System.out.println("Get 20% discount");
        } else if (customerType2.equals("gold")) {
            System.out.println("Get 15% discount");
        } else if (customerType3.equals("silver")) {
            System.out.println("Get 10% discount");
        } else {
            System.out.println("No discount");
        }

    }

}




