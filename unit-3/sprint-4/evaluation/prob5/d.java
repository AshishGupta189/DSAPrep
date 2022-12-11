package evaluation26sep.prob5;

public class d {

    /*
    * What is the difference between throw and throws. Write the code for the same.
    * => We use throw when we are throwing an exception while throws is used when we know that this method is going to
    * throw an exception and we want to handle the exception through a method.
    *
    *
    * ex:
    * */
    public static void main(String[] args) throws NullPointerException {
        //here we handle the exception
    }
    static void abc(){
        Object o=null;
        try{
            o.toString();
        }catch (Exception e){
            throw new NullPointerException("Null object"); //here we are throwing the exception.
        }finally {
            System.out.println("The end");//even after the exception this code is printed.
        }
    }
}
