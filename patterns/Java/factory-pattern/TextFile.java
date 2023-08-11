import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;

public class TextFile implements InputFile {
    private Collection<Integer> numbers;

    public void read(Path filePath) throws IOException {
        try (var lines = Files.lines(filePath)) {
            this.numbers = lines.map(Integer::parseInt).toList();
        }
    }

    public Collection<Integer> getNumbers() {
        return numbers;
    }
}