package eval_12sep.demo;

public class substring {
    /*6. Write a function that takes a string “s” and an integer “i” as an
argument. It should return the first “i” characters.
E.g.
sample input (“abcde”, 3)
output “abc”
You can assume that the value of i is less than the size of the
String. You should not use any loop statement.
*/
    public static void main(String[] args) {
        String s="abcde";
        int i=3;
        System.out.println(substr(s,i));
    }
    static String substr(String s,int i){

        return s.substring(0,i);
    }
}
