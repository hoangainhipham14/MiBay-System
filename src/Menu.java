import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	private Scanner console = new Scanner(System.in);
	
	public void displayMenu() {
		System.out.printf("\n*** MiBayApplication System Menu ***\n\n");

		System.out.printf("%-50s %s\n", "Add Customer", "AC");
		System.out.printf("%-50s %s\n", "Add Product", "AP");
		System.out.printf("%-50s %s\n", "Prepare order", "PP");
		System.out.printf("%-50s %s\n", "Display ALL Deliveries (Sorted by name)", "DA");
		System.out.printf("%-50s %s\n", "Delivery Search (Display deliveries on date)", "DS");
		System.out.printf("%-50s %s\n", "Remove Product","RP");
		System.out.printf("%-50s %s\n", "Seed Data","SD");
		System.out.printf("%-50s %s\n", "Exit Program","EX");
		System.out.println("\nEnter selection: ");
	}
	
	public void addCustomer() {
		System.out.println("Enter customer details:\n\n");
		
		System.out.println("Enter first name:   ");
		String firstName = console.nextLine();
		
		System.out.println("Enter last name:   ");
		String lastName = console.nextLine();
		
		System.out.println("Enter street number:   ");
		String streetNum = console.nextLine();
		
		System.out.println("Enter street name:   ");
		String streetName = console.nextLine();
		
		System.out.println("Enter suburb:   ");
		String suburb = console.nextLine();
		
		System.out.println("Enter post code:   ");
		String postCode = console.nextLine();
		
		System.out.printf("%s %s was successfully added to the system.", firstName, lastName);
	}
	
	public void addProduct() {
		System.out.println("Enter product detail:");
		
		System.out.println("Enter name:   ");
		String name = console.nextLine();
		
		System.out.println("Enter weight:   ");
		double weight = console.nextDouble();
		
		System.out.println("Enter cost:   ");
		double cost = console.nextDouble();
		
		System.out.printf("%s was successfully added to the system.", name);
	}
	
	public void selectProduct(ArrayList<Product> products) {
		System.out.println("Please choose a product from the list");
		for (int i = 0; i < products.size(); i++) {
			int j = i + 1;
			System.out.printf("%d. %s", j, products.get(i).getName());
		}
		
		System.out.println("Input");
		int input = console.nextInt();
	}
	
	public void prepareOrder(ArrayList<Customer> customers, ArrayList<Product> products) {
		System.out.println("Please choose a customer from the list:");
		for (int i = 0; i < customers.size(); i++) {
			int j = i + 1;
			System.out.printf("%d. %s", j, customers.get(i).getName());
		}
		
		System.out.println("Input");
		int input = console.nextInt();
		String name = customers.get(input).getName();
		
		selectProduct(products);
		
		System.out.println("Please enter the delivery date:");
		
		System.out.println("Enter Day: ");
		int day = console.nextInt();
		
		System.out.println("Enter Month");
		int month = console.nextInt();
		
		System.out.println("Enter Year");
		int year = console.nextInt();
		
		System.out.println("Would you like to add another product? (Y/N)");
		
		String choice = console.nextLine().toUpperCase();
		
		while(choice.equals("Y") )
		{
			selectProduct(products);
		}
		
		System.out.println("Is this the Platinum Package (Y/N)");
		choice = console.nextLine().toUpperCase();
		
		if(choice.equals("Y"))
		{

			System.out.println("Please input your member number: ");
			String memberNumber = console.nextLine();                               
		}
		System.out.println("Package for" + name + "was successfully prepared.");
	}
	
}
