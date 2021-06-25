import java.util.*;   
class PalindromeExample2  
{  
   public static void main(String args[])
    {
        String reverse = "";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a palindrome: ");
        String number = input.nextLine();
        int length = number.length();
        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + number.charAt(i);
        }
        if (number.equals(reverse))
            System.out.println("Entered number is a palindrome.");
        else
            System.out.println("Entered number isn't a palindrome.");
    }
}  