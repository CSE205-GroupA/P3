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
		
		while (pFromIdx < pToIdx) {
			while (pList.get(pFromIdx).getLastName().compareTo(pivot)<0) {
				pFromIdx++;
			}
			while (pList.get(pToIdx).getLastName().compareTo(pivot)>0) {
				pToIdx--;
			}
			if (pFromIdx < pToIdx) {
				swap(pList, pFromIdx, pToIdx);
			}
		}
		return pFromIdx;
	}
	private static void quickSort(ArrayList<Student> pList, int pFromIdx, int pToIdx) {
		if(pFromIdx > pToIdx) {
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