package ru.murat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
*@author Murat
*
*/
class testOnePers {


	@Test
	void testGetName() throws Exception {
		Person p = new Person();
		assertEquals(p.getName(),"Вася");
		p.persons.clear();
	}

	@Test
	void testGetPhone() throws Exception {
		Person p = new Person();
		assertEquals(p.getPhone(),"8800-655-35");
		p.persons.clear();
	}

	@Test
	void testGetAddr() throws Exception {
		Person p = new Person();
		assertEquals(p.getAddress(),"улица Пушкина,д10-16");
		p.persons.clear();
	}
	

	@Test
	void testSetAdd() throws Exception {
		Person p = new Person();
		p.setAdd("addtest");
		assertEquals(p.getAddress(),"addtest");
		p.persons.clear();
	}

	@Test
	void testSetPhone() throws Exception {
		Person p = new Person();
		p.setPhone("8");
		assertEquals(p.getPhone(),"8");
		p.persons.clear();
	}

	@Test
	void testSetName() throws Exception {
		Person p = new Person();
		p.setName("Петя");
		assertEquals(p.getName(),"Петя");
		p.persons.clear();
	}
	
	@Test()
	void testPerson() throws Exception {
		  Assertions.assertThrows(Exception.class, () -> new Person(null,null,null));
	}
	
	
}
