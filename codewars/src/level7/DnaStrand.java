package level7;

//https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java

public class DnaStrand {
    public static String makeComplement(String dna) {
        return dna.replaceAll("T", "x").replaceAll("A", "T").replaceAll("x", "A").replaceAll("G", "y").replaceAll("C", "G").replaceAll("y", "C");
    }
}
