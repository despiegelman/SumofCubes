/** Delia Spiegelman
 * 9/9/24
 * Finds the sum of the cubes of the digits of any number */
import java.util.*;
public class FindSumOfCubes{
    public static void main(String[]args){
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        number = input.nextInt();
        input.close();
        while (number > 0){
            int digit = number % 10;
            sum = sum + digit*digit*digit;
            number = number / 10;
        }
        System.out.println("The sum of the cubes of the digits is: " + sum);
    }
}