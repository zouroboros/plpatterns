import java.util.Arrays;

public class StaticSingleton {
    public static final StaticSingleton INSTANCE = new StaticSingleton();

    private final String[] values = {
        "English", "Words"
    };

    public void printValues() {
        System.out.println(Arrays.toString(this.values));
    }
}