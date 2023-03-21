package en.codegym.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Certainly";
    private static final String DEFINITELY = "Definitely";
    private static final String MOST_LIKELY = "Most likely";
    private static final String OUTLOOK_GOOD = "The outlook is good";
    private static final String ASK_AGAIN_LATER = "Ask later";
    private static final String TRY_AGAIN = "Try again";
    private static final String NO = "My answer is no";
    private static final String VERY_DOUBTFUL = "Very doubtful";


        public static String getPrediction() {
            Random r = new Random();
            int x = r.nextInt(8);
            String result = null;
            if (x == 0) {
                result = CERTAIN;
            } else if (x == 1) {
                result = DEFINITELY;
            } else if (x == 2) {
                result = MOST_LIKELY ;
            } else if (x == 3) {
                result = OUTLOOK_GOOD;
            } else if (x == 4) {
                result = ASK_AGAIN_LATER ;
            } else if (x == 5) {
                result = TRY_AGAIN;
            } else if (x == 6) {
                result = NO;}
            else if (x == 7) {
                result = VERY_DOUBTFUL;
            }else{result=null;}
            
            return result;
        }
        
    }

