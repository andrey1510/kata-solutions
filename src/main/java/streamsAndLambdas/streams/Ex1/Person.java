package streamsAndLambdas.streams.Ex1;

import lombok.*;

import java.util.List;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Person {

    private int personId;
    private String name;
    private List<Account> accounts;

}
