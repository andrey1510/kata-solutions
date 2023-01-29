package codewars.level7;

public class SnaiCrawlsUp {
    public static int snail(int column, int day, int night) {
        int height = 0;
        int daysPassed = 0;

        while (height < column) {
            height = height + day;
            daysPassed += 1;
            if(height >= column) break;
            height = height - night;
        }

        System.out.println(daysPassed);
        return daysPassed;
    }

}

