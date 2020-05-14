package findSum;

public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="asdf1qwer9as8d7";
	
		String newInput="";
		int num;
		int sum=0;
		int temp=0;
		char convertNum;
		
		
		for(int i=0;i<input.length();i++)
		{
			 if (input.charAt(i) < 'A' || input.charAt(i) > 'Z' &&  
					 input.charAt(i) < 'a' || input.charAt(i) > 'z')
			 {
				 newInput = input.replaceAll("[^\\d]", "");
				
			 }
			
			
//			toInt=input.charAt(i);
//			System.out.print(toInt);
			
		}  System.out.println(newInput);
		
		for(int j=0;j<newInput.length();j++)
		{
			 convertNum = newInput.charAt(j);
		 num = Character.getNumericValue(convertNum);
		 sum=num+temp;
		 temp=sum;
		 
		}
		System.out.println(sum);
		
		
		
		
		

	}

}
