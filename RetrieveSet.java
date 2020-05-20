package SeleniumWorkout;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetrieveSet {
	public static void main(String[] args) {
		
	
	Set<Integer>Input=new LinkedHashSet();
	
	Input.add(1);
	Input.add(2);
	Input.add(3);
	Input.add(4);
	Input.add(5);
	Input.add(6);
	Input.add(7);
	Input.add(8);
	Input.add(9);
	System.out.println(Input);
	List<Integer>Output=new ArrayList<>(Input);
	System.out.println(Output.get(6));
//	for(int i=0;i<list.size();i++)
//	{
//		
//	}
	
	}
}