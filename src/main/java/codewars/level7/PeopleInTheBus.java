// https://www.codewars.com/kata/5648b12ce68d9daa6b000099

package codewars.level7;

import java.util.*;
import java.util.stream.Collectors;

public class PeopleInTheBus {

    public static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .collect(Collectors.toMap(stops::indexOf, e -> (Integer)e[0]-e[1]))
                .values()
                .stream()
                .reduce(0, Integer::sum);
    }

    ////////////// Community variant ////////////////

    public static int countPassengers2(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
    }
}
