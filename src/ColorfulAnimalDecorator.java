public class ColorfulAnimalDecorator extends AnimalDecorator {
    public ColorfulAnimalDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        setAnimalColor(decoratedAnimal);
    }

    private void setAnimalColor(Animal decoratedAnimal) {
        System.out.println("Animal color is white");
    }
}
