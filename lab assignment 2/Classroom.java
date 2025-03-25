public class Classroom{
	String name;
	String classCode;
	Teacher teacher;
	final static int MAX=5;
	Student[] student=new Student[MAX];
	int count;

	Classroom(String name,String classCode,Teacher teacher,Student[] student){
			this.name= name;
			this.classCode=classCode;
			this.teacher=teacher;
			this.student=student;
			this.count=0;
			 for (int i = 0; i < MAX && i <5; i++) {
  				  addStudent(student[i]);
			}

	}

	 public boolean addStudent(Student st) {

		 for (int i = 0; i < count; i++) {
      			  if (student[i].equals(st)) { 
           				 System.out.println("\n\nCannot enroll student " + st.getName() + " (Roll No: " + st.getRollno() + ") – Duplicate roll number!\n");
        				    return false;
      		  }
  	  }
        	if (count >= MAX) {
            		System.out.println("\n\nCannot enroll the student " + st.getName() + ": Class is full!");
           		 return false;
      		  }
       		 student[count++] = st;
      		  return true;
    }



	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;		
	}

	public void setClassCode(String classCode){
		this.classCode = classCode;
	}
	public String getClassCode(){
		return classCode;		
	}

	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append(name);
		sb.append(classCode);
		sb.append(teacher);
		for(int i=0; i<student.length;i++){
			sb.append(student[i]);
		}
		return sb.toString();
	}

}