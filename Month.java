package Collection;
import java.util.ArrayList;
public class Month {

	public static void main(String[] args) {
		ArrayList<String> month = new ArrayList<>();
		month.add("January");
		month.add("February");
		month.add("March");
		month.add("April");
		month.add("May");
		month.add("June");
		month.add("July");
		month.add("August");
		month.add("September");
		month.add("October");
		month.add("November");
		month.add("December");
		System.out.println("Month of the year");
		for (String m :month) {
			System.out.println(m);
		}
	}

}
