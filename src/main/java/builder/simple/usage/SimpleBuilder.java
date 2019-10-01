package builder.simple.usage;

import builder.simple.Mail;

public class SimpleBuilder {
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
