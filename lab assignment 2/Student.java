public class Student extends Person{
	String rollno;
		Student(String name,int age,String rollno){
		super(name,age);
		this.rollno=rollno;
	}

	public String toString(){
			return String.format("\n Student :\nName: %s\nAge: %s\nRoll no:%s\n", name, age,rollno);
	}
	public void setRollno(String rollno){
		this.rollno = rollno;
	}
	public String getRollno(){
		return rollno;		
	}

@Override
		public boolean equals(Object obj){
		Student student=(Student)obj;
		return this.rollno.equals(student.rollno);
	}


}