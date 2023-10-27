package leetcode.easy;

public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {

        int count = 0;
        StringBuilder sb = new StringBuilder();
        String formattedString = s.replace("-", "").toUpperCase();

        for (int i = formattedString.length() - 1; i >= 0; i--) {
            sb.append(formattedString.charAt(i));
            count++;

            if (count == k && i != 0) {
                sb.append("-");
                count = 0;
            }
        }

        return sb.reverse().toString();
    }
}


