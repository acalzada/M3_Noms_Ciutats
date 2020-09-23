import java.lang.reflect.Field;
import java.util.Scanner;


class cityNames {
	public String city_1, city_2, city_3, city_4, city_5, city_6;
}


public class Fase1APP {

	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		
		cityNames variablesCityNames = new cityNames();
		Field field;
		Scanner consoleInput = new Scanner(System.in); 


		// User enters city names into String variables
		System.out.println(" ENTER CITY NAMES\n------------------\n");
		for (int idx = 1; idx <= 6; idx++)
		{
			System.out.print("Entra el nom de la ciutat " + idx + ": ");
			field = cityNames.class.getDeclaredField("city_" + idx);
			field.set(variablesCityNames, consoleInput.nextLine());			
		}
		consoleInput.close();
		
		
		// Display city names entered by the user.
		System.out.println("\n\n CITY NAMES\n------------\n");
		for (int idx = 1; idx <= 6; idx++)
		{
			field = cityNames.class.getDeclaredField("city_" + idx);
			System.out.println("ciutat_" + idx + ": " + field.get(variablesCityNames));
						
		}

		
	}

}


