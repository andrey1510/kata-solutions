package codewars.level6;

//https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

public class WhoLikesIt {

    ///////////////// Variant 1 //////////////////////

    public static String whoLikesIt(String... names) {
        String s;
        switch(names.length){
            case 0: s = "no one likes this";
                break;
            case 1: s = String.format("%s likes this", names[0]);
                break;
            case 2: s = String.format("%s and %s like this", names[0], names[1]);
                break;
            case 3: s = String.format("%s, %s and %s like this", names[0], names[1], names[2]);
                break;
            default: s = String.format("%s, %s and %d others like this", names[0], names[1], names.length-2);
        }
        return s;
    }

    ////////////////////// Variant 1+ ///////////////////////////

    public static String whoLikesIt2(String... names2) {
        switch(names2.length){
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names2[0]);
            case 2: return String.format("%s and %s like this", names2[0], names2[1]);
            case 3: return String.format("%s, %s and %s like this", names2[0], names2[1], names2[2]);
            default: return String.format("%s, %s and %d others like this", names2[0], names2[1], names2.length-2);
        }
    }

}
