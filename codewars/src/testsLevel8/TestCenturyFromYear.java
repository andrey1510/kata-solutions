package testsLevel8;

import level8.CenturyFromYear;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCenturyFromYear {

    @Test
    public void testCenturyFromYear() {
        assertEquals(400, CenturyFromYear.century(40000));
        assertEquals(19, CenturyFromYear.century(1899));
        assertEquals(19, CenturyFromYear.century(1900));
        assertEquals(20, CenturyFromYear.century(1901));
        assertEquals(2, CenturyFromYear.century(101));
        assertEquals(1, CenturyFromYear.century(44));
        assertEquals(1, CenturyFromYear.century(1));
    }

}
