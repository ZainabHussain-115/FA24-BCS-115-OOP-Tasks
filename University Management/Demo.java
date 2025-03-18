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

 		Lab lab1=new Lab("CS Lab ",new Employee("Zainab Hussain", "Manager"),system1,true);
		Lab lab2=new Lab("SE Lab ",new Employee("Bismah Akhtar", "Manager"),system2,true);
 		Lab lab3=new Lab("Pharm D Lab ",new Employee("Farhan Baloch", "Manager"),system3,true);
		Lab lab4=new Lab("English Lab ",new Employee("Asna Ejaz", "Manager"),system4,true);

		System.out.println(lab1);
		System.out.println(lab2);
		System.out.println(lab3);
		System.out.println(lab4);
	}
}


