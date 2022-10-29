package n2exercici1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		HashSet restaurantes = new HashSet();
		
		restaurantes.add(new Restaurant("Wine Mood",5));
		
		//El segon no s'insereix en el HashSet
		restaurantes.add(new Restaurant("Belle Buon",7));
		restaurantes.add(new Restaurant("Belle Buon",7));
		
		//El segon s'insereix en el hashSet perquè la puntuació és diferent
		restaurantes.add(new Restaurant("Xapaco",9));
		restaurantes.add(new Restaurant("Xapaco",10));
		
		System.out.println(restaurantes.size());
		
	}

}
