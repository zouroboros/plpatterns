import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadString {
    public static void main(String ...args) throws IOException {
        var fileContent = Files.readString(Path.of("fileToRead"));
        System.out.println(fileContent);
    }
}