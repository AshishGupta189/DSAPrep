package evaluation26sep.prob3;

public class prob3 {
    public static void main(String[] args) {
        fun();
    }
    static void fun(){
        int[] array= new int[10];
        try{
            array[11]=100;
        } catch (Exception e) {
            System.out.println("array's length is 10 and you are trying to access the 11th  index(ArrayindexoutofboundException)");
        }
        Object object =null;
        try{
            object.toString();
        }catch (Exception e){
            System.out.println("Object is null you can't use to string method(NullPointerException)");
        }
        finally {
            System.out.println("The End");
        }
    }
}

