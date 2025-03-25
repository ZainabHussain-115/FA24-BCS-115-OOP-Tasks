public class School{
	String name;
	String address;
	Principal principal;
	Classroom[] classroom= new Classroom[2];

	School(String name,String address,Principal principal,Classroom[] classroom){
			this.name= name;
			this.address=address;
			this.principal=principal;
			this.classroom=classroom;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;		
	}

	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;		
	}

	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append(name);
		sb.append(address);
		sb.append(principal);
		for(int i=0; i<classroom.length;i++){
			sb.append(classroom[i]);
		}
		return sb.toString();
	}


}