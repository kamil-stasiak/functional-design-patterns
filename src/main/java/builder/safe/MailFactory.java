package builder.safe;

import java.util.function.Function;

public class MailFactory {

    private MailFactory() {
    }

    public static Mail create(Function<Mail.MailBuilder, Mail.MailBuilder> function) {
        return function.apply(new Mail.MailBuilder()).build();
    }
}
