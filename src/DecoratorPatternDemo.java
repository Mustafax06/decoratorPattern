public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Animal colorfulCat = new ColorfulAnimalDecorator(new Cat());
        Animal colorfulDog = new ColorfulAnimalDecorator(new Dog());
        System.out.println("Dog is barking");
        colorfulDog.makeSound();
        System.out.println("\n");
        System.out.println("Cat is meowing");
        colorfulCat.makeSound();
    }
}
