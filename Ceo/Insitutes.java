package Ceo;

public class Insitutes {

	//staes
	String iname,iloc,jstaff;
	Student1 S1=new Student1("SIVA","JAVA","RATINGS-*");
	Student1 S2=new Student1("KRISHNA","SQL","RATINGS-1");
	Student1 S3=new Student1("KIRUBA","JAVA","RATINGS-2");
	Student1 S4=new Student1("SEKAR","WEBTECH","RATINGS-*");
	Student1 S5=new Student1("SNEHA","WEBTECH","RATINGS-2");
	Student1 S6=new Student1("VIJAY","J2EE","RATINGS-1");
	Student1 S7=new Student1("PARTHA","SQL","RATINGS-*");
	Student1 S8=new Student1("PRIYANKA","J2EE","RATINGS-1");
	Student1 S9=new Student1("PREM","JAVA","RATINGS-2");
	Student1 S10=new Student1("PREM","SELINIUM","RATINGS-2");
	Student1 S11=new Student1("ALI","SQL","RATINGS-1");
	Student1 S12=new Student1("KALAI","AUTOMATION","RATINGS-2");
	Student1 S13=new Student1("SHINY","SELENIUM","RATINGS-*");
	Student1 S14=new Student1("GOKUL","JAVA","RATINGS-1");
	Student1 S15=new Student1("SHIVANGI","SQL","RATINGS-2");
	Student1 S16=new Student1("PUGAL","AUTOMATION","RATINGS-*");
	//construct
	Insitutes(){
		
	}
	Insitutes(String iname,String iloc,String jstaff){
		this.iname=iname;
		this.iloc=iloc;
		this.jstaff=jstaff;
	}
	//beahviours
	void detailsofinsitutes(){
		System.out.println("THE INSITUTES NAME IS:"+iname);
		System.out.println("THE LOCATIONS IS:"+iloc);
		System.out.println("THE STAFFS RATINGS IS:"+jstaff);
		System.out.println("****************************************");
	}

	}
