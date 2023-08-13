public class Horse extends Animal {
    private final String tailColor;

    public Horse(String name, String species, String tailColor) {
        super(name, species);
        this.tailColor = tailColor;
    }

    public String getTailColor() {
        return this.tailColor;
    }

    public void accept(AnimalVisitor writer) {
        writer.visitAnimal(this);
    }
}