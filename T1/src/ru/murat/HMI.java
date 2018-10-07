package ru.murat;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



/**
*@author Murat
*
*/
public class HMI {

	private static void saveToTile() {}
	
	
	

	static void help() {
		
		System.out.println("Welcome to contact info app\n"+
							"You are able to save info of a single person:"+
							"name,address,phone.Name field is unique.\n"+
							"Attempt to insert data of another person with the same name will re-write related information");
	}
	

	static void insertPerson() {
		System.out.println("Insert data of a person:");
		System.out.printf("Insert name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		while(!name.matches("^\\D*$"))
		{
			System.out.println("No digits allowed in Name field.Try again");
			System.out.printf("Insert name:");
			name = sc.nextLine();
		}
		System.out.printf("Insert phone:");
		String phone = sc.nextLine();
		while(!phone.matches("^(\\d|\\(|\\)|-)*$"))
		{
			System.out.println("Only digits allowed in phone field.Try again");
			System.out.printf("Insert name:");
			phone = sc.nextLine();
		}
		System.out.printf("Insert address:");
		String adr = sc.nextLine();
		try {
			new Person(phone,adr,name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}

	static String inputName() {
		System.out.printf("Insert name:");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	static boolean showAperson() {
		String name1 = inputName();
		Person p;
		p = Person.persons.get(name1);
			if(p!=null) {
				System.out.println("Name:"+p.getName()+" Address:"+p.getAddress()+" Phone:"+ p.getPhone());
				return true;
			}
			else {
				System.out.println("Person named "+name1+" isn't in database");
				return false;
			}
}

	static String showAll() {
		int i=1;
		if(Person.persons.isEmpty()) {
			String ret = "Database is empty";
			System.out.println(ret);
			return ret;
		}
		    System.out.println("Persons:");
		    System.out.println("  Name	   |"+"Address	|"+"Phone");
		for(Person p: Person.persons.values()) {
			StringBuilder sb = new StringBuilder();
			sb.append(i++);
			sb.append(".");
			sb.append(p);
			System.out.println(sb);
		}
		return "ok";
	}
	
	static boolean deletePerson() {
		System.out.println("Choose name to delete:");
		String name1 = inputName();
		if(Person.persons.remove(name1)!=null) {
			System.out.println("Person named:"+name1+" has been deleted");
			return true;
		}
		else
		{
			System.out.println("Person named:"+name1+" hasn't been found");
			return false;
		}
	}
	static void deleteAll() {
		Person.persons.clear();
		System.out.println("No records are in database");
	}
	
	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		String stat;
		while(true) {
			System.out.println(
					"\t\tMain menu:\n"+
					"1- insertPerson\n"+
					"2- showAll\n"+
					"3- showPerson\n"+
					"4- deletePerson\n"+
					"5- deleteAll\n"+
					"6- help\n"+
					"0- exit"
					);
			System.out.printf("Choose menu item:");
			stat = sc.nextLine();
			switch(stat) {
			case "1":insertPerson();   break;
			case "2":showAll()   ;     break;
			case "3":showAperson();    break;
			case "4":deletePerson();   break;
			case "5":deleteAll();      break;
			case "6":help();		   break;
			case "0":/*saveToTile()*/; return;
			default: System.out.println("not found");
			}
		}
	}
}
