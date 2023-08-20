package streamsAndLambdas.streams.Ex1;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public enum Citizenship {
    AUSTRALIA("Australia"), BRAZIL("Brazil"), IRELAND("Ireland");

    private final String citizenship;
}
