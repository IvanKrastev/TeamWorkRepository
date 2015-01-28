import java.util.Scanner;


public class SortArrayofStrings {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Add array length: ");
		int arrayLength= input.nextInt();
		String[] stringArray= new String[arrayLength];
		String[] stringArraySorted= new String[stringArray.length];
		// Adding variables in the array.
		for (int i = 0; i < arrayLength; i++) {
			stringArray[i] = input.next();
		}
		// Sorting the array. BUBBLE METHOD. stringArray[i].compareToIgnoreCase(stringArray[i+1]) -> http://mathbits.com/MathBits/Java/arrays/ABCSort.htm 
		String temp;
		boolean flag= true;
		while(flag){
			flag=false;
			for (int i = 0; i < stringArray.length-1; i++) {
				if (stringArray[i].compareToIgnoreCase(stringArray[i+1]) > 0) {
					temp= stringArray[i];
					stringArray[i]= stringArray[i+1];
					stringArray[i+1]= temp;
					flag=true;
					
					
				}
			}
		}
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i] +" ");
		}
		
		
		

	}

}
