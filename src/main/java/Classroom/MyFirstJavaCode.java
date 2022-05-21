package Classroom;

import java.io.PrintStream;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        //one line comment
        /*
        multi line comment
         */
        //byte data type
        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors\n" , floorCount);

        //%d - numbers
        //%s - text, spring
        //%b - boolean
        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1200);

        System.out.printf("Average salary for Junior QA Engineer:%d\n" ,salaryInEur);

        int chinaPopulation = 1449687399;
        long currentWorldPopulation = 794609700;
        System.out.printf("Current word population: %d people", currentWorldPopulation);

        //floating numbers
        float myCurrentWeight = 70.6f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.8652;
        System.out.println(gasPriceInEur);

        //primitive text
        char firstLettersOfMyName = 'M';
    }
}
