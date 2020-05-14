package findSum;

public class ReverseWord {
	public static void main(String[] args) {
	/*Write a java program to do the following.
	Input: "When the world realise its own mistakes, corona will dissolve automatically"
	output: "When eht world esilaer its nwo mistakes, anoroc will evlossid automatically" */
	
	String input="When the world realise its own mistakes, corona will dissolve automatically";
	int ch=0;
	String[] substring = input.split("\\s+");
	
	
	for(int i=0;i<substring.length;i++)
	{ StringBuilder str=new StringBuilder(substring[i]);
        if(i%2!=0)
        { 
        	str=str.reverse();
        }

  System.out.print(" "+str);
		
	}
	
   

}
}
