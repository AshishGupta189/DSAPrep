package assignment2;

public class vowels {
   void vowelsorconsonants(char a){
       String op="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'
   ||a=='o'||a=='u'){
            System.out.println("vowels");
        }else{
            System.out.println("consonants");
        }
    }
    public static void main(String[] args) {
        vowels ap=new vowels();
        ap.vowelsorconsonants('A');
        ap.vowelsorconsonants('p');
        ap.vowelsorconsonants('1');
    }
}
