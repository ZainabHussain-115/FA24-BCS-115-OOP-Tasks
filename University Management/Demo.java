public class Demo{
	public static void main(String[] args){
	
			SystemUnit [] system1={ new SystemUnit("core i7",16,1028,"ABCD-1234","HP"),
									 new SystemUnit("core i8",16,1028,"ABCD-1234","Dell")};

			SystemUnit [] system2={ new SystemUnit("core i9",16,1028,"EFGH-1234","HP"),
									 new SystemUnit("core i8",16,1028,"EFGH-1234","Dell")};

			SystemUnit [] system3={ new SystemUnit("core i5",8,1028,"IJKL-1234","HP"),
									 new SystemUnit("core i5",8,1028,"IJKL-1234","Dell")};

			SystemUnit [] system4={ new SystemUnit("core i9",16,1028,"MNOP-1234","HP"),
									 new SystemUnit("core i8",16,1028,"MNOP-1234","Dell")};

 		Lab[] lab1={new Lab("\nComputing Lab ",new Employee("Zainab Hussain", "Manager"),system1,true),
					new Lab("\nGeneral Lab ",new Employee("Bismah Akhtar", "Manager"),system2,true)};
 		Lab[] lab2={new Lab("\nPharm D Lab ",new Employee("Farhan Baloch", "Manager"),system3,true),
					new Lab("\nEnglish Lab ",new Employee("Asna Ejaz", "Manager"),system4,true)};


		Department[] department1={new Department("Department of Computer Science",new Employee("Danish Hussain","HOD"),lab1,new Employee("Ali Ahmad","Lab Incharge")),
									new Department("\nDepartment of Software Engineering",new Employee("Ayesha Hussain","HOD"),lab1,new Employee("Ahmad Akhtar","Lab Incharge"))};
		Department[] department2={new Department("Department of Medicine",new Employee("Abdul Wahab","HOD"),lab2,new Employee("Gul-e-Hira","Lab Incharge"))};
		Department[] department4={new Department("Linguistic Department",new Employee("Danish Khan","HOD"),lab1,new Employee("Ali Aslam","Lab Incharge"))};

		Campus campus1=new Campus("\nLahore Campus\n",department1);
		Campus campus2=new Campus("\nIslamabad Campus\n",department2);
		Campus campus3=new Campus("\nFaislabad Campus\n",department4);


		System.out.println(campus1);
		System.out.println(campus2);
		System.out.println(campus3);

	}
}



