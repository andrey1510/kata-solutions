package codewars.level7

class SnaiCrawlsUpKotlin {

    companion object {
        @JvmStatic
        fun snail(column: Int, day: Int, night: Int): Int {

            var height = 0
            var daysPassed = 0

            while (height < column) {
                height += day
                daysPassed += 1
                if (height >= column) break
                height -= night
            }

            return daysPassed
        }
    }

}