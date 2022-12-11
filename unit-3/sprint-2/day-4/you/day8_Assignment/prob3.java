package day8_Assignment;

public class prob3 {
    /*Q3 Finding prime number inside an array:
public class Main{
public int[] findAndReturnPrimeNumbers(int[] inputArray){
//write the logic to iterate through the supplied inputArray and return array of prime
numbers
//if no prime number is found then return the empty array.
*/
    public static void main(String[] args) {
        int[] arr={1,5,4,9,7,6};
        int[] a=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=2;j<=arr[i];j++){
                if(arr[i]%j==0){
                    s++;
                }
            }if(s<=1){
                a[k]=arr[i];
                k++;
                System.out.println(arr[i]);
            }
        }

    }
}
