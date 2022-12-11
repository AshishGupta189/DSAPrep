package evaluation_5sep;

public class _5sep_eval {

    public static void main(String [] args){

        int day=8;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid Input");
        }
        int x=1;
        do{
            x++;
            if(x%2==0){
                System.out.println(x);
                x++;
            }else{
                continue;
            }
        }while(x<=20);
    }
}
