package basics;
//enums are constants that are also objects.
//Enumerations: A special java type used to define collections of constants.
//enums  are used when we know all possible values at compile time, such as choices on a menu, etc..
public enum enumerations {
brandon("nice", "28"),
lara("meaningless", "13"),
lisa("heartbreaking", "24"),
ellen("just about sex", "22"),
caro("dishonest", "26"),
lauren("not for me", "25"),
sarah("not ready", "23"),
effrosini("perfect for me", "27");

	//here we created 2 enum constant variables
private final String DESC;
private final String YEAR;
//here we created the constructor for the enum
enumerations(String description, String Year) {
	DESC = description;
	YEAR = Year;
}
//here are the methods associated with the enum
public String getDesc() {
	return DESC;
}

public String getYear() {
	return YEAR;
}
}
