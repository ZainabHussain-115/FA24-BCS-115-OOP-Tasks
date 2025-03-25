public class Demo{
	public static void main(String[] args){
		Student[] student1={ new Student("Wahab",10,"FA-001"),	
							new Student("Ali",11,"FA-002"),
							new Student("Ahmed",10,"FA-003"),
							new Student("Aslam",10,"FA-004"),
							new Student("Ahmed",11,"FA-005")};
		Student[] student2={ new Student("Asna",15,"SP-001"),	
							new Student("Shizba",16,"SP-002"),
							new Student("Soha",14,"SP-002"),
							new Student("Bisma",15,"SP-004"),
							new Student("Ayesha",16,"SP-005"),
							new Student("Sana",16,"SP-006")};

		Classroom[] classroom1={ new Classroom("\nGrade-10 ","(G-10-A)",new Teacher("Ms. Shanza",30,"Physics","TCH-001"),student1),
								new Classroom("\nGrade-5 ","(G-5-B)",new Teacher("Sir. Danish",28,"Mathematics","TCH-100"),student2)}; 

		School school=new School("The Punjab School ","Township,Lahore\n",new Principal("Zainab Hussain",20,2),classroom1);
		System.out.println(school);
	}

}