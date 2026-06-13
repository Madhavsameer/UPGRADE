public class CheckPrime {
    public static void main(String[] args) {

        findPrimes(1, 100);





    }

    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void findPrimes(int start, int end){
        System.out.println("Prime numebrs in the given range is" );
        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
}
