public class Campus{
	private String name;
	Department departments[];

	Campus(String name, Department[] departments){
		this.name= name;
		this.departments=departments;
	}

	//toString
	public String toString(){
		
		StringBuilder sb=new StringBuilder();
		sb.append(name);
		for (int i=0;i<departments.length;i++){
			sb.append(departments[i]);
		}
		return sb.toString();
	}
	//Setters and getters
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	
}