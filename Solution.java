import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String[][] inputs = new String[n][n];
	    
        String[] forward = new String[n*n];
        String[] reverse = new String[n*n];
        
        String temp = " ";
        
	    for(int i=0;i<n;i++)
	    for(int j=0;j<n;j++)
	       inputs[i][j]=sc.next();
	       
	       int fctr = 0;
	       int rctr = 0;
	       
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	                forward[fctr++]=inputs[i][j];
	       i++;
	            for(int j=n-1;j>=0&&i<n-1;j--)
	                forward[fctr++]=inputs[i][j];
	    }
	    
	    
	    
	   for(int i=n-1;i>=0;i--)
	   {
	       for(int j=n-1;j>=0;j--)
	        {
	            reverse[rctr++] = inputs[i][j];
	        }
	       i--;
	       for(int j=0;j<n&&i>=0;j++)
	       {
	           reverse[rctr++] = inputs[i][j];
	       }
	   }
	   
	   if(n%2==0)
	   {
        for(int i=0;i<((n*n)/2);i++)
	    {
	        if(forward[i].equals(reverse[i]))
	        {
                    temp += forward[i]+" ";	                
	        }
	    }
	   }
	   else
	   {
	       for(int i=0;i<=(n*n)/2;i++)
	       {
	           if(forward[i].equals(reverse[i]))
	                temp += forward[i]+" ";
	       }
	   }
	        
	    
	    
	    if(temp.equals(" "))
	        System.out.println("-1");
	    else
	        System.out.println(temp);

	}
}
