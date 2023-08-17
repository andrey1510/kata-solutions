package streamsAndLambdas.streamsTests.ex1Tests;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import streamsAndLambdas.streams.Ex1.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ex1MethodsTests {

    Account account1 = new Account("1001", 100, Status.ACTIVE, new Bank("ThirdBank", "BNK634"));
    Account account2 = new Account("1002", 100, Status.ACTIVE, new Bank("SecondBank", "BNK333"));
    Account account3 = new Account("1003", 400, Status.CLOSED, new Bank("FourthBank", "BNK444666"));
    Account account4 = new Account("1004", 0, Status.ACTIVE, new Bank("FirstBank", "BNK2445"));
    Account account5 = new Account("1005", 200, Status.FROZEN, new Bank("ThirdBank", "BNK634"));
    Account account6 = new Account("1006", 600, Status.ACTIVE, new Bank("FirstBank", "BNK2445"));
    Account account7 = new Account("1007", 0, Status.CLOSED, new Bank("ThirdBank", "BNK634"));
    Account account8 = new Account("1008", 150, Status.FROZEN, new Bank("SecondBank", "BNK333"));

    Person person1 = new Person(1, "John", Arrays.asList(account1,account2));
    Person person1Low = new Person(1, "john", Arrays.asList(account1,account2));
    Person person2 = new Person(2, "Michael", Arrays.asList(account3,account4));
    Person person2Low = new Person(2, "michael", Arrays.asList(account3,account4));
    Person person3 = new Person(3, "Bill", Arrays.asList(account5,account6));
    Person person3Low = new Person(3, "bill", Arrays.asList(account5,account6));
    Person person4 = new Person(4, "Fred", Arrays.asList(account7,account8));
    Person person4Low = new Person(4, "fred", Arrays.asList(account7,account8));

    List<Person> persons = new ArrayList<>(Arrays.asList(person1,person2,person3,person4));
    List<Person> personsLowered = new ArrayList<>(Arrays.asList(person1Low,person2Low,person3Low,person4Low));

    List<Person> personsPart1 = new ArrayList<>(Arrays.asList(person1,person2));
    List<Person> personsPart2 = new ArrayList<>(Arrays.asList(person3,person4));
    List<List<Person>> nestedPersons = new ArrayList<>(Arrays.asList(personsPart1, personsPart2));

    @Test
    public void testFlattenNestedPersonsList() {
        Assertions.assertEquals(persons, Ex1Methods.flattenNestedPersonsList(nestedPersons));
    }

    @Test
    public void testConvertNamesToLowerCase() {

        Assertions.assertIterableEquals(personsLowered, Ex1Methods.convertNamesToLowerCase(persons));
    }

}
