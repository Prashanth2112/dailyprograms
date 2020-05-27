package SeleniumWorkout;

public class CommonNumbers {
	public static void main(String[] args) {
		int temp=0;
		int[] a1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] a2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		for(int i=0;i<a1.length-1;i++)
			{
			for(int j=0;j<a2.length-1;j++)
			{
				if(a1[i] == a2[j]) {  
		              System.out.println(a1[i]);
			}
		
			}
		}
	}

}
