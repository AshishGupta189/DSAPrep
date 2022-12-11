package day8_Assignment;

import java.util.Scanner;

/*Q2 Even Sum in Columns
Description
● You have to create a 2D array, whose dimensions are N, M, and take the input from the user.
● The value stored in N denotes the number of rows, and the value in M denotes the number of
columns
● If the array looks like arr = [1,2,3],[4,5,6],[7,8,9]
● For all columns, you have to print the sum of even elements present in the column
4 (Even numbers in the column are, [4]. Therefore, the sum becomes 4)
10 (Even numbers in the row are, [2,8]. Therefore, the sum becomes 10)
6 (Even numbers in the row are, [6]. Therefore, the sum becomes 6)
Sample Input 1
Enter no of rows: 3
Enter no of columns: 3
1 2 3
4 5 6
7 8 9
Sample Output 1
4
10
6
Hint
In the sample test case, the value stored in N = 3,M = 3, and the array is [1,2,3],[4,5,6],[7,8,9], then the required
output will be
4 (Even numbers in the column are, [4]. Therefore, the sum becomes 4)
10 (Even numbers in the row are, [2,8]. Therefore, the sum becomes 10)
6 (Even numbers in the row are, [6]. Therefore, the sum becomes 6)
*/
public class prob2 {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        int rows=s1.nextInt();
        System.out.print("Enter no of columns:");
        int columns=s1.nextInt();
        int l=1;
        int[][] arr=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=l;
                l++;
//                System.out.println(arr[i][j]);
            }
        }

        for(int i=0;i<columns;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                if(arr[j][i]%2==0){
                    sum+=arr[j][i];
                }
            }
            System.out.println(sum);
        }

    }
}
