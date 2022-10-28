package codewars.testsLevel4;

import codewars.level4.SumStringsAsNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumStringsAsNumbersTests {

    @Test
    void test() {
        assertEquals("467485254275908881126917981039351474021124379", SumStringsAsNumbers.sumStrings("87645363587649884564357475098909675648723", "467397608912321231242353623564252564345475656"));
    }

}
