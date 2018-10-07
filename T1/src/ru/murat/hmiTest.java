package ru.murat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
*@author Murat
*
*/
class hmiTest {

	// is this enough
	
	/*
	@Before
	public void init() {
	HMI.insertPerson();
	}*/	
	// check if it's nothing to show
	@Test
	void testShowAllEmptyNeg() {
		
	String stat = HMI.showAll();
	assertEquals(stat,"Database is empty");
	}

	
	// check if it's possible to show
	// in
	@Test
	void testShowAllnotEmpty() {
	HMI.insertPerson();
	String stat = HMI.showAll();
	assertEquals(stat,"ok");
	}



}
