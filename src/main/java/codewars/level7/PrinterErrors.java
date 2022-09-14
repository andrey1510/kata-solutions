// https://www.codewars.com/kata/56541980fa08ab47a0000040

package codewars.level7;

public class PrinterErrors {

    /////////////////////////// Variant 1 /////////////////////////////////

    public static String printerError(String s) {
        long l = s.chars()
                .filter(e -> e > 'm')       // .filter(e -> e > 109)
                .count();
        return l + "/" + s.length();
    }

/////////////////////////// Community variant ////////////////////////////////////

    public static String printerError2(String s2) {
        return s2.replaceAll("[a-m]", "").length() + "/" + s2.length();
    }

}
