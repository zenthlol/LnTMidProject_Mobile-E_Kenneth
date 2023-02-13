import java.util.Vector;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	
	static Vector<Vehicle> vehicle = new Vector<Vehicle>();
	
	public static void main(String[] args) {
		
		int input = 0;
		boolean counter = false;
		
		do {
			System.out.println("Input the number :");
			System.out.println("1. Input");
			System.out.println("2. View");
			
			try {
				input = scanner.nextInt();
				if(input == 1) {
					input();
				}
				else if(input == 2) {
					display();
					finalDisplay();
			
				}
				else if(input < 1 || input > 2) {
					System.out.println("Input has to be 1 or 2");
				}
				else {
					counter = true;
				}
			}catch(Exception e) {
				scanner = new Scanner(System.in);
				System.out.println("Input has to be a number");
			}
		}while(counter == false);
	}
	
	
	public static void input() {
		
		String type = "", brand = "", name = "", license = "", sType = "";
		Integer topSpeed = 0, gasCapacity = 0, wheel = 0, Attribute = 0;
		
		while(true) {
			System.out.print("Input type [Car | Motorcycle]: ");
			type = scanner.next();
			if(type.equalsIgnoreCase("Car") || type.equalsIgnoreCase("Motorcycle")){
				break;
			}
			else {
				System.out.println("Input has to be Car or Motorcycle");
			}
		}
		
		while(true) {
			
			System.out.print("Input brand [>= 5]: ");
			brand = scanner.next();
			if(brand.length() >=5 ){
				break;
			}
			else {
				System.out.println("Input has to be >= 5 characters");
			}
		}
		
		while(true) {
			System.out.print("Input name [>= 5]: ");
			name = scanner.next();
			if(name.length() >=5 ){
				break;
			}
			else {
				System.out.println("Input has to be >= 5 characters");
			}
		}
		
		scanner.nextLine();
		while(true) {
			
			System.out.print("Input license: ");

			license = scanner.nextLine();
			
			
			String regex = "^[A-Z ]+{1}[0-9 ]+{1,4}[A-Z]{1,3}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(license);
			if(m.matches()) {
				
				break;
			}
			else {
				
				System.out.println("Input has to be a single capital letter *space* 1-4 numbers *space* 1-3 capital letters");
				
			}
		}
		
		while(true) {
			try{
				System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
				topSpeed = scanner.nextInt();
				if(topSpeed >= 100 && topSpeed <= 250){
					break;
				}
				else {
					System.out.println("Input has to be between 100 - 250");
				}
			}catch(Exception e) {
				scanner = new Scanner(System.in);
				System.out.println("Input has to be a number");
				continue;
			}
		}

		while(true) {
			try{
				System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
				gasCapacity = scanner.nextInt();
				if(gasCapacity >= 30 && gasCapacity <= 60){
					break;
				}
				else {
					System.out.println("Input has to be between 30 - 60");
				}
			}catch(Exception e) {
				scanner = new Scanner(System.in);
				System.out.println("Input has to be a number");
				continue;
			}
		}

		

		if(type.equalsIgnoreCase("Car")) {
			while(true) {
				try{
					s.wheel();
					wheel = scanner.nextInt();
					if(wheel >= 4 && wheel <= 6){
						break;
					}
					else {
						System.out.println("Input has to be between 4 - 6");
					}
				}catch(Exception e) {
					scanner = new Scanner(System.in);
					System.out.println("Input has to be a number");
					continue;
				}
			}
			
			while(true) {
				s.specificType();
				sType = scanner.next();
				if(sType.equalsIgnoreCase("SUV") || sType.equalsIgnoreCase("Supercar") || sType.equalsIgnoreCase("Minivan")){
					break;
				}
				else {
					System.out.println("Input must be SUV, Supercar, or Minivan");
				}
			}
			
			while(true) {
				try{
					s.specificAttribute();
					sAttribute = scanner.nextInt();
					if(sAttribute >= 1){
						break;
					}
					else {
						System.out.println("Input has to be >= 1");
					}
				}catch(Exception e) {
					scanner = new Scanner(System.in);
					System.out.println("Input has to be a number");
					continue;
				}
			}
		}	
		else if(type.equalsIgnoreCase("Motorcycle")) {
			
			while(true) {
				try{
					s.wheelM();
					wheel = scanner.nextInt();
					if(wheel == 2){
						break;
					}
					else {
						System.out.println("Input has to be 2");
					}
				}catch(Exception e) {
					scanner = new Scanner(System.in);
					System.out.println("Input has to be a number");
					continue;
				}
			}
			
			while(true) {
				s.specificTypeM();
				sType = scanner.next();
				if(sType.equalsIgnoreCase("Manual") || sType.equalsIgnoreCase("Matic")){
					break;
				}
				else {
					System.out.println("Input has to be Manual or Matic");
				}
			}
		
			while(true) {
				try{
					s.specificAttributeM();
					sAttribute = scanner.nextInt();
					if(sAttribute >= 1){
						break;
					}
					else {
						System.out.println("Input has to be >= 1");
					}
				}catch(Exception e) {
					scanner = new Scanner(System.in);
					System.out.println("Input has to be a number");
					continue;
				}
			}
		}
		
		


}
