package Classroom;

public class PezDispenser {
    String name;
    int capacity;
    int currentCandyCount;

    public PezDispenser(String name) {
        this.name = name;
        capacity = 20;
        currentCandyCount = 20;

    }

    public void eat() {
        if (currentCandyCount <= 0) {
            System.out.println("I cant easr, please load me");
        } else {
            currentCandyCount--;
            System.out.println("I ate one pez!");
        }

    }


    public void load() {
        currentCandyCount = capacity;
        System.out.println("I am loaded");
    }
}
