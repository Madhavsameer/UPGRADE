import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        System.out.println(check(n));
        
        

    }


    public static String check(int n){

        String str="";
        
        if(n<0) return "Negative numbers can't be even or odd";
        if(n==0) str="Neither even nor odd";
        if(n%2==0) str= "Even number";
        else{
            str="Odd number";
        }

        

        return str;


    }
}
