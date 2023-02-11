import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Sparky", 3, "M", 15, "Sheppherd");

        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
       dog.setAge(-2);
        System.out.println(dog.getAge());





    }
}