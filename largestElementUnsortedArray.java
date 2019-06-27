/**
 * The aim of this program is to get the largest number in an unsorted integer array.
 * At first, an integer is created (largest). It will contain the largest number found in the array.
 * The loop is executed through the array starting from the second element (i=1) until the last one (array.length) since the first element
 * is currently stored in the integer largest.
 * On each iteration until the end of the loop, the array elements are compared with the largest value stored.
 * If the array element is largest than the current largest, this element will be stored as the largest found. 
 */
public class LargestElementUnsortedArray {
    
    /**
     * @param arr is the array defined
     * @return the largest number found in the array
     */
    public static int findLargestElement(int arr[]){
        
        int max = arr[0];

        for(int i=1; i<arr.length; i++){
	    	if(arr[i] > max){
	    	    max = arr[i];
	    	}
	    }
	    return max;  
    }
    
    public static void main(String args[]) {
        int array[] = {32, 5, 1001, 45612, 491};
        int largest = findLargestElement(array);

        System.out.println ("This is the largest number in the array: " + largest);
    }
}
