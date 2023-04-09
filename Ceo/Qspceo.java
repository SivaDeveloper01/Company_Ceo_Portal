package Ceo;
import java.util.*;
public class Qspceo {

	  static Scanner s=new Scanner(System.in); 
			static String cname="GIRISH B.E,MBA";
		       static String designation="CEO";
		       static String loc="CHENNAI";
		       static int password=6221;
		       public void detailsofceo() {
		    	   System.out.println("THE NAME OF CEO:"+cname);
		    	   System.out.println("THE DESIGNATION AS:"+designation);
		    	   System.out.println("LOCATION IF CEO :"+loc);
		       }
		       static int x;
			   
			public static void main(String[] args){ 
				do{System.out.println("\t\t\"WELCOME TO MY OWN WORLD CREATINS\"");
				System.out.println();
				System.out.println("\"MY OWN WORLD IS THEY LISTED IN BELOW......\2\2\2");
				System.out.println();
				System.out.println("1)IF YOU WANT TO SEE COMPANY & EMPLOYEES DETAILS PRESS\"1\"");
				System.out.println("2)IF YOU WANT TO SEE INSITUTE & STAFFS & STUDENTS DETAILS PRESS\"2\"");
				System.out.println("3)IF YOU WANT CEO DETAILS PRESS \"3\"");
				System.out.println("4)CEO ONLY ACTIVETED...(PRESS\"4\")\nI.Add employees\nII.Remove Employees");
				System.out.println("5)IF YOU  DON'T WANT ANY DETAILS PRESS\"5\"");
				int saw=s.nextInt();
				switch (saw)
				{
				case 1: {
					System.out.println("THANK YOU FOR CHOOSING COMPANY & EMPLOYEES DETAILS....\3");
					System.out.println("WE HAVE 2 COMPANIES SELECT WHICH ONE YOU WANT TO SEE..\n1.DEVELOPER-TECH\n2.TECH-YENDRA\n3.Exit");
					int res=s.nextInt();
					switch (res) {
					case 1:{  Company C1=new Company("TECH-DEVELOPERS","BANGALORE","KRISHNA.E",3);
					System.out.println("\t\"COMPANY DETAILS\"");	        
					C1.detailsofcompany();
					System.out.println("\t\"OUR  DEVELOPING EMPLOYEES DETAILS\"");
					C1.E1.detailsofemployees();
					C1.E2.detailsofemployees();
					C1.E3.detailsofemployees();
					C1.E5.detailsofemployees();
					C1.E6.detailsofemployees();
					C1.E7.detailsofemployees();
					C1.E8.detailsofemployees();
					System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					System.out.println("\t\t\"THANK YOU\"\3\3\3");
						         
						break;}
					case 2:{
						  Company C2=new Company("TEST-YENDRA","CHENNAI","SIVA.M",3);
						  System.out.println("\t\"COMPANY DETAILS\"");
						  C2.detailsofcompany();
						  System.out.println("\t\"OUR TESTING EMPLOYEES DETAILS\"");
						  C2.E13.detailsofemployees();
						  C2.E14.detailsofemployees();
						  C2.E15.detailsofemployees();
						  C2.E16.detailsofemployees();
						  C2.E17.detailsofemployees();
						  C2.E18.detailsofemployees();
						  C2.E19.detailsofemployees();
						  System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						  System.out.println("\t\t\"THANK YOU\"\3\3\3");
						break;}
						
						

					default:{ 	System.out.println("\t\t\"THANK YOU\"\3\3\3");
					}
					}
				break;}
				
				case 2:{
					System.out.println("THANK YOU FOR CHOOSING INSITUTE & STUDENT DETAILS & STAFF DETAILS\3");
					System.out.println("WE HAVE 2 Insitutes SELECT WHICH ONE YOU WANT TO SEE..\n1.Q-SPIDERS\n2.J-SPIDERS\n3.Exit");
					int res=s.nextInt();
					switch (res) {
					case 1:{
						 Insitutes I1=new Insitutes("Q-SPIDERS","CHENNAI","TABREZ");
						 System.out.println("\tOur Insitute Details...");
						 System.out.println();
						 I1.detailsofinsitutes();
						 System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");
						 System.out.println("\tOUR STAFFS DETAILS...");
						 System.out.println();
						  Company C3=new Company();
				           C3.E26.detailsofemployees();
				           C3.E27.detailsofemployees();
				           C3.E28.detailsofemployees();
				           C3.E29.detailsofemployees();
				           C3.E30.detailsofemployees();
				           System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				           System.out.println("\tOur Students Details....");
				           System.out.println();
							 I1.S1.detailsofstudents();
							 I1.S2.detailsofstudents();
							 I1.S3.detailsofstudents();
							 I1.S4.detailsofstudents();
							 I1.S5.detailsofstudents();
							 I1.S6.detailsofstudents();
							 I1.S7.detailsofstudents();
							 I1.S8.detailsofstudents();
							System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
				           
						break;}
	
					case 2:{
						Insitutes I2=new Insitutes("J-SPIDERS","BANGALORE","RAJKIRAN");
						 Company C3=new Company();
						 System.out.println("\tOur Insitute Details...");
						 System.out.println();
						 I2.detailsofinsitutes();
						 System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");
						 System.out.println("\tOUR STAFFS DETAILS...");
						 System.out.println();
						  C3.E31.detailsofemployees();
				           C3.E32.detailsofemployees();
				           C3.E33.detailsofemployees();
				           C3.E34.detailsofemployees();
				           C3.E35.detailsofemployees();
				           System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");
						System.out.println("\t\"OUR STUDENTS DETAILS\"");
						System.out.println();
						 I2.S9.detailsofstudents();
						 I2.S10.detailsofstudents();
						 I2.S11.detailsofstudents();
						 I2.S12.detailsofstudents();
						 I2.S13.detailsofstudents();
						 I2.S14.detailsofstudents();
						 I2.S15.detailsofstudents();
						 I2.S16.detailsofstudents();
						 System.out.println("<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>");
						System.out.println("\t\t\"THANK YOU\"\3\3\3");
				break;}
                default:  	System.out.println("\t\t\"THANK YOU\"\3\3\3");
					}
		   break;}
				case 3:{
					 Qspceo ref=new  Qspceo();
					 ref.detailsofceo();
					System.out.println("\t\t\"THANK YOU\"\3\3\3");
					break;}
				case 4:{do{
					System.out.println("Before You entering please confirmation your ceo or not...?");
					if(verify()) {
			   System.out.println("select which one you do....\n1.Add Employees\n2.Remove Employees\n3.Exit");
               int key=s.nextInt();
               switch (key) {
			case 1:{
				Employees E=new Employees();
				E.addemployee();
				System.out.println("\t\t\"THANK YOU\"\3\3\3");
				break;}
			case 2:{
				Employees E=new Employees();
				 E.removeemployee();
				 System.out.println("\t\t\"THANK YOU\"\3\3\3");
				 break;}
				
				

			default:{  System.out.println("\t\t\"THANK YOU\"\3\3\3");
			}
				
			}}else {
				System.out.println("YOUR VERIFICATION FAILED.");
				System.out.println("If you try again please press\"1\"");
				System.out.println("If you don't try again please press\"2\"");
				int ress=s.nextInt();
				
				if(ress==1) {
				     x=1;	
				}else {
					x=0;
				}
			}
            }while(x==1);
            break;}
				default:{
					       System.out.println("If you don't want to see  any one... ");
					       System.out.println("\t\t\"THANK YOU\"\3\3\3");
				}
				
				
				}
				System.out.println("If you want use again ceo page  press\"1\"");
				System.out.println("If you don't want to use  again  press\"2\"");
				int ress=s.nextInt();
				if (ress==1) {
					y=1;
				} else {
					y=0;}
				}while(y==1);
		System.out.println("Thank You For Using Ceo Page..!!!");      
		System.out.println("\t\t\"Visit Again\"");      
				
				

				
			}
			static int y;
		
			
			public static boolean verify() {
				System.out.println("Please Enter Your Enter The password....");
				//s.nextLine();
			int pass=s.nextInt();
				if (pass==password) {
					System.out.println("Verification succesfull");
					System.out.println("now You eligible to Access To anywhere...");
					return true;
				}
					return false;
			}
			 


	
	 
