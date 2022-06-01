package Classroom;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] dayOfTheWeek = {1, 2, 3, 4, 5, 6, 7};
        System.out.print(dayOfTheWeek.length);
        // [0] = 1
        // [1] = 2
        //...[6] = 7
        //Length = 7
        System.out.print(dayOfTheWeek[6]);


        String[] nameOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursda", "Friday", "Saturday", "Sunday"};
        System.out.print("Today is : " + nameOfTheWeek[0]);

        Random random = new Random();
        System.out.println(random.nextInt(100));

        int[] randomNumbers = {random.nextInt(100), random.nextInt(100), random.nextInt(100)};
        System.out.println(randomNumbers);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nikita");
        stringBuilder.append("Milka");
        System.out.println(stringBuilder);

        List<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("apple");
        listOfFruits.add("kiwi");
        listOfFruits.add("cherry");
        System.out.println(listOfFruits);

        int[] arr = {2, 11, 45, 9};
        int number = 0;
        while (number < 4) {
            System.out.println(arr[number]);
            number++;
        }

        //print out the even numbers from 0 to 10;
        //   i % 2 == 0;
        number = 0;
        while (number <= 10) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;

            //print out the even numbers from 0 to 5;
            //18-65
            int age = 18;
            do {
                System.out.println(age + ", ");
                age++;
            } while (age <= 65);

            number = 0;
            while (number <= 10) {
                if (number % 2 == 0) { //lai būtu pāra skaitļi
                    System.out.println(number);
                }
                number++;
            }
               /*number = 18;
                do {
                    if (number % 2 == 0) {
                        System.out.println(number);

                    } number++;
                   } while (number <= 65) ;

                }*/

            for (int x = 1; x <= 10; x++) {
                System.out.println(x);
            }
            System.out.print("");

            //Print in one line numbers from 20 to 0 (for)

        }
        for (int x = 20; x >= 0; x--) {
            System.out.print(x + ", ");//lai būtu atstarpe ar komatu
        }
        System.out.print("");

        System.out.println();

        //for cikls

        String[] countries = new String[]{"Latvia", "Canada", "USA", "Estonia"};
        for (int j = 0; j < countries.length; j++) {
            System.out.println(countries[j]);

        }
        //for each cikls
        for (String country : countries) {
            System.out.println(country);
        }

        //create int array with numbers from 0 to 100
        //print numbers that are > than 50
        int[] numArray = new int[101];
        for (int x = 0; x < numArray.length; x++) {
            numArray[x] = x;
        }
        for (int j = 0; j < numArray.length; j++) {
            int i = numArray[j];
            if (i >= 50) {
                System.out.println(i);
            }
        }

    }
}
