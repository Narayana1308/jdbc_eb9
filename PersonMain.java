package prepare_Statement1;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		PersonCRUD crud=new PersonCRUD();
		boolean exit=true;
		do {
			System.out.println("Enter the choice \n 1.Insert peerson \n 2.updated person \n 3.delete person \n 4.get person details");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:{
				System.out.println("Enter the id");
				int id=scanner.nextInt();
				System.out.println("Enter the name");
				String name=scanner.next();
				System.out.println("Enter the phone number ");
				long phone=scanner.nextLong();
				try {
					crud.savePerson(id, name, choice);
				} catch (Exception e) {
					System.out.println("404 not found");
				}
				break;
			}
			case 2:{
				
			}
			
			}
     		}while(exit);
//		System.out.println("Enter  the phone number");
//		long phone=scanner.nextLong();		
//		try {
//			crud.savePerson(id, name, phone);
//		} catch (Exception e) {
//			System.out.println("404 not found");
//		}
//		try {
//			crud.updatePerson(id, name);
//		} catch (Exception e) {
//		    System.out.println("404 not found");
//		}
//		try {
//			crud.deletePerson(id);
//		} catch (Exception e) {
//			System.out.println("404 not found");
//		}

		try {
			crud.getPersonDetails();
		} catch (Exception e) {
			System.out.println("4044 not found");
		}
	}

}
