package Talleres.Taller7.ej1;

import java.util.*;

public class CitizenMapTester {

	public static void main(String[] args) {
		 
		Citizen uno = new Citizen(111, "Uno", "One");
		Citizen dos = new Citizen(222, "Dos", "Two");
	 
	    // Colección para búsqueda por DNI (DNI -> Una instancia)

		Map<Integer, Citizen> citizensByDni = new HashMap<>();
		citizensByDni.put(uno.getDni(), uno);
		citizensByDni.put(dos.getDni(), dos);
		
		// Colección para búsqueda por nombre (Nombre -> Varias instancias)

		Map<String, List<Citizen>> citizensByName = new HashMap<>();
		addToMap(citizensByName, uno);
		addToMap(citizensByName, dos);
		
		// Colección para búsqueda por Nombre y después por Apellido

		Map<String, Map<String, ArrayList<Citizen>>> citizensByNameSurname = new HashMap<>();

		addToMap2(citizensByNameSurname, uno);
		addToMap2(citizensByNameSurname, dos);

		// Para el ejercicio 2 se implemento equals y hashcode en la clase citizen

		// Para el ejercicio 3 uso un treeset (con un sortedset funciona) y le paso un comparator o implementa iterable

		//Le implementamos a la clase la interfaz Comparable para darle orden natural por dni ascendente
		//Ver el compareTo, luego puedo usar el reverse order
		SortedSet<Citizen> citizenSortedSet = new TreeSet<>();

	}

	public static void addToMap(Map<String, List<Citizen>> map, Citizen citizen){
//		if(!map.containsKey(citizen.getFirstName())){
//			map.put(citizen.getFirstName(), new ArrayList<>());
//		}
		map.putIfAbsent(citizen.getFirstName(), new ArrayList<>());
		map.get(citizen.getFirstName()).add(citizen);
	}

	public static void addToMap2(Map<String, Map<String, ArrayList<Citizen>>> map, Citizen citizen){
		map.putIfAbsent(citizen.getFirstName(), new HashMap<>());
		map.get(citizen.getFirstName()).putIfAbsent(citizen.getLastName(), new ArrayList<>());

		map.get(citizen.getFirstName()).get(citizen.getLastName()).add(citizen);
	}

}

