package domain;


 /**
 * The class Final exercise implements exercise dod
 * author Sydorenko
 */ 
public final class Exercise implements MyExercise {
    private final int[] numbers;


/** 
 *
 * Exercise
 *
     * @param length
 */
    public Exercise(final int length) { 

        this.numbers = new int[length];}

/** 
 *
 * Symmetric array
 *
 * @return int[]
 */
    public int[] symmetricArray() { 

        final int length = this.numbers.length;
        int count = (length % 2 == 0) ? 1 : 0;
        for (int i = length / 2; i < length; i++) {
            this.numbers[i] = this.numbers[length - i - 1] = count++; }
        return this.numbers;}
}
