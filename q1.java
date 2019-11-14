import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int z[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        z[i]=sc.nextInt();
	    }
	    int m=n+1-k;
	    int sol=(m*(m+1))/2;
	    System.out.println(sol);
	}
}
