package Ceo;

public class Student1 {

	 String name,sub,ratings;
	    Student1(){
			
	    }
		 Student1(String name,String sub,String ratings){
			   this.name=name;
			   this.sub=sub;
			   this.ratings=ratings;
			   }
			   //behaviours
			   void detailsofstudents(){
				System.out.println("THE STUDENT NAME IS:"+name);
				System.out.println("THE STUDENT SUB IS:"+sub);
				System.out.println("THE STUDENT RATINGS IS:"+ratings);
				System.out.println("******************************************");
			   }

	}

