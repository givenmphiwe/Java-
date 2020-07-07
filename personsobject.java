
public class personsobject {
	
	//my variables
	
	String name;
	int telephone;
	String emailaddress;
	String physicaladdress ;
	public char[] toString;
	
	//creating the constructor for my class
	public personsobject (String name, int telephone, String emailaddress, String physicaladdress) {
		
		this.name = name;
		this.telephone = telephone;
		this.emailaddress = emailaddress;
		this.physicaladdress = physicaladdress;
	}
	//methods
	public String getname() {
		return name;
	}
	public String getemailaddress() {
		return emailaddress;
	}
	public String getphysicaladdress() {
		return physicaladdress;
	}
	//to string 
	public String toString() {
		
		String result = "Enter name: " + name;
		result += "Enter the telephone number: " + telephone;
		result = "Enter the emailaddress: " + emailaddress;
		result = "Enter the physical address: " + physicaladdress;
		
		return result;
	}

}
