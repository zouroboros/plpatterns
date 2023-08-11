import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.LinkedList;

public class BinaryFile implements InputFile {
    private Collection<Integer> numbers;

    public void read(Path filePath) throws IOException {
        var newNumbers = new LinkedList<Integer>();
        var bytes = Files.readAllBytes(filePath);
        
        var byteBuffer = ByteBuffer.wrap(bytes);
        
        while (byteBuffer.remaining() >= 4) {
            newNumbers.add(byteBuffer.getInt());
        }

        this.numbers = newNumbers;
    }

    public Collection<Integer> getNumbers() {
        return this.numbers;
    }
}