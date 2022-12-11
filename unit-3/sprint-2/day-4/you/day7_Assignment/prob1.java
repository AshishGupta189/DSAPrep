package day7_Assignment;

public class prob1 {
    /*
    * Q1)  Is there any difference between creating a string with and without a new operator?
        Explain with an example.

    * Yes there is a difference in creating a string with and without new keyword
    * We have two ways of creating strings first is string literal and secons is with new keyword
    * in string literal when we assign any valur it will be added in string pool and when we try to define another
    * string with same value first it will check in the heap if the value is present or not if present it will
    * point to that address if not it will create new value there
    *
    * while with new keyword we are assigning different addresses for every time we use new keyword even if
    * the value is same;
    *
    * ex:
    * String s1="value"  String pool=["value"];
    * String s2="value"  String pool=["value"]; pool remains the same and both will point to same address
    *
    *
    * String s=new String("value")
    * String h=new String("value")
    * both times the value is same but this will point to different addresses
    *
    *
    *
    * */
}
