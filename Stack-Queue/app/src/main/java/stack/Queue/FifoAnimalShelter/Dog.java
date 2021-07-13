package stack.Queue.FifoAnimalShelter;

public class Dog implements Animal{
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
