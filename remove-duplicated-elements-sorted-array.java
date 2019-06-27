/**
 * The aim of this program is to remove the duplicated elements from an array.
 * The length of the given array is determinated and a temporal array is created with the new length as the given
 * On each iteration until the end of the loop, the array elements are compared with the values stored in the temporal array.
 * The last element is stored in the temporal array and the given array is modified with the new values that have been previously
 * stored in the temporal array.
 */
public class RemoveDuplicatedElementsSortedArray {
 
    /**
     * @param arr is the array defined
     * @return the size of the modified array
     */
    public static int removeDuplicateElements(int arr[]) 
    { 
        int length = arr.length;
        int[] temporal = new int[length];
        int j = 0;

        for (int i=0; i<length-1; i++){
        	// If current element is different from the next element on the array, it is stored. 
            if (arr[i] != arr[i+1]){
                temporal[j++] = arr[i];
            } 
        } 
             
          
        // Store the last element 
        temporal[j++] = arr[length-1];    
          
        // Modify original array with the values stored in the temporal
        for (int i=0; i<j; i++){
            arr[i] = temporal[i];
        } 
       
        return j; 
    } 
      
    public static void main (String[] args)  
    { 
        int array[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
          
        int lengthNewArray = removeDuplicateElements(array); 
   
        // Print Array without duplicated values
        for (int i=0; i<lengthNewArray; i++){
           System.out.print(array[i]+" "); 
        }
    } 
}
