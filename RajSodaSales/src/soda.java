import java.util.Scanner;
import java.io.*;

public class soda
{

  public static void main(String[] args) throws IOException
  {


     File fn = new File("soda.dat");
     Scanner dataIn = new Scanner(fn);

     PrintWriter rptFile = new PrintWriter("sodareport.txt");

     String soda = " ";
     int sold = 0;

     double cost = 0.0;
     double retailBottles = 0.0;
     double profit = 0.0;
     double percent = 0.0;


     writeReportHeading(rptFile);

     while(dataIn.hasNext())
     {

        soda = getSoda(dataIn);
        cost = dataIn.nextInt();
        retailBottles = dataIn.nextDouble();
        profit = dataIn.nextDouble();
        percent = dataIn.nextDouble();


        writeReportLine(rptFile,soda,cost,retailBottles,profit,percent);

     }


     rptFile.close();


  } // end main

  	public static String getSoda(Scanner fileIn)
  	{
  		String retValue = "";
  		retValue = fileIn.nextLine();
  		if (retValue.equals(""))
  	      retValue = fileIn.nextLine();

	return retValue;
}

	public static void writeReportLine(PrintWriter rptOut,String s, double c,double retailBottles, double r , double p)
	{
		String fmt = "%-11s  %7d   $%7.2f  $%7.2f  $%7.2f  %-10s";
		String outStr = String.format(fmt,s,c,profit(c,r,retailBottles));
		rptOut.println(outStr);
		System.out.println(outStr);
	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static void writeReportHeading(PrintWriter rptOut)
	{
		String outStr = "";
		String fmt = "%-10s  %-8s   %-7s   %-7s   %-7s   %-7s";
		outStr = String.format(fmt," "," "," "," "," "," ","Order");
		System.out.println(outStr);
		rptOut.println(outStr);
		outStr = String.format(fmt,"Soda","Sold","Cost","RetailBotteles","Profit","Percent");
		System.out.println(outStr);
		rptOut.println(outStr);
		outStr = String.format(fmt+"\r\n","-------","--------","-------","-------","-------","-------");
		System.out.println(outStr);
		rptOut.println(outStr);
}

	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=


	public static double profit(int sold, double cost, double retailBottles)
	{
		return sold * (retailBottles - cost);
	}


} // end class
