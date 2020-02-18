package epam.build;
import java.text.DecimalFormat;
import java.util.*;
public class sici
{
	public static void main( String[] args )
    {
    	double pr, rate, t, sim,com;
        Scanner sc = new Scanner (System. in);
        System.out.printf("Simple and Compound Interest\n\n");
        System.out.println("Enter the amount:");
        pr=sc.nextDouble();
        System. out. println("Enter the No.of years:");
        t=sc.nextDouble();
        System. out. println("Enter the Rate of  interest");
        rate=sc.nextDouble();
        sim=(pr * t * rate)/100;	//Simple interest
        com=pr * Math.pow(1.0+rate/100.0,t) - pr;	//compound interest
        DecimalFormat numf = new DecimalFormat("#.00");
        System.out.println("Simple Interest="+numf.format(sim));	//using decimal format
        System.out. printf("Compound Interest="+numf.format(com));
        sc.close();
    }
}