public class Teacher extends Person{
	String subject;
	String id;
	Teacher(String name,int age,String subject, String id){
		super(name,age);
		this.subject=subject;
		this.id=id;
	}

	public String toString(){
		return String.format("\nTeacher Details:\n\nName:%s\nAge:%d\nSubject: %s\nID: %s\n",name,age,subject, id);
	}
	public void setSubject(String subject){
		this.subject = subject;
	}
	public String getSubject(){
		return subject;		
	}

	public void setID(String id){
		this.id = id;
	}
	public String getID(){
		return id;		
	}
@Override
		public boolean equals(Object obj){
		Teacher teacher=(Teacher)obj;
		 if (this.id.equals(teacher.id)) {
       			 System.out.println("\n\nDuplicate teacher ID found: " + teacher.id);
   		 }
		return this.id.equals(teacher.id);
	}



}