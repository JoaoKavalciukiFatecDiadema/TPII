public class Main {
    public static void main(String[] args) {
        DogFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        CatFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();

        dog.makeSound();
        cat.makeSound();
    }
}