package OOP_0;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        AnimalWorld.getAnimalVoice(cat);
        AnimalWorld.getAnimalVoice(dog);
        AnimalWorld.getAnimalVoice();
        Zoopark.getAnimalVoice(cat);
    }
}