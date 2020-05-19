package SeleniumWorkout;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrintListTwo {
	public static void main(String[] args) {
		String str= "Bugatti Chiron";
		
		List<Character> listInput=new LinkedList<>();
		for(int i=0;i<str.length();i++)
		{
			listInput.add(str.charAt(i));
		}
		
 System.out.println(listInput);
}}
