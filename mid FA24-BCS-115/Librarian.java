public class Librarian extends Person{
	int yearsOfService;

	Librarian(String name, int yearsOfService){
		super(name);
		this.yearsOfService=yearsOfService;
	}

	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("\nName: ").append(name);
		sb.append("\nYears of Service: ").append(yearsOfService);
		return toString();
	}


	public void setYearsOfService(int yearsOfService){
		this.yearsOfService=yearsOfService;
	}
	public int getYearsOfService(){
		return yearsOfService;
	}

}