/** The aim of this program is to get the smallest number in a sorted integer array.
 * Due to this, the first number found in the array will be the smallest.
 */
public class SmallestElementSortedArray {
    
     /**
     * @param arr is the array defined
     * @return the first element on the array
     */
    public static int findSmallestElement(int arr[]){

        return arr[0];

    }
    
    public static void main(String args[]) {
    	int array[] = {5, 32, 491, 1001, 45612};
    	int smallest = findSmallestElement(array);
        System.out.println ("This is the smallest number in the array: " + smallest);
    }
}
