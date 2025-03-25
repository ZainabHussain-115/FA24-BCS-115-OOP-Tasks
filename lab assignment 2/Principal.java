public class Principal extends Person{
		int experience;
		Principal(String name,int age,int experience){
		super(name,age);
		this.experience=experience;
	}

	public String toString(){
			return String.format("\n Principal Details:\nName: %s\nAge: %s\nExperience:%d\n", name, age,experience);
	}
	public void setExperience(int experience){
		this.experience = experience;
	}
	public int getExperience(){
		return experience;		
	}



}