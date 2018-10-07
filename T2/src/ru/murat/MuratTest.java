package ru.murat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
*@author Murat
*
*/
class MuratTest {

	@Test
	void EmptyLinePos() {
		System.out.println("������������ ������ ������");
		int expRes = -1;
		String test = "";
		int res = Tasktwo.line(test);	
		assertEquals(expRes,res);
	}

	@Test
	void NullLinePos() {
		System.out.println("������������ null ������");
		
		int expRes = -2;
		String test = null;
		int res = Tasktwo.line(test);	
		assertEquals(expRes,res);
	}	
	
	@Test
	void noAinStringNumbers1() {
		System.out.println("������ ��� �");
		int expRes = 0;
		String test = "123456";
		int res = Tasktwo.line(test);
		assertEquals(expRes,res);
	}

	@Test
	void noAinStringLetters() {
		System.out.println("������ ��� �");
		int expRes = 0;
		String test = "fsdisdfvs";
		int res = Tasktwo.line(test);
		assertEquals(expRes,res);
	}
	
	@Test
	void noAinStringLettersUpper() {
		System.out.println("������ ��� �");
		int expRes = 0;
		String test = "FSDCvDC";
		int res = Tasktwo.line(test);
		assertEquals(expRes,res);
	}
	
	@Test
	void diffAstringRu() {
		System.out.println("������ � ������ ��������� �");
		int expRes = 4;
		String test = "���� ���� ����";
		int res = Tasktwo.line(test);
		assertEquals(expRes,res);
	}
	
	@Test
	void diffAstringEn() {
		System.out.println("������������ ������");
		int expRes = 4;
		String test = "mama mila rAmu";
		int res = Tasktwo.line(test);
		assertEquals(expRes,res);
	}

	@Test
	void diffRegAru() {
		System.out.println("������������ ������");
		int expRes = 4;
		String test = "���� ���� ����";
		int res = Tasktwo.line(test);
		assertEquals(expRes,res);
	}
	
}
