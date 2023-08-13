public interface AnimalVisitor {
    void visitAnimal(Cat cat);
    void visitAnimal(Horse horse);
}