public class SimpleConsoleWriter implements AnimalWriter {
    public void writeAnimal(Animal animal) {
        System.out.println(animal.getName());
        System.out.println(animal.getSpecies());
    }
}