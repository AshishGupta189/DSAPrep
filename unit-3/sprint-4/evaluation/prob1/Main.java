package evaluation26sep.prob1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Product> arr=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(i<4){
            System.out.println("Enter product name");
            String s= sc.next();
            System.out.println("Enter product price");
            double pr=sc.nextDouble();
            i++;
            Product p=new Product(s,pr);
            arr.add(p);
        }
        int j=1;
        for(Product in:arr){
            System.out.println("Product no.:"+ j);
            j++;
            System.out.println(in);
        }
        sc.close();
    }
}
