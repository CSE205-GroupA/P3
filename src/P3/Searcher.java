/********************************************************************************************************* 
 * CLASS: Searcher (Searcher.java) 
 * 
 * DESCRIPTION 
 * Searcher Driver File
 * 
 * 
 * COURSE AND PROJECT INFORMATION 
 * CSE205 Object Oriented Programming and Data Structures, Spring 2021
 * Project Number: p3
 *
 * GROUP INFORMATION  
 * AUTHOR 1: Brandon Murata, bmurata1, bmurata1@asu.edu
 * AUTHOR 2: Brandon Billmeyer, bbillmey , bbillmey@asu.edu
 * AUTHOR 3: Delaney Claussen , djclaus1, djclaus1@asu.edu
 * AUTHOR 4: Taylor Hedrick, tmhedric, tmhedric@asu.edu
 ********************************************************************************************************/
package P3;

import java.util.ArrayList;

public class Searcher {
	public static int search(ArrayList<Student> pList, String pKey) {
	      for (int i = 0; i < pList.size(); i++) {  
	    	  if (pList.get(i).getLastName().equals(pKey)) { 
	        	 return pList.indexOf(i); 
	          }
	      }
	      return -1;
	}
}