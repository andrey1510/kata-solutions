package codewars.testsLevel4;

import codewars.level4.StripComments;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StripCommentsTests {

    @Test
    public void testStripComments() throws Exception {
        assertEquals("line1, no comment\nline2\nline3\nline4", StripComments.stripComments("line1, no comment\nline2$comment\nline3# comment\nline4! comment - comment", new String[]{"#","!","$"}));
        assertEquals(" line1\n line2, no comment\n line3", StripComments.stripComments(" line1 & comment \n line2, no comment \n line3 # comment", new String[]{"#", "&"}));
    }

    @Test
    public void testStripComments2() throws Exception {
        assertEquals("line1, no comment\nline2\nline3\nline4", StripComments.stripComments("line1, no comment\nline2$comment\nline3# comment\nline4! comment - comment", new String[]{"#","!","$"}));
        assertEquals(" line1\n line2, no comment\n line3", StripComments.stripComments(" line1 & comment \n line2, no comment \n line3 # comment", new String[]{"#", "&"}));
    }

}
