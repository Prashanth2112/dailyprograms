package SeleniumWorkout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class DuplicateChar {
	
	public static void main(String[] args) {
		String str="When life gives you lemons, make lemonade";
		String input = str.replaceAll("\\s", "");
		char[] newInp = input.toCharArray();
		
//		char[] charInp = input.toCharArray();
		List<Character> listInput=new ArrayList<>();
		Set<Character> set=new HashSet();
		Set<Character> duplicate=new HashSet();
		for(char c:newInp)
		{ listInput.add(c);}
		System.out.println(listInput);
		for(char i:listInput)
		{
			if(!set.add(i))
			{
				duplicate.add(i);
			}
		}System.out.println(duplicate);
		
	}} 