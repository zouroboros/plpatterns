import java.io.IOException;
import java.util.Collection;
import java.nio.file.Path;

public interface InputFile {
    void read(Path filePath) throws IOException;

    Collection<Integer> getNumbers();
}