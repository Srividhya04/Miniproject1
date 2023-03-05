package PlainResv;

public class Plain {
	private int plainNo;
    private	boolean economy;
	private int capacity;
	
    Plain(int no,boolean economy,int cap){
	this.plainNo = no;
	this.economy = economy;
	this.capacity = cap;
	
}
    public int getCapacity() {
    	return capacity;
    }  
    
    public void setCapacity(int cap) {
    	capacity = cap;
    }
  	public boolean isEconomy() {
    	return economy;
    }
    public void setEconomy(boolean val) {
    	economy = val;
    }
    public int getPlainNo() {
		return plainNo;
    }
    public void displayPlainInfo() {
    	System.out.println("PlainNo:" + plainNo + "Economy:" + economy+ "Total Capacity:"+ capacity);
    	
    }
	
		
	}

