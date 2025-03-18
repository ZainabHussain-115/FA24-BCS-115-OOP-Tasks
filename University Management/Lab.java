public class Lab{
 	private String name;
	Employee labStaff;
	SystemUnit system[]=new SystemUnit[50];
	boolean hasMultiMedia;

	
                             //Constructor
	Lab( String name,Employee labStaff,SystemUnit system[],boolean hasMultiMedia){
			this.name=name;
			this.labStaff=labStaff;
			this.system=system;
			this.hasMultiMedia=hasMultiMedia;
	}
                     //toString
	public String toString(){
		StringBuilder st=new StringBuilder();
		st.append(name);
		st.append(labStaff);
		for (int i=0;i<system.length;i++){
			st.append(system[i]);
		}

		return st.toString();

	}

                          //SETTERS AND GETTERS

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;		
	}

	public void setHasMultiMedia(boolean hasMultiMedia){
		this.hasMultiMedia = hasMultiMedia;
	}
	public boolean getHasMultiMedia(){
		return hasMultiMedia;		
	}
}