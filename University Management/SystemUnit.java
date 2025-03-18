public class SystemUnit{

	private String cpuName;
	private int ramSize;
	private int diskSize;
	private String systemID;
	private String lcdModel;

	SystemUnit(	String cpuName,int ramSize,int diskSize,String systemID,String lcdModel){
		this.cpuName=cpuName;
		this.ramSize=ramSize;
		this.diskSize=diskSize;
		this.systemID=systemID;
		this.lcdModel=lcdModel;

	}


	public String toString(){
		return String.format("\n SystemUnit Details:\n CPU Name: %s\n RAM Size: %d GBs\n Disk Size: %s GBs\n System ID: %s \n LCD Model: %s \n",cpuName,ramSize,diskSize,systemID,lcdModel);
	}

                                                                                    //setters and getters for all variables

	public void setCPUName(String cpuName){
		this.cpuName=cpuName;
	}
	public String getCPUName(){
		return this.cpuName;	
	}

	public void setRamSize(int ramSize){
		this.ramSize=ramSize;
	}
	public int getRamSize(){
		return this.ramSize;	
	}

	public void setDiskSize(int diskSize){
		this.diskSize=diskSize;
	}
	public int getDiskSize(){
		return this.diskSize;	
	}

	public void setSytstemID(String systemID){
		this.systemID=systemID;
	}
	public String getSystemID(){
		return this.systemID;	
	}

	public void setLcdModel(String lcdModel){
		this.lcdModel=lcdModel;
	}
	public String getLcdModel(){
		return this.lcdModel;	
	}
}