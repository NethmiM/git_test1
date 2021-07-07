import java.util.Scanner;

public class NumToString  {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= input.nextInt();
        int n1=num,n2=num;
        int a=n1%10,b=n2/10;

        String[] single_digits= new String[]{"Zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
        String[] tens_multiple = new String[]{"","","Twenty","Thirty","Forty","Fifty","Sixty", "Seventy","Eighty","Ninety"};
        String[] tens_power=new String[]{"","","","Hundred"};
        if(b==1){
            System.out.println(two_digits[a+1]);
        }
        else if(a==0){
            System.out.println(tens_multiple[b]);
        }
        else{
            System.out.println(tens_multiple[b]+" "+single_digits[a]);
        }

    }



}
