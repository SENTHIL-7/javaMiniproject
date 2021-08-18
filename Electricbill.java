//Problem :
//Develop a Java application to generate Electricity bill. Create a class with the following
//members: Consumer no., consumer name, previous month reading, current month reading, type of
//EB connection (i.e domestic or commercial). Compute the bill amount using the given tariff.
//If the type of the EB connection is domestic, calculate the amount to be paid as follows:
//• First 100 units - Rs. 1 per unit
//• 101-200 units - Rs. 2.50 per unit
//• 201 -500 units - Rs. 4 per unit
//• > 501 units - Rs. 6 per unit
//If the type of the EB connection is commercial, calculate the amount to be paid as follows:
//• First 100 units - Rs. 2 per unit
//• 101-200 units - Rs. 4.50 per unit
//• 201 -500 units - Rs. 6 per unit
//• > 501 units - Rs. 7 per unit





package com.eBill;

import java.io.*;
import java.util.*;
class Electricbill
{                                                                 // throws IOException
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Consumer No: ");
int cno=Integer.parseInt(br.readLine());
System.out.println("Enter Consumer Name: ");
String name = br.readLine();
System.out.println("Enter Previous Month Reading: ");
int prev=Integer.parseInt(br.readLine());
System.out.println("Enter Current Month Reading: ");
int curr=Integer.parseInt(br.readLine());
System.out.println("Enter Type of EB Connections: (domestic or commercial)");
String type=br.readLine();
System.out.println("\n------------ELECTRICITY BILL------------------------ ");
System.out.println("\nConsumer Name: "+name);
int units=curr-prev;
System.out.println("\nNumber of Units : "+units);
double pay=0;
if(type.equalsIgnoreCase("domestic"))
{
if(units<=100)
pay=units*1;
else if(units>=101 && units<=200)
pay=((100*1)+((units-100)*2.50));
else if(units>=201 && units<=500)
pay=((100*1)+(100*2.50)+((units-200)*4));
else if(units>500)
pay=((100*1)+(100*2.50)+(300*4)+((units-500)*6));
System.out.println("\nAmount to be paid is: Rs. "+pay);
}
else if(type.equalsIgnoreCase("commercial"))
{
if(units<=100)
pay=units*2;
else if(units>=101 && units<=200)
pay=((100*2)+((units-100)*4.50));
else if(units>=201 && units<=500)
pay=((100*2)+(100*4.50)+((units-200)*6));
else if(units>500)pay=((100*2)+(100*4.50)+(300*6)+((units-500)*7));
System.out.println("\nAmount to be paid is: Rs. "+pay);
}
else
System.out.println("Type is incorrect.");
System.out.println("\n---------------------------------------------------- ");
}
}