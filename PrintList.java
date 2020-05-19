/*
2. Write a java program to print the list (Need 3 different answers)
Input: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]
 */

package SeleniumWorkout;

import java.util.ArrayList;
import java.util.List;

public class PrintList {
public static void main(String[] args) {
	String str="Bugatti Chiron";
	char[] charStr = str.toCharArray();
	List<Character> listInput=new ArrayList<>();
	for (char c:charStr)
	{
		listInput.add(c);
	}
	
	System.out.println(listInput);
}
}
