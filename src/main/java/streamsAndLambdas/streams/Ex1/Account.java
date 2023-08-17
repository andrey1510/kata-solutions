package streamsAndLambdas.streams.Ex1;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Account {
    String accountNumber;
    Integer balance;
    Status status;
    Bank Bank;
}
