package epam.build;

import java.util.Scanner;

public class Client 
{
	public static void main( String[] args )
    {
		int material_standard;
		float areaofhouse;
		boolean fullyautomated=false;
		float total_cost;
     		Scanner sc = new Scanner (System. in);
    		System.out.printf("Build Construction\n");
    		System.out.printf("\n1.Standard Materials.\n2.Above Standard Materials\n3.High Standard Materials\n4.If you want fully automated home\nPlease Select Material Standard::");
    		material_standard=sc.nextInt();
		
		if(material_standard==4)
			fullyautomated= true;
    
    		System.out.printf("Enter total area of house required(sq.ft)\n");
    		areaofhouse=sc.nextFloat();
		
    		builder b=new builder();
		total_cost=b.estimate_cost(material_standard,areaofhouse,fullyautomated);
		
		System.out.printf("Cost required to buld a house based on your requirements is:"+total_cost+"INR");
		sc.close();
    }
}
© 2020 GitHub, Inc.
Terms
Privacy
Security
