package Arrays;
public class ArrayReverse{
    public static void main(String [] args){

        int arr[]={3,9,0,4,2};

        reverse(arr);
        


    }

    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }

        for(int k: arr){
            System.out.print(k+" ");
        }
    }
}