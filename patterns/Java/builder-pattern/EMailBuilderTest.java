public class EMailBuilderTest {
    public static void main(String[] args) {
        var email = new EMailBuilder()
            .addRecipient("recipientA@example.org")
            .addCCRecipient("recipientB@example.org")
            .addBCCRecipient("recipientC@example.org")
            .setSubject("Information")
            .addText("This is new information")
            .addHtml("This is new information")
            .email();
    }
}