package builder.dumb;

import lombok.*;

@Builder
@ToString
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Mail {
    private String to;
    private String from;
    private String subject;
    private String body;
}
