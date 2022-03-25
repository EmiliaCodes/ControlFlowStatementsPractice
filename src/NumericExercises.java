public class NumericExercises {
    /* This class contains of few methods in which each simple exercise is solved. For more information
    about the given task refer to the particular method. */


    public static boolean isPalindrome (int number){
        /* This method returns true if the number is palindrome, otherwise
         * it returns false. */

        if (number < 0) number *= -1;
        int original = number;
        int reverse = 0;

        /* Reversing the number */
        while (number > 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return original == reverse;
    }

    public static int sumFirstAndLastDigit (int number){
        /* This method finds the first and last digit of the given
         number and returns its sum. */

        int a = 5;
        if(number < 0) return -1;
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit > 9){
            firstDigit /= 10;
        }
        return (firstDigit + lastDigit);
    }

    public static int getGreatestCommonDivisor (int first, int second){
        /* This method is my implementation of Euclidean Algorithm
         * to find the greatest common divisor of two given numbers. */

        if(first < 10 || second < 10) return -1;
        while (true){
            int rest = first % second;
            if (rest == 0) {
                return second;
            }
            first = second;
            second = rest;
        }
    }

    public static void printFactors (int number){
        /* This method prints all the factors of the given number. */

        if (number < 1) System.out.println("Invalid Value");
        else {
            for (int i = 1; i <= number/2; i++){
                if ( number % i == 0) System.out.println(i);
            }
            System.out.println(number);
        }
    }
    public static boolean isPerfectNumber (int number) {
        /* This method returns true if the given number is a positive integer that is
         * equal to the sum of its proper divisors. */

        if (number < 1) return false;
        int sum = 0;
        for (int i = 1; i <= number/2; i++){
            if ( number % i == 0){
                sum += i;
            }
        }
        return number == sum;
    }
}
