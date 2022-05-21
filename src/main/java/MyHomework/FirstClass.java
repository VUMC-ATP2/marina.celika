package MyHomework;

import sun.util.resources.cldr.ee.CurrencyNames_ee;

public class FirstClass {

    public static void main(String[] args) {

        String country = "Spain";
        System.out.println("The country I love so much- " + country);

        int Population = 47450795;
        System.out.println ("In Spain there are " + Population + " people living");

        float area = 505.990f;
        System.out.println("Area of Spain in total is " + area + " km2");

        String capitalCity = "Madrid";
        String language = "Spanish";
        System.out.println("The capital city of Spain is "+ capitalCity + " and the official language is " + language);

        boolean isEsMember = true;
        boolean notEsMember = false;
        if (isEsMember) {
            System.out.println("Yes, Spain is ES member");
        } else {
            System.out.println("No, Spain is not ES member");
        }

        String currency = "&" ;
        System.out.println("The currency in Spain is " + currency + " (EUR)");

        int a = 53;
        int b = 55;
        int c = 100;
        int d = (a+b)*100;
        System.out.println(d);

        int v = 53;
        int f = 2;
        int e = (v-f) % 100;
        System.out.println(e);

        int k = 5;
        int l = 5;
        int u = k/l;
        System.out.println(u);
        System.out.println(u+(k+l));

    }
}
