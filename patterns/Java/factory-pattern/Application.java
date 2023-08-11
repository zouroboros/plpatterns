import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;

public class Application {
    public static void main(String ...args) throws IOException {
        for (var file : args) {
            var filePath = Path.of(file);
            var inputFile = InputFileFactory.getInputFleForFile(filePath);
            
            inputFile.read(filePath);
            
            printNumbers(inputFile.getNumbers());
        }
    }

    public static void printNumbers(Collection<Integer> numbers) {
        for (var number : numbers) {
            System.out.println(number);
        }
    }
}