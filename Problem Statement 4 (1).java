import java.util.*;
import java.lang.*;
import java.io.*;

class Ques4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner y=new Scanner(System.in);
		
		int Q=y.nextInt();
		
		while(Q-- >0){
		    
		    int N =y.nextInt();
		    int[] a=new int[N];
		    
		    for(int i=0;i<N;i++)
		        a[i]=y.nextInt();
		    
		    int[] b=new int[2];
		    for(int i=0;i<2;i++)
		        b[i]=y.nextInt();
		    int L = b[0];
		    int R = b[1];
		   Arrays.sort(a);
		   
		   long product = 1;
		   for(int i=0;i<N;i++) {
		       for(int j=i+1;j<N;j++){
		           if(a[i]>=L && a[j]<=R ){
		                product = product * (a[i]^a[j]);
		           }
		       }
		   }
		   System.out.println(product%1000000007);
		}
	}
}
