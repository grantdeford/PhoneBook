import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class PhoneBook {
	
	private ArrayList<Person> personalRecord = new ArrayList<Person>();
	private ArrayList<Address> personalAddress = new ArrayList<Address>();
	Scanner scanner = new Scanner(System.in);
	public PhoneBook() {
		
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
		scanner.nextLine();
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
		//Scanner scanner2 = new Scanner(System.in);
		int option;
		do {
			System.out.println("How would you like to search for a record?");
			System.out.println("1. Search for an existing record?");
			System.out.println("2. Search a record by first name?");
			System.out.println("3. Search a record by last name?");
			System.out.println("4. Search a record by full name(first name, middle name, and last name?");
			System.out.println("5. Search a record by telephone number?");
			System.out.println("6. Search a record by city?");
			System.out.println("7. Search a record by state?");
			option = scanner.nextInt();
				scanner.nextLine();
				
				switch(option) {
				
				case 1: 
					System.out.println("Searching existing records.");
					
					//statements
					//statements
					break;
				case 2:
					System.out.println("Searching records by first name.");
					//statements
					
					break;
					
				case 3: 
					System.out.println("Searching records by last name.");
					//statements
					
					break;
				
				case 4: 
					System.out.println("Searching records for full name.");
					//statements
					
					break;
					
				case 5:
					System.out.println("Searching records by telephone number.");
					
					//statements
					
					break;
					
				case 6: 
					System.out.println("Searching records by city.");
					//statements
					
					break;
					
				case 7:
					System.out.println("Searching records by state.");
					//statements
					
					break;
					
					
				default:
					System.out.println("Invalid option, please try again");
					
				}
				
		}while(option.equals("8") == false;
		
		
	
			
			
	
	}
	public void showAllRecords() {
		//method
		//must be in ascending order--for loop
		// A sample Java program to sort an array of strings
		// in ascending and descending orders using Arrays.sort().
		
		 
		public class SortExample
		{
		    public static void main(String[] args)
		    {
		        String arr[] = {"practice.geeksforgeeks.org",
		                        "quiz.geeksforgeeks.org",
		                        "code.geeksforgeeks.org"
		                       };
		 
		        // Sorts arr[] in ascending order
		        Arrays.sort(arr);
		        System.out.printf("Modified arr[] : \n%s\n\n",
		                          Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		new PhoneBook();
		}

}
