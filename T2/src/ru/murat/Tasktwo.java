package ru.murat;

/**
*@author Murat
*
*/
public class Tasktwo {
	
	
	/* 
	 * arg frst - survey String
	 * return amount of A's sublined in frst
	 * -1 if fsrt isEmpty -2 if null
	 */
	public static int line(String frst) {

		// если передали в метод null
		if(frst == null) {
			return -2;
		}
		else if(frst.isEmpty()) {
			return -1;
		}

		String sec = frst.replaceAll("А|а|a|A", "");
		return frst.length() - sec.length();
	}
		
}
