package builder.safe.usage;

import builder.safe.MailFactory;
import builder.safe.Mail;

public class InnerBuilder {
    public static void main(String[] args) {
        Mail importantEmail = MailFactory.create(builder ->
                builder.setTo("to").setBody("body").setFrom("from").setSubject("subject"));

        System.out.println(importantEmail);

//        It is not possible to call builder outside the lambda
//        or assign builder to variable.
//        PrivateMail.PrivateMailBuilder() builder = ??? // how?
//        new PrivateMail.PrivateMailBuilder() // compilation error
//        PrivateMail.PrivateMailBuilder() // compilation error
//        We could use any kind of builder in lambda - simple, fluent, etc...
    }
}
