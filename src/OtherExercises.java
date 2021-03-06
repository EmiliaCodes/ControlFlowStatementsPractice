public class OtherExercises {
/*    This class contains methods which didn't fit by topic to any other class. */

    public static boolean canPack (int bigCount, int smallCount, int goal){
        /* Arguments of this method are counts of bags of flour - bigCount is a count of
        * 5 kg bags of flour, and smallCount is a count of 1 kg bags. Method returns true
        * if it is possible to get goal amount of flour using only whole bags of flour that
        * are available.  */

        /* 1. Check if goal < (bigCount * 5 + smallCount)
        *  2. Check if goal % (bigCount * 5) == 0 (!!! bigCount cannot be <= 0 or exception will emerge)
        *  3. If 2. is false, try (goal % 5) - smallCount <= 0 */

        if (bigCount < 0 || smallCount < 0 || goal <= 0) return false;
        if (goal <= (bigCount * 5 + smallCount)) {
            if (bigCount != 0 && goal % (bigCount * 5) == 0) {
                return true;
            } else {
                return ((goal % 5) - smallCount <= 0);
            }
        } else {
            return false;
        }
    }

    public static void printSquareStar (int number){
        /* This method prints diagonals to generate a rectangular pattern composed of
        * stars (*). The star is printed based on four conditions:
        * 1) Is it first or last row?
        * 2) Is it first or last column?
        * 3) If the row number equal to the column number?
        * 4) Does the column number equals to rowCount - currentRow + 1? */

        if (number < 5) System.out.println("Invalid Value");
        else {
            for (int currentRow = 1; currentRow <= number; currentRow++){
               for (int currentColumn = 1; currentColumn <= number; currentColumn++){
                   if (currentRow == 1 || currentRow == number) {
                       System.out.print("*");
                   } else if (currentColumn == 1 || currentColumn == number){
                       System.out.print("*");
                   } else if (currentColumn == currentRow) {
                       System.out.print("*");
                   } else if (currentColumn == (number - currentRow + 1)){
                       System.out.print("*");
                   } else {
                       System.out.print(" ");
                   }
                   // breaking the line
                   if (currentColumn == number){
                       System.out.println();
                   }
               }
            }
        }
    }


}
