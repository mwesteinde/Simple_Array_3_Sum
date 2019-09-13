package exercise1;

public class ArrayThreeSum {

    /**
     * Checks if the sum of three numbers in an array is 0.
     * An array element can be picked more than once.
     * @param input the array to search in
     * @return true if the sum of three numbers chosen from input can be 0,
     *          and false otherwise.
     */
    public static boolean check3Sum(int[] input) {
        for (int x: input){
            for (int j=0;j<input.length;j++){
                for (int k=0;k<input.length;k++){
                    if(x+input[j]+input[k]==0){
                        return true;
                    }
                }
            }

        }
        return false;
    }
    /**
     * Checks if the sum of three numbers in an array is 0.
     * An array element can be picked at most once.
     * @param input the array to search in
     * @return true if the sum of three numbers in input can be 0,
     *          and false otherwise.
     */
    public static boolean check3Sum_noDups(int[] input) {
        int i = 0;
        for (int x: input) {
            for (int j = i+1; j < input.length; j++)
                for (int k = j+1; k < input.length; k++) {
                    if (x + input[j] + input[k] == 0) {
                        return true;
                    }
                }
            i++;
        }
        return false;
    }
}
