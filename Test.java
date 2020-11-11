import java.util.ArrayList;

public class Test{
	public static void main(String[] args)
	{
		ArrayList<String> city = new ArrayList<String>();
		city.add("Kiev1");
		city.add("Kiev2");
		city.add("Kiev3");
		city.add("Kiev4");
		city.add("Kiev5");
		city.add("Kiev6");
		city.remove(1);
		System.out.println(city.size());
		System.out.println(city);
	}
}