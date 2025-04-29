public class Person{
	public String name;

	Person(String name){
		this.name=name;

	}

	@Override
	public String toString(){
		return String.format("\n%s Name: ",name);

	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}