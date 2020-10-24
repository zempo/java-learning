package dogs;

public class Main {
    public static void main(String[] args) {
        System.out.println(Dog.bark); // displays woof

        Dog rocky;
        rocky = new Dog("Pitbull", 10, "Dark Brown");
        Dog lucy = new Dog("Chihuahua", 3, "Auburn");
        rocky.bark = "Wooof Woof, Adrian";
        System.out.println(rocky.bark);
        rocky.calcDogYears("Rocky");

        System.out.println(rocky); // displays dogs.Dog@1517365b
        System.out.println(rocky.getAge()); // displays 10

        lucy.setBreed("mutt");
        System.out.println(lucy.getBreed()); // displays new, mutated mutt

        Dog limited = new Dog("Black");
        System.out.println(limited.getAge()); // displays default of 1

        Dog aDog = new Dog();
        System.out.println(aDog.getBreed()); // displays null
        aDog.setBreed("Beagles");
        System.out.println(aDog.getBreed()); // displays Beagles
    }
}
