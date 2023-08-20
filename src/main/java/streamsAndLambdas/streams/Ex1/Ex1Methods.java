package streamsAndLambdas.streams.Ex1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

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
                        .citizenship(person.getCitizenship())
                        .build())
                .collect(Collectors.toList());
    }

    public static Map<Integer,String> convertNameToMap(List<Person> persons){
        return persons.stream()
                .collect(Collectors.toMap(Person::getPersonId, Person::getName));
        //      .collect(Collectors.toMap(e -> e.getPersonId(), e -> e.getName()));
    }

    public static Set<String> convertNameToSet(List<Person> persons){
        return persons.stream()
                .map(Person::getName)
                .collect(Collectors.toSet());

        //        .map(e -> e.getName())
    }

    public static Map<Citizenship, List<Person>> groupByCitizenship(List<Person> persons) {
        return persons.stream()
                .collect(groupingBy((Person::getCitizenship)));
    }

    public static List<Person> filterByCitizenship(List<Person> persons) {
         return persons.stream()
                .filter(person -> person.getAccounts().stream()
                        .anyMatch(account -> account.getStatus().equals(Status.FROZEN)))
                .collect(Collectors.toList());
    }


}
