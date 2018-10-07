package ru.murat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/**
*@author Murat
*
*/
public class Person {

	String getPhone() {
		return phone;
	}

	String getAddress() {
		return address;
	}

	String getName() {
		return name;
	}
	
	void setAdd(String add) {
		this.address = add;
	}

	// a bad code. But just to show that I know about exceptions
	// better to tell user that he is not correct in 
	// corrected
	void setPhone(String ph)  {
		/*
		if(!ph.matches("^[0-9]|(|)|-$"))
			throw new Exception("Ph number requires digits only");
		else */
			this.phone = ph;
	}

	void setName(String name)  {
		/*
		if(!name.matches("^\\D*$"))
			throw new Exception("Name cannot contain digits");
		else*/
			this.name = name;
	}
	private String phone;
	private String address;
	private String name;
	// data struct for hold info about 
	static Map<String,Person> persons = new HashMap<String,Person>();
	// By default ctor adds a person
	Person() throws Exception{
		this("","","");
	}
	Person(String phn,String adrs,String nm) throws Exception {
		if(phn==null|| adrs==null || nm ==null) {
			
			throw new Exception("wrong params to -ctor");
		}
		
		
		if(!phn.isEmpty())
				setPhone(phn);
		else
			setPhone("8800-655-35");
		if(!adrs.isEmpty() )
			setAdd(adrs);
		else	
			setAdd("улица Пушкина,д10-16");
		if(!nm.isEmpty())
			setName(nm);
		else
			setName("Вася");
		// hold a person
		persons.put(this.name, this);
	}

	 @Override
	public String toString(){ 
		 return new String(this.name + "	 " + this.address + "	    " + this.phone);
	 }
}
