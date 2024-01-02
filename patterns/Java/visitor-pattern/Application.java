import java.util.List;

public class Application {
    public static void main(String ...args) {
        var cat = new Cat("Felix", "Felis", true);
        var horse = new Horse("Tommy", "Mustang", "brown");
        var animals = List.of(cat, horse);

        var animalWriter = new SimpleConsoleWriter();
        var animalVisitor = new ConsoleWriter();
        
        animals.stream().forEach(animal -> animal.save(animalWriter));
        animals.stream().forEach(animal -> animal.accept(animalVisitor));
    }
}