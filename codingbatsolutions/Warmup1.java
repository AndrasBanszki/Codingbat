/*
 * Codingbat solutions.
 */
package codingbatsolutions;

/**
 *
 * @author Bánszki András <andras.banszki@gmail.com>
 */
public class Warmup1 {
    /* Warmup-1 > sleepIn 
    
    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true */
    
    public boolean sleepIn(boolean weekday, boolean vacation) {
        boolean result = false;
        if( !weekday || vacation ){
            result = true;
          }
        return result;
    }
    

}
