package Classroom;

public class AnimalPractice {
    public static void main (String[] args){
        Animal justRegularAnimal = new Animal();
        justRegularAnimal.name = "Unknown Animal";
        justRegularAnimal.voice();

        Dog rex = new Dog();
        rex.canProtectHouse = true;
        rex.voice();
    }
}
