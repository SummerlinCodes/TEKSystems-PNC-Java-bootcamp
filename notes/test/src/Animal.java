
public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        if (!isValidAge(age)) {
            throw new IllegalArgumentException("Age must be between 0 and 100");
        }
        this.name = name;
        this.age = age;
    }

    // Ex: Access modifier (Public or Private)
    public void makeSound() {
        System.out.println("Animal sound");
    }

    private boolean isValidAge(int age) {
        if (age >= 0 && age <= 100) return true;
        return false;
    }

    public static int getNumberofAnimals() {
        return Animal.NumberofAnimals;
    }
}