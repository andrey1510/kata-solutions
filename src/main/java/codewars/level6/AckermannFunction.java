package codewars.level6;

// https://www.codewars.com/kata/53ad69892a27079b34000bd9

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AckermannFunction {

    public static int Ackermann(int m, int n) {

        if (m == 0)
        {
            return n + 1;
        }
        else if((m > 0) && (n == 0))
        {
            return Ackermann(m - 1, 1);
        }
        else if((m > 0) && (n > 0))
        {
            return Ackermann(m - 1, Ackermann(m, n - 1));
        }else
            return 0;
    }

}

