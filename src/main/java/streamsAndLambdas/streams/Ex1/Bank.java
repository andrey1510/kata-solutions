package streamsAndLambdas.streams.Ex1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Bank {

    private String bankTitle;
    private String bankNumber;

}
