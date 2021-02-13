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


public class Sorter {
	
	private static int partition(ArrayList<Student> pList, int pFromIdx, int pToIdx) {		
		      String pivot = pList.get(pFromIdx).getLastName();
		      int i = pFromIdx - 1;
		      int j = pToIdx + 1;
		      while (i < j) {
		         i++;
		         while (pList.get(i).getLastName().compareTo(pivot) < 0) {
		        	 i++;  
		         }
		         j--; 
		         while (pList.get(j).getLastName().compareTo(pivot) > 0) { 
		        	 j--; 
		         }
		         if (i < j) { 
		        	 swap(pList, i, j); 
		         }
		      }
		      return j;
		   }	
	
	private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
		if(pFromIdx >= pToIdx) {
			return;
		}
		int partition = partition(pList, pFromIdx, pToIdx);
		quickSort(pList, pFromIdx, partition);
		quickSort(pList, partition + 1, pToIdx);
		
	}
	
	public static void sort(ArrayList<Student> pList) {
		if (pList.size()==0) {
			return;
		}
		quickSort(pList, 0, pList.size()-1);
		
	}
	
    private static void swap(ArrayList<Student> pList, int pIdx1, int pIdx2) {
        Student temp = pList.get(pIdx1);
        pList.set(pIdx1, pList.get(pIdx2));
        pList.set(pIdx2, temp);
    }
}