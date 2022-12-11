package assignment2;

public class CheckWeather {
    public static void main(String[] args) {

        //Assume these can have any value:
        boolean isSnowing = true;
        boolean isRaining = true;
        double temperature = 40.0;
        //print "Let’s stay home." if its raining, snowing or
        //below 50 degrees and print "Let’s go out!" otherwise.
        if(isSnowing&&isRaining&&temperature<50.0){
            System.out.println("Let's stay home.");
        }else{
            System.out.println(" Let's go out!");
        }

    }
}
