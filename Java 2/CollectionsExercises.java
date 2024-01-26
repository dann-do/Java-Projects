import java.util.*;

//import Lab6.Country;

public class CollectionsExercises
{
	
	static HashMap<String, Country> map = new HashMap();
	static LinkedList<Country> list = new LinkedList<>();
	static HashSet<Country> set = new HashSet();
	//Countries we are storing in our data structures
	static Country country1, country2, country3, country4;
	
	public static void main(String[] args)
	{
		createCountries();
		
		//Begin by implementing these three methods below
		addCountriesToList();
		addCountriesToMap();
		addCountriesToSet();
		
		//Now finish implementing the relevant portions of these methods
		areCountriesEqual();
		contentsOfSet();
		contentsOfList();
		sortList();
		
	}

	public static void createCountries() {
		
		//Initialize countries 1-3
		country1 = new Country("United Kingdom");
		country1.setPowerLevel(-5);
		country1.setNationalDish("Blood Pudding");
		
		country2 = new Country("Canada");
		country2.setPowerLevel(0);
		country2.setNationalDish("Poutine");
		
		country3 = new Country("Japan");
		country3.setPowerLevel(9001);
		country3.setNationalDish("O-sushi, Akihito-sama!");
		
		country1.addAdjacentCountry(country2);
		country1.addAdjacentCountry(country3);
		country2.addAdjacentCountry(country1);
		country2.addAdjacentCountry(country3);
		country3.addAdjacentCountry(country1);
		country3.addAdjacentCountry(country2);
		
		//Initialize country 4, which is logically equivalent to country 2
		country4 = new Country("Canada");
		country4.setPowerLevel(0);
		country4.setNationalDish("Poutine");
		country4.addAdjacentCountry(country1);
		country4.addAdjacentCountry(country3);
	}
	
	public static void addCountriesToList() {
		//Add countries 1-4 to our LinkedList, list
		// #TODO
		list.add(country1);
		list.add(country2);
		list.add(country3);
		list.add(country4);
	}
	
	public static void addCountriesToMap() {
		//Store countries 1-4 in our HashMap, map, using each country's name
		//as the Key
		//For country4, use the String "Canada2" as the Key
		// #TODO
		// map.put(key, value);
		map.put(country1.getName(), country1);
		map.put(country2.getName(), country2);
		map.put(country3.getName(), country3);
		map.put("Canada2", country4);
	}
	
	public static void addCountriesToSet() {
		//Add countries 1-4 to our HashSet, set
		// #TODO
		set.add(country1);
		set.add(country2);
		set.add(country3);
		set.add(country4);
	}
	
	private static void areCountriesEqual() {
		
		System.out.println("Are countries 2 and 4 in our map equal?");
		
		//Fill in the part of the statement labeled #TODO
		//Our goal is to compare country2 to country4 by retrieving them from the map
		//and testing them for logical equivalence
		//If we retrieve the correct entry from the map and our .equals() and .hashcode()
		//methods have been overriden correctly, "The countries are equal" should print
		
		// map.get(key)
		if (map.get(country2.getName()).equals(map.get("Canada2"))) // #TODO
			System.out.println("The countries are equal" + System.lineSeparator());
		else
			System.out.println("The countries are not equal" + System.lineSeparator());
		
	}
	
	private static void contentsOfSet() {
		
		//If hashCode() is not overridden, enhanced for loop will print out 4 entries instead of 3
		//Note, Sets do NOT contain duplicates
		System.out.println("Contents of Set:");
		for (Country country: set) {
			System.out.println(country);
		}
		
	}
	
	private static void contentsOfList() {
		
		//Return an object of type ListIterator<Country> and store it in a variable
		//named iterator by calling the appropriate method on our LinkedList
		ListIterator<Country> iterator = list.listIterator();  // #TODO
		
		System.out.println("Contents of List:");
		//Call the appropriate method on our ListIterator, iterator, to check if our iterator
		//has a next item that it can iterate through
		while (iterator.hasNext())   // #TODO
		{
			//Assign next element in the list to the variable "country"
			Country country = iterator.next();	// #TODO;
			System.out.println(country);
		}
		
	}
	
	private static void sortList() {
		
		//The Collections.sort() method sorts the items in a data structure according
		//to the order specified in the compareTo() method
		//If our compareTo() method was implemented properly, the list should sort the
		//countries by alphabetical order of country name
		Collections.sort(list);
		
		//Note, unlike Sets, Lists DO contain duplicates
		System.out.println("Contents of sorted List:");
		for (Country country: list) {
			System.out.println(country);
		}
	}
}
