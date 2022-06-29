package level7;

//https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

public class ValidatePIN {

    public static boolean validatePin(String pin) {
        boolean result = pin.length() != 4 && pin.length() != 6;
        //String[] s = String.valueOf(pin).split("").;


        if (pin.length() == 4 || pin.length() == 6) {
            for (String i : String.valueOf(pin).split("")) {
                if (pin.matches(("[0-9]"))) {
                    result = false;
                    break;
                }
            }

        } else {
            result = false;
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(ValidatePIN.validatePin("1232"));
    }


}
