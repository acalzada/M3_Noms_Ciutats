import java.util.Arrays;

public class Fase3APP {

	public static void main(String[] args) {
		
		// From Fase2 exercise
		String city_1 = "Barcelona";
		String city_2 = "Madrid";
		String city_3 = "Valencia";
		String city_4 = "Malaga";
		String city_5 = "Cadis";
		String city_6 = "Santander";

		String[] cityNames = {city_1, city_2, city_3, city_4, city_5, city_6};
		Arrays.parallelSort(cityNames);
		
		// Fase3 Exercise
		
		String[] arrayCiutatsModificades = new String[cityNames.length];
		
		for(int idx = 0; idx < arrayCiutatsModificades.length; idx++)
		{
			arrayCiutatsModificades[idx] = cityNames[idx].replace('a', '4');
		}
		
		Arrays.parallelSort(arrayCiutatsModificades);
		
		System.out.println("Array modificat i endreçat:\n---------------------------\n");
		for(String city : arrayCiutatsModificades)
			System.out.println(city);

	}

}
