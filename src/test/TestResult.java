package test;

import domain.Exercise;
import java.util.Arrays;


 /**
 * The class Test result
 * author Sydorenko
 */ 
public class TestResult {



/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) {  


        final int length = 15;
        final Exercise numberArray = new Exercise(length);
        final int[] array = numberArray.symmetricArray();
        System.out.println(Arrays.toString(array));
    }

    private static class Exercise2 {


/** 
 *
 * Exercise2
 *
 * @return public
 */
        public Exercise2() { 

        }


/** 
 *
 * Symmetric array
 *
 * @return int[]
 */
        private int[] symmetricArray() { 

            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
