public class ConsoleWriter implements AnimalVisitor {
    
    public void visitAnimal(Horse horse) {
        System.out.println(horse.getName());
        System.out.println(horse.getSpecies());
        System.out.println(horse.getTailColor());
    }

    public void visitAnimal(Cat cat) {
        System.out.println(cat.getName());
        System.out.println(cat.getSpecies());
        System.out.println(cat.isDomestic());
    }
}