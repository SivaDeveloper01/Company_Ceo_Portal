package Ceo;
 import java.util.*;
public class Company {
	  //states
	  String compname,comploc,managername;
	  int totalemp;
	  Employees E1=new Employees("TABREZ",1111,"Manager",28);
	  Employees E2=new Employees("BHARATH",2222,"HR",29);
	  Employees E3=new Employees("SATHYAVANI",3333,"TEAM LEADER",40);
	  Employees E5=new Employees("SEKAR",4444,"BACKEND-DEVOLOPER",28);
	  Employees E6=new Employees("IYAPPAN",5555,"BACKEND-DEVOLOPER",30);
	  Employees E7=new Employees("VENKAT",6666,"BACKEND-DEVOLOPER",22);
	  Employees E8=new Employees("LIHAN",7777,"BACKEND-DEVOLOPER",34);
	//company22
	  Employees E13=new Employees("BHARTH",0001,"MANAGER",35);
	  Employees E14=new Employees("SIVA",0002,"HR",29);
	  Employees E15=new Employees("SRI",0003,"TEAM LEADER",32);
	  Employees E16=new Employees("VENKI",2345,"BACKEND-DEVOLOPER",22);
	  Employees E17=new Employees("VASANTH",5461,"BACKEND-DEVOLOPER",23);
	  Employees E18=new Employees("KRISHNA",4567,"BACKEND-DEVOLOPER",29);
	  Employees E19=new Employees("SANJAY",5672,"BACKEND-DEVOLOPER",27);
	 //Faculty..1
	  Employees E26=new Employees("TABREZ",5678,"MANAGER",28);
	  Employees E27=new Employees("BHARATH",5679,"SQL-FACULTY",29);
	  Employees E28=new Employees("TABREZ",5689,"JAVA-FACULTY",28);
	  Employees E29=new Employees("SATHYVANI",5646,"WEBTECH-FACULTY",27);
	  Employees E30=new Employees("ARAVINTH",5567,"J2EE-FACULTY",25);
	  ///FACULTYY2
	  Employees E31=new Employees("SIVA",5678,"MANAGER",28);
	  Employees E32=new Employees("SHAMBU",5678,"JAVA-FACULTY",28);
	  Employees E33=new Employees("SHREEJA",5678,"SQL-FACULTY",28);
	  Employees E34=new Employees("ASHWIN",5678,"AUTOMATION-FACULTY",28);
	  Employees E35=new Employees("KRISH",5678,"SELENIUM-FACULTY",28);
	  
	 
	  Company(){
		
	  }
	  Company(String compname,String comploc,String managername,int totalemp){
		  this.compname=compname;
		  this.comploc=comploc;
		  this.managername=managername;
		  this.totalemp=totalemp;
		
	  }
	  //behavours...
	  void detailsofcompany(){
		 System.out.println("THE COMPANY NAME IS:"+compname);
		System.out.println("THE COMPANY LOCATION IS ID IS:"+comploc);
		System.out.println("THE MANAGER NAME IS:"+managername);
		System.out.println("THE TOTAL EMPLYEES WORKING IN  IT'S:"+totalemp);
		System.out.println("****************************************");
	   
	  }
	 
	}
