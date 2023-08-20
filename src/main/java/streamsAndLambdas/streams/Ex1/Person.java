package streamsAndLambdas.streams.Ex1;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {

    private int personId;
    private String name;
    private Citizenship citizenship;
    private List<Account> accounts;

}
