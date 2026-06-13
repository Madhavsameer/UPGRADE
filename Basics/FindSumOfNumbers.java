public class FindSumOfNumbers {
    public static void main(String[] args) {

        System.out.println(sum(10));
        System.out.println(sum2(10));
        

    }

    public static int sum(int n){
        int sum=0;
        for(int i=0; i<=n; i++){
            sum+=i;

        }

        return sum;
    }

    public static int sum2(int n){

        int sum=n*(n+1)/2;

        return sum;

    }
}
