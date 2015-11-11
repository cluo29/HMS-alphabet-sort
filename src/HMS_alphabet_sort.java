
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class HMS_alphabet_sort {

	public static void main(String[] args) {
		List<String> countryNames = new ArrayList<String>();
		
		//get your strings here
		//1
		
		countryNames.add("C");
		countryNames.add("B");
		countryNames.add("A");
		//end input
			
		Collections.sort(countryNames.subList(0, countryNames.size()));
		for(int i=0; i<countryNames.size();i++)
		{
			System.out.println(countryNames.get(i));
		}
	}
}
