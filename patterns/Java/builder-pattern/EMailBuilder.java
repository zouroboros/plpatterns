import java.util.Collection;
import java.util.LinkedList;

public class EMailBuilder {
    private final Collection<String> recipients;

    private final Collection<String> ccRecipients;

    private final Collection<String> bccRecipients;

    private String subject;

    private final StringBuilder textContent;

    private final StringBuilder htmlContent;

    public EMailBuilder() {
        recipients = new LinkedList<String>();
        ccRecipients = new LinkedList<String>();
        bccRecipients = new LinkedList<String>();
        subject = "";
        textContent = new StringBuilder();
        htmlContent = new StringBuilder();
    }

    public EMailBuilder addRecipient(String recipient) {
        recipients.add(recipient);
        return this;
    }

    public EMailBuilder addCCRecipient(String ccRecipient) {
        ccRecipients.add(ccRecipient);
        return this;
    }

    public EMailBuilder addBCCRecipient(String bccRecipient) {
        bccRecipients.add(bccRecipient);
        return this;
    }

    public EMailBuilder setSubject(String newSubject) {
        subject = newSubject;
        return this;
    }

    public EMailBuilder addText(String text) {
        textContent.append(text);
        return this;
    }

    public EMailBuilder addHtml(String html) {
        htmlContent.append(html);
        return this;
    }

    public EMail email() {
        return new EMail(recipients, ccRecipients, bccRecipients, subject, 
            textContent.toString(), htmlContent.toString());
    }
}