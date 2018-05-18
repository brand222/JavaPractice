package basics;

import java.util.EnumSet;

public class enumeration2 {

	public static void main(String[] args) {
		// this loop prints out all the enum items and their values
		for (enumerations people : enumerations.values()) {
			System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());

			System.out.println("\nAnd now for the range of constants!!!\n");
			// now we are running our loop through a specific set of values
			// within an array ( a range of values)
			// this has a starting point and an ending point that is passed into
			// the loop
			for (enumerations peeps : EnumSet.range(enumerations.lisa, enumerations.sarah)) {
				System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getYear());
			}

		}
	}
}
