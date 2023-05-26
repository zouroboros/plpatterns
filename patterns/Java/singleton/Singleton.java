import java.util.Arrays;

public enum Singleton {
    INSTANCE;

    private final String[] values = {
        "English", "Words"
    };

    public void printValues() {
        System.out.println(Arrays.toString(this.values));
    }
}