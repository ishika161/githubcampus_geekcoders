import java.util.*;
import java.lang.*;
import java.io.*;

class Ques5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner y=new Scanner(System.in);
		
		int N = y.nextInt();
		int a[] = new int [2];
		for(int i=0;i<2;i++){
		    if(i==0)
		        System.out.println("Enter no of people standing ahead");
		    else
		        System.out.println("Enter no of people standing behind");
		    a[i]=y.nextInt();
		}
		System.out.println("Number of places he can stand are : "+findPosition(N, a[0], a[1]);
	}
	static int findPosition(int n, int f, int b)
    {
     
        return n - Math.max(f + 1, n - b) + 1;
    }
}
