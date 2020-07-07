
public class project {
	
	int projectnumber;
	String projctname;
	String buildingtype;
	int physicaladdress;
	double totalfee;
	double totalpaid;
	String projectdeadline;	
	
	//
	public project(double totalpaid2) {

	}
	public project(String projectdeadline2) {

	}
	public project(String projctname2, int projectnumber2, String buildingtype2, String physicaladdress2,
			double totalfee2, double totalpaid2, String projectdeadline2) {

	}

	//calculating the new total amount 
	public void totalpaid(double amount, double fee) {
		totalpaid =  amount + fee;
	}
	public double gettotalpaid() {
		return totalpaid;    //for getting  the total for total paid amount
	}
	
	
	public String toString() {
		
		String output  = "Enter the project number: " + projectnumber;
		output += "Enter the project name:" + projctname;
		output = "Enter type of building design (apartment or house):" + buildingtype;
		output += "Enter the physical address of the building: " + physicaladdress;
		output += "Enter the total fee: " + totalfee;
		output += "Enter the total amount paid: " + totalpaid;
		output = "Enter the month when project deadline is: " + projectdeadline;
		
		return output;
		
		
	}
	
}
