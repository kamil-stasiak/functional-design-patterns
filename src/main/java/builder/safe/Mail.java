package builder.safe;

import lombok.ToString;

@ToString
public class Mail {
    String to;
    String from;
    String subject;
    String body;

    Mail() {}

    // TODO try override lombok
    public static class MailBuilder {
        String to;
        String from;
        String subject;
        String body;

        MailBuilder() {}

        Mail build() {
            Mail mail = new Mail();
            mail.body = this.body;
            mail.from = this.from;
            mail.to = this.to;
            mail.subject = this.subject;
            return mail;
        }


        public MailBuilder setTo(String to) {
            this.to = to;
            return this;
        }

        public MailBuilder setFrom(String from) {
            this.from = from;
            return this;
        }

        public MailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public MailBuilder setBody(String body) {
            this.body = body;
            return this;
        }
    }
}
