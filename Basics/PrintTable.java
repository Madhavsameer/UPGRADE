import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {

        System.out.println("Enter the number whose table you want: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printTable(n);        
    }

    public static void printTable(int n){

        for(int i=1; i<=10; i++){
            System.out.println(n +" X "+ i+" = "+n*i);
        }

    }
}
