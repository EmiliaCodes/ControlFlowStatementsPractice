public class NumberToWords {

    /* This class contains a few methods, which aim to print the given number digit by
     * digit with words. */

    public static void numberToWords (int number) {
        int count = getDigitCount(number);
        number = reverse(number);

        int secondCount = 0;
        while (number > 0){
            int temp = number % 10;
            switch (temp) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
            }
            number /= 10;
            secondCount++;
        }
        while (secondCount != count) {
            System.out.println("Zero");
            secondCount++;
        }
    }

    public static int getDigitCount (int number) {
        /* This method returns how many digits are there in the given number. */

        if (number < 0) return -1;
        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }

    public static int reverse (int number){
        /* This method returns a revered number. */

        int temp = number;
        if (number < 0 ) temp *= -1;

        int reverse = 0;
        while (temp > 0){
            reverse *= 10;
            reverse += temp % 10;
            temp /= 10;
        }

        if (number < 0) reverse *= -1;
        return reverse;
    }

}
