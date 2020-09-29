import java.util.*;
import java.util.Map.Entry;

public class Solution2 {
	
	public  static void subString(String s)
	{
		int len= s.length();
		
		String ar[]= new String[len*(len+1)/2];
		
		int temp=0;
		
		for (int i=0;i<len;i++)
		{
			for (int j=i;j<len;j++)
			{
				ar[temp]= s.substring(i, j+1);
				temp++;
				
			}
		}
		
		for (int p=0;p<ar.length;p++)
		{
			System.out.println(ar[p]);
		}
	}

    public static void main(String[] args) {
    	
    	String s= "ABCDEF";
    	subString(s);
    	
    	
    	}
 
}
