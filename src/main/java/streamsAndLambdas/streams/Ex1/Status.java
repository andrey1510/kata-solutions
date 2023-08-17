package streamsAndLambdas.streams.Ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@ToString
@AllArgsConstructor
public enum Status {
    ACTIVE("Active"), CLOSED("Closed"), FROZEN("Frozen");

    private final String status;

    // In Lombok:
//    Status(String status) {
//        this.status = status;
//    }
//
//    @Override
//    public String toString() {
//        return "Status{" +
//                "status='" + status + '\'' +
//                '}';
//    }
}
