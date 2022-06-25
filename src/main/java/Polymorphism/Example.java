package Polymorphism;

public class Example {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10,5));
        System.out.println(calculator.add(10,5,10));
    }
}
