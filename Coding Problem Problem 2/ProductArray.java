
/**
 * @author Gregory Evevsky
 *
 *Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class ProductArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] test = {2, 3, 5 , 7}; 
		int[] answer = productArray(test);
		int[] bonusAnswer = productArrayNoDivide(test);
		for(int i = 0;i <  answer.length; i ++) { 
			System.out.println( i + ": " + answer[i] + " bouns: " + bonusAnswer[i]);
		}
		

	}

	public static int[] productArray(int[] list) {
		int[] give = new int[ list.length];
		int add=  1; 
		for(int i = 0; i < list.length; i++) {
			add *= list[i];
		}
		for( int i = 0; i < give.length; i++) {
			give[i] = add / list[i]; 
		}
		
		return give;
	}
	
	public static int[] productArrayNoDivide(int[] list) { 
		int[] give = new int[ list.length]; 
		for(int i = 0; i < list.length; i++) {
			give[i] =1;
			for(int x = 0; x < list.length ; x++) {
				if(x != i) { 
					give[i] *= list[x];
				}
			}
		}
		
		return give;
		
	}
}
