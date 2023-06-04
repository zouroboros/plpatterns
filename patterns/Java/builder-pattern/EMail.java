import java.util.Collection;

public record EMail(Collection<String> recipients, 
    Collection<String> ccRecipients, 
    Collection<String> bccRecipients,
    String subject,
    String textContent,
    String htmlContent) {
}