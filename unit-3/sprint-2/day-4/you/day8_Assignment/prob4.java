package day8_Assignment;

public class prob4 {
    public static void main(String[] args) {
        /*)Take the Command Line Argument and print the factorial of that number. */
        int num;
        if(args.length==1){
            String a=args[0];
            num=Integer.parseInt(a);
            int op=fact(num);
            System.out.println(op);

        }
        if(args.length==2){
            String a=args[0];
            int num1=Integer.parseInt(a);
            String b=args[1];
            int num2=Integer.parseInt(b);
            num=Math.abs(num2-num1);
            int op=fact(num);
            System.out.println(op);
        }

        if(args.length>2){
            System.out.println("Invalid numbers");
        }


    }
    static int fact(int num){
        if(num<=2){
            return (num);
        }else{
            return (num*fact(num-1));
        }
    }
}