	    // main() method start  
	    public static void heart() {  
	      
	        // declare and initialize variable for output size  
	        final int size = 8;  
	        final String msg = "Thank you";  
	          
	        // nested for loop to print the upper part of Heart  
	        for (int m = 0; m < size; m++) {  
	            for (int n = 0; n <= 4 * size; n++) {  
	                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
	                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
	   
	                if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
	                    System.out.print('*');  
	                } else {  
	                    System.out.print(' ');  
	                }  
	            }  
	            System.out.print(System.lineSeparator());  
	        }  
	          
	        // for loop to print the lower part of Heart  
	        for (int m = 1; m <= 2 * size; m++) {  
	            for (int n = 0; n < m; n++) {  
	                System.out.print(' ');  
	            }  
	   
	            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
	                if (m >= 2 && m <= 4) {  
	                    int position = n - (4 * size - 2 * m - msg.length()) / 2;  
	                    if (position < msg.length() && position >= 0) {  
	                        if (m == 3) {  
	                            System.out.print(msg.charAt(position));  
	                        } else {  
	                            System.out.print(' ');  
	                        }  
	                    }  
	                    else {  
	                        System.out.print('*');  
	                    }  
	                }  
	                else {  
	                    System.out.print('*');  
	                }  
	            }  
	            System.out.print(System.lineSeparator());  
	        }  
	    }
}    
	    
	

	 

		

