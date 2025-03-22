public class Department{
	String name;
	Employee hod;
	Lab lab[]=new Lab[4];
	Employee labIncharge;

             //Constructor
	Department(String name,Employee hod,Lab lab[],Employee labIncharge){
		this.name=name;
		this.hod=hod;
		this.lab=lab;
		this.labIncharge=labIncharge;
	}

  	//toString
	public String toString(){
	
		StringBuilder st= new StringBuilder();
		st.append(name);
		st.append(hod);
		for (int i=0;i<lab.length;i++){
			st.append(lab[i]);
		}
		st.append(labIncharge);
		return st.toString();
	}

                          //SETTERS AND GETTERS

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;		
	}
}