package streamsAndLambdas.streams.Ex1;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Account {
    private String accountNumber;
    private Integer balance;
    private Status status;
    private Bank bank;
}
