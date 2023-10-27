package leetcode.tests;

import leetcode.easy.LicenseKeyFormatting;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LicenseKeyFormattingTests {

    @Test
    public void licenseKeyFormattingTest() {

        LicenseKeyFormatting t = new LicenseKeyFormatting();
        Assertions.assertEquals("5F3Z-2E9W", t.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        Assertions.assertEquals("2-5G-3J", t.licenseKeyFormatting("2-5g-3-J", 2));
    }

}
