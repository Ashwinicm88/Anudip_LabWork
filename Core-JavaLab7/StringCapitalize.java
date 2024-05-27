package Lab7;
/* Write a java program to capitalize each word in string.*/
import java.util.Scanner;
public class StringCapitalize { 
	public static void main(String[] args) { 
		// taken the input string from user 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to make capitalize a first letter:  ");
		String input =sc.nextLine(); 

		// call the capitalizeWords function and store the result 
		String result = capitalizeWords(input); 

		// printed the original and modified strings 
		System.out.println("Given Input: " + input); 
		System.out.println("Capitalized Output: " + result); 
	} 

	public static String capitalizeWords(String input) { 
		// split the input string into an array of words 
		String[] words = input.split("\\s"); 

		StringBuilder result = new StringBuilder(); 

		for (String word : words) 
        { 
			// capitalize the first letter, append the rest of the word, and add a space 
			result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" "); 
		} 

		// convert StringBuilder to String and trim leading/trailing spaces 
		return result.toString().trim(); 
	} 
} 
//end of the Program

