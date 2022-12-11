package eval_12sep.demo;

import java.sql.Array;

public class doublefun {
    /*5. Write a function that doubles all the values inside the given
integer array and returns the array with doubled values.
Sample input and output:
Input array {1,2,3,4}
Output array {2,4,6,8}
*/
    public static void main(String[] args) {
        int[] arr={1,2,3,4};

        doublefun d=new doublefun();
        arr=d.doublef(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    int[] doublef(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*2;

        }
       return arr;
    }
}
