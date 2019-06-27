/** The aim of this program is to check a list of number from 1 to 100.
 * If the number is multiple of 3 and 5 the text "AAABBB" will be printed
 * If the number is multiple of 5 the text "BBB" will be printed
 * If the number is multiple of 3 the text "AAA" will be printed
 */
public class ThreeAndFiveMultiples {

    public static void main(String args[]) {
        for(int i=1; i<=100; i++){
        	if((i % 3 == 0) && (i % 5 == 0)){
        		System.out.println("AAABBB");
        	}else if(i % 5 == 0){
        		System.out.println("BBB");
        	}else if(i % 3 == 0){
        		System.out.println("AAA");
        	}else{
        		System.out.println(i);
        	}
        }
    }
}
