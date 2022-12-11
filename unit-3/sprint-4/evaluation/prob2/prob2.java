package evaluation26sep.prob2;

import java.util.ArrayList;

public class prob2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(4);
        nums.add(6);
        nums.add(7);
        nums.add(4);
        nums.add(4);
        int key=5;
        int res=smaller(nums,key);
        System.out.println(res);


    }
    static int smaller(ArrayList nums,int Keys){
        ArrayList<Object> arr=new ArrayList<>();
        for(int i=0;i< nums.size();i++){
            int c=0;
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)==nums.get(i)){
                    c++;
                }
            }if(c==0){
                arr.add(nums.get(i));
            }
        }
        int l=0;
        for(int i=0;i< arr.size();i++){
            if(Keys>(Integer) arr.get(i)){
                l++;
            }
        }
        return l;
    }
}
