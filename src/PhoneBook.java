import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	
	//private ArrayList<Person> personalRecord = new ArrayList<Person>();
	//private ArrayList<Address> personalAddress = new ArrayList<Address>();
	
	public PhoneBook() {
		Scanner scanner = new Scanner(System.in);
		String menuOptions;
		
		do {
			System.out.println("1. Add a new record.");
			System.out.println("2. Delete a record.");
			System.out.println("4. Update a record.");
			System.out.println("3. Search for a record.");
			System.out.println("5. Show all records.");
			System.out.println("6. Exit.");
			menuOptions = scanner.nextLine();
			
			if(menuOptions.equals("1")) {
				addRecord();
			}else if(menuOptions.equals("2")){
				deleteRecord();
			}else if(menuOptions.equals("3")) {
				updateRecord();
			}else if(menuOptions.equals("4")) {
				searchRecord();
			}else if(menuOptions.equals("5")) {
				showAllRecords();
			}
			
		}while(menuOptions.equals("6") == false);
		//scanner.close();
		
		///need to give choice to exit the program
	}
	
	public void addRecord() {
		//give the format per person class or array
		
		
	}
	public void deleteRecord() {
		//method
		//delete a record for a given tele number
	}
	public void updateRecord() {
		//method
		//switch case for various options in update record//minimum update record per tele number
	}
	public void searchRecord() {
		//method
		//switch case for various options in search record or can pull from arrayList???
		
	}
	public void showAllRecords() {
		//method
		//must be in ascending order--for loop
	}
	
	public static void main(String[] args) {
		
		new PhoneBook();
		}

}
