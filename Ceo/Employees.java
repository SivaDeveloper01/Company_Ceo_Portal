package Ceo;

import java.util.Scanner;

public class Employees {

	 ///states
	   String empname;
	   int empid;
	   String position;
	   double age;
	   String password="Giri@password";
	   Employees(){
		
	   }
	   Employees(String empname,int empid,String position,double age){
		   this.empname=empname;
		   this.empid=empid;
		   this.position=position;
		   this.age=age;
		   
		
	   }
	   //
	   void detailsofemployees(){
		 System.out.println("THE EMPLOYEE NAME IS:"+empname);
		System.out.println("THE EMPLOYEE ID IS:"+empid);
		System.out.println("THE POSITION OF EMPLOYYEE IS:"+position);
		System.out.println("THE EMPLOYEES AGE IS:"+age);
		System.out.println("****************************************");
	   }
	   public void addemployee() {
		    Scanner s=new Scanner(System.in);
		    System.out.println("Select which company you select");
			   System.out.println("1.DEVELOPER-TECH\n2.TECH-YENDRA\n3.EXIT");
			   int com=s.nextInt();
			   switch (com) {
			case 1:{
				 Employees E1=new Employees(empname=empname,empid=empid,position=position,age=age);
				  System.out.println("Enter The employee name");
				  s.nextLine();
				  String name=s.nextLine();
				  this.empname=name;
				  System.out.println("Enter The employee id");
				  int id=s.nextInt();
				  this.empid=id;
				  System.out.println("Enter The employee position");
				  s.nextLine();
				  String pos=s.nextLine();
				  this.position=pos;
				  System.out.println("Enter The employee age");
				  int Ag=s.nextInt();
				  this.age=Ag;
				  System.out.println("\t\t\"The employees added succesfull!!!\"");
				  System.out.println("The details of employee showed in below..........");
				  detailsofemployees();
				  
				  
				  
				
				break;	}
			case 2:{
				 Employees E1=new Employees(empname=empname,empid=empid,position=position,age=age);
				  System.out.println("Enter The employee name");
				  s.nextLine();
				  String name=s.nextLine();
				  this.empname=name;
				  System.out.println("Enter The employee id");
				  int id=s.nextInt();
				  this.empid=id;
				  System.out.println("Enter The employee position");
				  s.nextLine();
				  String pos=s.nextLine();
				  this.position=pos;
				  System.out.println("Enter The employee age");
				  int Ag=s.nextInt();
				  this.age=Ag;
				  System.out.println("\t\t\"The employees added succesfull!!!\"");
				  System.out.println("The details of employee showed in below..........");
				  detailsofemployees();
				  
				  
				  
				
				break;}
				
				

			default:{  System.out.println("IF YOU DON'T WANT ADD EMPLOYEES...");
			 System.out.println("\t\tThank You!!!");
				
			}
				
			}
 }
	   public void  removeemployee() {
		   Scanner s=new Scanner(System.in);
		   System.out.println("Select which company you select");
		   System.out.println("1.DEVELOPER-TECH\n2.TECH-YENDRA\n3.EXIT");
		   int com=s.nextInt();
		   switch (com) {
		case 1:{  System.out.println("\t\tDEVELOPER-TECH EMLOYEES REMOVE PAGE.....>");
		 System.out.println("Select Which Employee You will Reject");
		         System.out.println("EMPLOYEE NAME:");
		         
		         System.out.println("1.Tabrez-Manager\n2.Bharath-HR\n3.SATHYAVANI-TL\n4.SEKAR-BACKEND-DEVOLOPER\n5.IYAPPAN-BACKEND-DEVOLOPER\n6.VENKAT-BACKEND-DEVOLOPER\n7.LIHAN-BACKEND-DEVOLOPER\n8.EXIT");
			   int ent=s.nextInt();		        
	switch (ent) {
			case 1:{ Employees E1=new Employees("TABREZ",1111,"Manager",28);
			E1.empname=null;
			 E1.empid=0;
			  E1.position=null;
			   E1.age=0;
			   System.out.println("The Employee Removed Successfully....");
			   System.out.println("The Removed confirmation details showed in Below..");
			   E1.detailsofemployees();
			break;}
			case 2:{
				  Employees E2=new Employees("BHARATH",2222,"HR",29);
				E2.empname=null;
				 E2.empid=0;
				  E2.position=null;
				   E2.age=0;
				   System.out.println("The Employee Removed Successfully....");
				   System.out.println("The Removed confirmation details showed in Below..");
				   E2.detailsofemployees();break;}
			case 3:{
				 Employees E3=new Employees("SATHYAVANI",3333,"TEAM LEADER",40);
				E3.empname=null;
				 E3.empid=0;
				  E3.position=null;
				   E3.age=0;
				   System.out.println("The Employee Removed Successfully....");
				   System.out.println("The Removed confirmation details showed in Below..");
				  E3.detailsofemployees();break;}
			case 4:{
				  Employees E5=new Employees("SEKAR",4444,"BACKEND-DEVOLOPER",28);
				E5.empname=null;
				 E5.empid=0;
				  E5.position=null;
				   E5.age=0;
				   System.out.println("The Employee Removed Successfully....");
				   System.out.println("The Removed confirmation details showed in Below..");
				   E5.detailsofemployees();break;}
			case 5:{
				  Employees E6=new Employees("IYAPPAN",5555,"BACKEND-DEVOLOPER",30);
				E6.empname=null;
				 E6.empid=0;
				  E6.position=null;
				   E6.age=0;
				   System.out.println("The Employee Removed Successfully....");
				   System.out.println("The Removed confirmation details showed in Below..");
				   E6.detailsofemployees();break;}
			case 6:{
				  Employees E7=new Employees("VENKAT",6666,"BACKEND-DEVOLOPER",22);
				E7.empname=null;
			 E7.empid=0;
			  E7.position=null;
			   E7.age=0;
			   System.out.println("The Employee Removed Successfully....");
			   System.out.println("The Removed confirmation details showed in Below..");
			  E7.detailsofemployees();break;}
			case 7:{ Employees E8=new Employees("LIHAN",7777,"BACKEND-DEVOLOPER",34);	
				E8.empname=null;
			 E8.empid=0;
			  E8.position=null;
			   E8.age=0;
			   System.out.println("The Employee Removed Successfully....");
			   System.out.println("The Removed confirmation details showed in Below..");
			   E8.detailsofemployees();break;}
				
				

			default:{
				 System.out.println("IF YOU DON'T WANT REMOVE EMPLOYEES....");
			     System.out.println("\t\tThank You!!!");
			}
				
			}
		         break;}
		case 2:{
			 System.out.println("\t\tTECH-YENDRA EMLOYEES REMOVE PAGE.....>");
			 System.out.println("Select Which Employee You will Reject");
			System.out.println("EMPLOYEE NAME:");
			         
			System.out.println("1.BHARTH-MANAGER\n2.SIVA-HR\n3.SRI-TEAM LEADER\n4.VENKI-BACKEND-DEVOLOPER\n5.VASANTH-BACKEND-DEVOLOPER\n6.KRISHNA-BACKEND-DEVOLOPER\n7.SANJAY-BACKEND-DEVOLOPER\n8.EXIT");
				   int ent=s.nextInt();		        
		switch (ent) {
				case 1:{  Employees E13=new Employees("BHARTH",0001,"MANAGER",35);
				E13.empname=null;
				 E13.empid=0;
				  E13.position=null;
				   E13.age=0;
				   System.out.println("The Employee Removed Successfully....");
				   System.out.println("The Removed confirmation details showed in Below..");
				   E13.detailsofemployees();
				break;}
				case 2:{
					  Employees E14=new Employees("SIVA",0002,"HR",29);
					E14.empname=null;
					 E14.empid=0;
					  E14.position=null;
					   E14.age=0;
					   System.out.println("The Employee Removed Successfully....");
					   System.out.println("The Removed confirmation details showed in Below..");
					   E14.detailsofemployees();
					   break;}
				case 4:{
					 Employees E16=new Employees("VENKI",2345,"BACKEND-DEVOLOPER",22);
					E16.empname=null;
					 E16.empid=0;
					  E16.position=null;
					   E16.age=0;
					   System.out.println("The Employee Removed Successfully....");
					   System.out.println("The Removed confirmation details showed in Below..");
					  E16.detailsofemployees();
					  break;}
				case 5:{
					 Employees E17=new Employees("VASANTH",5461,"BACKEND-DEVOLOPER",23);
					E17.empname=null;
					 E17.empid=0;
					  E17.position=null;
					   E17.age=0;
					   System.out.println("The Employee Removed Successfully....");
					   System.out.println("The Removed confirmation details showed in Below..");
					   E17.detailsofemployees();
					   break;}
				case 6:{
					 Employees E18=new Employees("KRISHNA",4567,"BACKEND-DEVOLOPER",29);
					E18.empname=null;
					 E18.empid=0;
					  E18.position=null;
					   E18.age=0;
					   System.out.println("The Employee Removed Successfully....");
					   System.out.println("The Removed confirmation details showed in Below..");
					   E18.detailsofemployees();
					   break;}
				case 7:{
					 Employees E19=new Employees("SANJAY",5672,"BACKEND-DEVOLOPER",27);
					E19.empname=null;
				 E19.empid=0;
				  E19.position=null;
				   E19.age=0;
				   System.out.println("The Employee Removed Successfully....");
				   System.out.println("The Removed confirmation details showed in Below..");
				  E19.detailsofemployees();
				  break;}
				case 3:{   Employees E15=new Employees("SRI",0003,"TEAM LEADER",32);	
					E15.empname=null;
				 E15.empid=0;
				  E15.position=null;
				   E15.age=0;
				   System.out.println("The Employee Removed Successfully....");
				   System.out.println("The Removed confirmation details showed in Below..");
				   E15.detailsofemployees();
				   break;}
					
					

				default:{
					     System.out.println("IF YOU DON'T WANT REMOVE EMPLOYEES....");
					     System.out.println("\t\tThank You!!!");
				}
					
				}
			break;}
			
			

		default:{
			 System.out.println("IF YOU DON'T WANT REMOVE EMPLOYEES....");
		     System.out.println("\t\tThank You!!!");
		}
			break;
		}
		      
			    
	   }
		
	}
