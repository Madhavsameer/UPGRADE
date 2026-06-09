package Arrays;

public class SumOfElements {

    public static void main(String[] args) {


        int arr[]={1,7,8,3,2,9};
        int sum=0;

        if(arr.length==0){
            System.out.println("Zero elements in the array so sum is "+sum);
        }

        else{

            for(int i=0; i<arr.length; i++){
                sum+=arr[i];
            }
            System.out.println("The sum of elements of the given array is :"+sum);

        }
        
        
    }


}
