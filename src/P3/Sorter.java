/********************************************************************************************************* 
 * CLASS: Sorter (Sorter.java) 
 * 
 * DESCRIPTION 
 * Sorter Driver File
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
import java.util.Collections;

public class Sorter {
	
	private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
		return ;
	}
	
	private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
		
	}
	
	public static void sort(ArrayList<Student> pList) {
		
	}
	
    private static void swap(ArrayList<Student> pList, int pIdx1, int pIdx2) {
        Student temp = pList.get(pIdx1);
        pList.set(pIdx1, pList.get(pIdx2));
        pList.set(pIdx2, temp);
    }
}