package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import n1exercici1.Month;

public class Main {

	public static void main(String[] args) {
		
		
		//Primer ArrayList
		List <Integer> arrList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Elements del primer ArrayList");
        for (Integer m: arrList){
            System.out.print(m + " ");
        }
        
        //Segon ArrayList
        List <Integer> ordreInvers = new ArrayList<>(arrList);
        Collections.reverse(ordreInvers);
       
        ListIterator<Integer> iterator = ordreInvers.listIterator();
        System.out.println("\n\nElements del segon ArrayList");        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
	}
}
