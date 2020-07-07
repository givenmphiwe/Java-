
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class poised {

	
	/**
	 * first are the variables
	 * the program will firstly print the menu where user will select one
	 * the try and catch its for when the user enter wrong input
	 * and projects are stored in text file..the try catch its for when user enters wrong input under if statements
	 * then when user has selected the add project ..everything he enters will be stored in text
	 * and other options are not stored in text
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		String name;
		int telephone;
		String emailaddress;
		int projectnumber;
		String projectname;
		String buildingtype;
		String physicaladdress;
		double totalfee;
		double totalpaid;
		String projectdeadline;	
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Poised stores\n");
			System.out.println("1. Add a project: ");
			System.out.println("2. Change due date: ");
			System.out.println("3. Change total amount: ");
			System.out.println("4. Update contractor's details: ");
			System.out.println("5. See all projects that still need to be completed");
			System.out.println("6. Projects that are past due date");
			
			System.out.println("Select your  1-4: ");
			input = scanner.nextLine();
		}
		catch (IOException e) {
			System.out.println("please select a valid option");
			
		}
		try {
			PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
			String text = "";
			
		   if (input.equals("1")) {
				
				System.out.println("enter project number:");
				text = scanner.next();
				pw.write(text + "\n");
				
				System.out.println("enter project name:");
				text = scanner.nextLine();
				pw.write(text + "\n");
				
				System.out.println("enter the type of building design:");
				text = scanner.nextLine();
				pw.write(text + "\n");
				
				System.out.println("write the physical address of the building: ");
				text = scanner.nextLine();
				pw.write(text + "\n");
				
				System.out.println("Enter the total fee:");
				text = scanner.next();
				pw.write(text + "\n");
				
				System.out.println("Enter the total amount paid: ");
				text = scanner.next();
				pw.write(text + "\n");
				
				System.out.println("write the month the deadline is: ");
				text = scanner.nextLine();
				
				//getting the users input 
				project building = new project(projectname, projectnumber, buildingtype, physicaladdress, totalfee, totalpaid, projectdeadline);
				System.out.println(building.toString());
				
			}else if(input.equals("2")) {
				System.out.println("Enter the new due date: ");
				projectdeadline = scanner.nextLine();
				
				//calling the project class and toString method
				
				project building = new project(projectdeadline);
				System.out.println(building.toString());
				
			}else if(input.contentEquals("3")) {
				System.out.println("Enter the new total amount: ");
				totalpaid = scanner.nextDouble();
				
				//calling the project class and to string method
				
				project building = new project(totalpaid);
				System.out.println(building.toString());
				
			}else if(input.equals("4")) {
				System.out.println("enter the name: ");
				name = scanner.nextLine();
				
				System.out.println("enter telephone number: ");
				telephone = scanner.nextInt();
				
				System.out.println("enter the emailaddress: ");
				emailaddress = scanner.nextLine();
				
				System.out.println("enter the physical address: ");
				physicaladdress = scanner.nextLine();
				
				personsobject worker = new personsobject(name, telephone, emailaddress, physicaladdress);
				System.out.println(worker.toString);
			}
			else if(input.equals("5")) {
				File file = new File("output.txt");
				Scanner scan = new Scanner(file);
				
				while (scan.hasNextLine()) {
					System.out.println(scan.nextLine());
				}
			}
		}
		catch (IOException e) {
			System.out.println("please write what is expected!");
		}
			
		

	}

}
