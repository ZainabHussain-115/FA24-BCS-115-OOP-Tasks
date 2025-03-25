public class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
/*
	public String toString(){
		return String.format("\n Person Details:\nName: %s\nAge: %s\n", name, age);
	}
*/
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;		
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;		
	}

}