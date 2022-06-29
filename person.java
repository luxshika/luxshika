class person
{
	public String name;
	public int age;
	
	public person()
	{
		
	}
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void printDetail()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class student extends person
{
	public String university;
	public int level;
	
	public student(String name,int age,String university,int level)
	{
		super(name,age);
		this.university=university;
		this.level=level;
	}
	public void printDetail()
	{
		super.printDetail();
		System.out.println("University: "+university);
		System.out.println("Level: "+level);
	}
}

class employee extends person
{
	public double salary;
	public String employer;
	
	public employee(String name,int age,String employer,double salary)
	{
		super(name,age);
		this.employer=employer;
		this.salary=salary;
	}
	public void printDetail()
	{
		super.printDetail();
		System.out.println("Employer: "+employer);
		System.out.println("Salary: "+salary);
	}
}

class programmer extends employee
{
	public String designation;
	public String language;
	
	public programmer(String name,int age,String designation,double salary,String employer)
	{
		super(name,age,employer,salary);
		this.designation=designation;
	}
	public void setLanguage(String language)
	{
		this.language=language;
	}
	public void printDetail()
	{
		super.printDetail();
		System.out.println("Designation: "+designation);
		System.out.println("Language: "+language);
	}
}

class lecturer extends employee
{
	public String designation;
	public int grade;
	
	public lecturer(String name,int age,String designation,double salary,String employer)
	{
	    super(name,age,employer,salary);
		this.designation=designation;
	}
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	public void printDetail()
	{
		super.printDetail();
		System.out.println("Designation: "+designation);
		System.out.println("Grade: "+grade);
	}
}

class main 
{
	public static void main(String args[])
	{
		programmer p1 = new programmer("David",27,"Programmer",100000.00,"ABS Software Ltd.");
		p1.setLanguage("Java");
		p1.printDetail();
		
		System.out.println();
		System.out.println();
		
		lecturer l1 = new lecturer("John",30,"Lecturer",200000.00,"University of Jaffna.");
		l1.setGrade(1);
		l1.printDetail();
	}
}