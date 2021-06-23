
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	//Given data 
	int n=5;
	String var[]={"Rose","Lily","Sunflowers","Lavender","Orchids"};
	int cost_gardener1[]={10,20,30,40,50};
	int cost_gardener2[]={20,40,10,50,100};
	
	int cost1=0;
	int cost2=0;
	for(int i=0;i<n;i++)
	{
	    if(i%2==0)
	    cost1+=cost_gardener1[i];
	    
	    else
	    cost1+=cost_gardener2[i];
	}
	
	for(int i=0;i<n;i++)
	{
	    if(i%2==0)
	    cost2+=cost_gardener2[i];
	    
	    else
	    cost2+=cost_gardener2[i];
	}
	
	System.out.println("Minimum total amount needed is "+ Math.min(cost1,cost2));
	
	}
}
