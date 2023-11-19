package other;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Jewels {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {

            String j = reader.readLine();
            String s = reader.readLine();

            writer.write(String.valueOf(countJewels(j, s)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static int countJewels(String j, String s) {
        int counter = 0;
        for (char c : s.toCharArray()) {
            if (j.contains(String.valueOf(c))) {
                counter++;
            }
        }
        return counter;
    }

    protected static int countJewelsAlt(String j, String s) {
        return Pattern.compile("[^" + j + "]").matcher(s).replaceAll("").length();
    }

}

