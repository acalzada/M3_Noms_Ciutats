import java.util.Arrays;

public class Fase2APP {

	public static void main(String[] args) {
		
		// User has already set up the String variables from the Fase1APP exercise.
		String city_1 = "Barcelona";
		String city_2 = "Madrid";
		String city_3 = "Valencia";
		String city_4 = "Malaga";
		String city_5 = "Cadis";
		String city_6 = "Santander";

		String[] cityNames = {city_1, city_2, city_3, city_4, city_5, city_6};
		
		Arrays.parallelSort(cityNames);
		
		System.out.println("City Names in the array are:\n----------------------------\n");
		System.out.print(cityNames[0]);
		for(int idx = 1; idx < cityNames.length; idx++)
			System.out.print(" , " + cityNames[idx]);
		
		// With a for each approach
		System.out.println("\n\n\n\nCity Names with forEach:\n-----------------------\n");
		for(String city : cityNames)
			System.out.println(city);
	}

}
