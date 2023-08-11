import java.nio.file.Path;

public class InputFileFactory {
    public static InputFile getInputFleForFile(Path filePath) {
        var fileName = filePath.getFileName().toString();
        if (fileName.endsWith(".txt")) {
            return new TextFile();
        } else if (fileName.endsWith(".bin")) {
            return new BinaryFile();
        }

        throw new IllegalArgumentException("Unsupported file " + filePath);
    }
}