package codewars.level6;

public class FindOutlier {

    private static boolean even_or_odd(int number) {
        return number % 2 == 0;
    }

    static int find(int[] integers){

        boolean evenArr = (even_or_odd(integers[0]) && even_or_odd(integers[1])) || (even_or_odd(integers[1]) && even_or_odd(integers[2]));

        int outlier = 0;

        if (evenArr) {
            for (int integer : integers) {
                if (!even_or_odd(integer)) outlier = integer;
            }
        } else {
            for (int integer : integers) {
                if (even_or_odd(integer)) outlier = integer;
            }
        }

        return outlier;
    }

}


//
//    // Since we are warned the array may be very large, we should avoid counting values any more than we need to.
//
//    // We only need the first 3 integers to determine whether we are chasing odds or evens.
//    // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
//    // It will be 0 for even numbers and 1 for odd numbers.
//    // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
//    int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
//    int mod = (sum == 0 || sum == 1) ? 1 : 0;
//
//        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
//                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
//                }
