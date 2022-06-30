package level7;

//https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

import java.util.Arrays;

public class ValidatePIN {

    public static boolean validatePin(String pin) {
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        return Arrays.stream(pin.split(""))
                .filter(e -> !e.matches(("[0-9]")))
                .toArray().length == 0;
    }
}
