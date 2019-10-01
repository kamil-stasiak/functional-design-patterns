package builder.dumb.usage;

import builder.dumb.Mail;

public class DumbBuilder {
    public static void main(String[] args) {
        Mail importantMail = Mail.builder()
                .to("person1@mail.com")
                .from("person2@mail.com")
                .subject("Important mail")
                .body("...")
                .build();

        System.out.println(importantMail);
    }
}
