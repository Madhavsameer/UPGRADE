import java.util.Scanner;

public class ReverseAnUmber {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        System.out.println(rev(n));
        

    }

    public static int rev(int n){

        int rev=0;
        while(n>0){

            int unit=n%10;
            rev=rev*10+unit;
            n=n/10;

        }

        return rev;
    }
}
