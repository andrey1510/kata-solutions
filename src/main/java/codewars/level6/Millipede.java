package codewars.level6;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static codewars.level6.Millipede.check;
import static org.junit.jupiter.api.Assertions.*;

public class Millipede {
    public static boolean check(String[] millipede) {

        Set<String> words = new HashSet<>();
        words.add(millipede[0]);

        for (int i = 1; i < millipede.length; i++) {
            boolean matchExist = false;
            for (String word : millipede) {
                if (!words.contains(word) && word.charAt(0) == millipede[i-1].charAt(millipede[i-1].length()-1)) {
                    words.add(word);
                    matchExist = true;
                    break;
                }
            }
            if (!matchExist) {
                return false;
            }
        }
        return true;
    }

}

class MillipedeTests {

    @Test
    public void checkTest() {
        String[] messageTrue = new String[]{"excavate", "endure", "desire", "screen", "theater", "excess", "night"};
        String[] messageFalse = new String[]{"trade", "pole", "view", "grave", "ladder", "mushroom", "president"};
        assertFalse(check(messageFalse), String.join(", ", messageFalse));
        assertTrue(check(messageTrue), String.join(", ", messageTrue));

    }
}

