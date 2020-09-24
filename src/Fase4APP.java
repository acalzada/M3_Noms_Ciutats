import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;

public class Fase4APP {
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

		String city_1 = "Barcelona";
		String city_2 = "Madrid";
		String city_3 = "Valencia";
		String city_4 = "Malaga";
		String city_5 = "Cadis";
		String city_6 = "Santander";
		
		char[] city_1_arr = city_1.toCharArray();
		char[] city_2_arr = city_2.toCharArray();
		char[] city_3_arr = city_3.toCharArray();
		char[] city_4_arr = city_4.toCharArray();
		char[] city_5_arr = city_5.toCharArray();
		char[] city_6_arr = city_6.toCharArray();

		System.out.print(city_1 + " -> ");
		for(int idx = city_1_arr.length-1; idx >= 0; idx--)
		{
			System.out.print(city_1_arr[idx]);
		}
		
		System.out.print("\n" + city_2 + " -> ");
		for(int idx = city_2_arr.length-1; idx >= 0; idx--)
		{
			System.out.print(city_2_arr[idx]);
		}
		
		System.out.print("\n" + city_3 + " -> ");
		for(int idx = city_3_arr.length-1; idx >= 0; idx--)
		{
			System.out.print(city_3_arr[idx]);
		}
		
		System.out.print("\n" + city_4 + " -> ");
		for(int idx = city_4_arr.length-1; idx >= 0; idx--)
		{
			System.out.print(city_4_arr[idx]);
		}
		
		System.out.print("\n" + city_5 + " -> ");
		for(int idx = city_5_arr.length-1; idx >= 0; idx--)
		{
			System.out.print(city_5_arr[idx]);
		}
		
		System.out.print("\n" + city_6 + " -> ");
		for(int idx = city_6_arr.length-1; idx >= 0; idx--)
		{
			System.out.print(city_6_arr[idx]);
		}
		
	}
}
