package streamsAndLambdas.streams.Ex1;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1Methods {

    public static List<Person> flattenNestedPersonsList(List<List<Person>> nestedList) {
        return nestedList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

    }

    public static List<Person> convertNamesToLowerCase(List<Person> persons)  {
        return persons.stream()
                .map(person -> Person.builder()
                        .personId(person.getPersonId())
                        .name(person.getName().toLowerCase())
                        .accounts(person.getAccounts())
                        .build())
                .collect(Collectors.toList());
    }


}
