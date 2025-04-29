public class RegistredListener extends Person{
	int listenerID;

	RegistredListener(String name, int listenerID){
		super(name);
		this.listenerID=listenerID;
	}

	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		sb.append("\nName: ").append(name);
		sb.append("\nListener ID: ").append(listenerID);
		return toString();
	}
	/*
	@Override
	public boolean equals(Object obj){
		RegistredListener registredListener= (RegistredListener) obj;
		return registredListener.listenerID.equals(obj);
	}
*/
	public void setListenerID(int listenerID){
		this.listenerID=listenerID;
	}
	public int getlistenerID(){
		return listenerID;
	}




}