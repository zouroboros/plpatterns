public class Cat extends Animal {
    private final boolean isDomestic;

    public Cat(String name, String species, boolean isDomestic) {
        super(name, species);
        this.isDomestic = isDomestic;
    }

    public boolean isDomestic() {
        return this.isDomestic;
    }

    public void accept(AnimalVisitor writer) {
        writer.visitAnimal(this);
    }


}