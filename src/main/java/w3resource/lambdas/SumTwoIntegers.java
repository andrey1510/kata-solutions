package w3resource.lambdas;

public class SumTwoIntegers {

    public static int summarizeInts (int num1, int num2) {
        SumInts sumInts = (x, y) -> x + y;
        return sumInts.summarize(num1, num2);
    }

}

