package ya;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class DataCenters {

    public static void calculate() throws IOException {

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new  FileWriter("output.txt",true);

        int n = sc.nextInt(); // число дата-центров
        int m = sc.nextInt(); // число серверов в каждом из дата-центров
        int q = sc.nextInt(); // число событий

        int[] r = new int[n]; // число перезапусков i дата-центра
        int[] a = new int[n]; // число рабочих (не выключенных) серверов в i дата-центре

        Arrays.fill(a, m);

        for (int i = 0; i < q; i++) {
            String event = sc.next();
            switch (event) {
                case "RESET": {
                    int center = sc.nextInt() - 1;
                    r[center]++;
                    break;
                }
                case "DISABLE": {
                    int center = sc.nextInt() - 1;
                    int server = sc.nextInt() - 1;
                    a[center]--;
                    break;
                }
                case "GETMAX":
                    int tempMax = -1;
                    int resultMax = -1;
                    for (int j = 0; j < n; j++) {
                        int temp = r[j] * a[j];
                        if (temp > tempMax) {
                            tempMax = temp;
                            resultMax = j + 1;
                        }
                    }
                    fw.write(resultMax + System.lineSeparator());
                    //System.out.println(resultMax);
                    break;
                case "GETMIN":
                    int tempMin = Integer.MAX_VALUE;
                    int resultMin = -1;
                    for (int j = 0; j < n; j++) {
                        int temp = r[j] * a[j];
                        if (temp < tempMin) {
                            tempMin = temp;
                            resultMin = j + 1;
                        }
                    }
                    fw.write(resultMin + System.lineSeparator());
                   // System.out.println(resultMin);
                    break;
            }
        }
        sc.close();
        fw.close();

    }

    public static void main(String[] args) {

        try {
            calculate();
        } catch (IOException e) {
            System.out.println("IO error");
        }

    }
}


//3 3 12
//        DISABLE 1 2
//        DISABLE 2 1
//        DISABLE 3 3
//        GETMAX
//        RESET 1
//        RESET 2
//        DISABLE 1 2
//        DISABLE 1 3
//        DISABLE 2 2
//        GETMAX
//        RESET 3
//        GETMIN
//
//        1
//        2
//        1
//
//
//        2 3 9
//        DISABLE 1 1
//        DISABLE 2 2
//        RESET 2
//        DISABLE 2 1
//        DISABLE 2 3
//        RESET 1
//        GETMAX
//        DISABLE 2 1
//        GETMIN
//
//        1
//        2