import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an sport");
		String sport = in.nextLine();
		System.out.println("Enter a girl's name");
		String girlsName = in.nextLine();
		System.out.println("Enter a body part");
		String bodyPart = in.nextLine();
		
		
		
		//STORY
		System.out.println("One day during "+sport+" practice, "+girlsName+" broke her "+bodyPart+"");
		

	}

}
