public abstract class Animal {
    private final String name;
    private final String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public void save(AnimalWriter writer) {
        writer.writeAnimal(this);
    }

    public abstract void accept(AnimalVisitor visitor);
}