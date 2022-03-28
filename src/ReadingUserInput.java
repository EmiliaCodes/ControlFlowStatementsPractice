import java.util.Objects;
import java.util.Scanner;

public class ReadingUserInput {
    public static void minAndMaxFromInput(){
        /* This method reads integers from the console (entered by the user) and prints minimum and
        * maximum number in that set. You can enter unlimited number of integers - if you want to
        * see the results you need to press f. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers, I will tell you the minimum and maximum out of your set. \n" +
                "After you finish, press 'f' to finish input.");

        int counter = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(true) {
            System.out.println("Enter number #" + counter + " or press 'f' and enter to finish.");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int inputNumber = scanner.nextInt();
                if (min > inputNumber) min = inputNumber;
                if (max < inputNumber) max = inputNumber;
                counter ++;
            } else {
                String inputString = scanner.next();
                if (Objects.equals(inputString, "f")){
                    break;
                } else {
                    System.out.println("Invalid number or command.");
                }
            }
            scanner.nextLine();
        }
        scanner.close();
        if (min == Integer.MAX_VALUE) {
            System.out.println("You didn't enter any numbers.");
        } else {
            System.out.println("Your minimum number is " + min + ", and your maximum is " + max + ".");
        }
    }
}
