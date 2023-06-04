import java.util.List;

public class EMailTest {
    public static void main(String[] args) {
        var email = new EMail(List.of("reciepientA@exampe.org"), 
            List.of("recipientB@example.org"), 
            List.of("recipientC@example.org"),
            "Information",
            "This is new information",
            "This is new information");
    }
}