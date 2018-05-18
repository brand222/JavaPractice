package basics;
//enums are constants that are also objects.
public enum enumerations {
brandon("nice", "28"),
lara("meaningless", "13"),
lisa("heartbreaking", "24"),
ellen("just about sex", "22"),
caro("dishonest", "26"),
lauren("not for me", "25"),
sarah("not ready", "23");

	
private final String DESC;
private final String YEAR;

enumerations(String description, String Year) {
	DESC = description;
	YEAR = Year;
}
//these are the constructors for the enumerations
public String getDesc() {
	return DESC;
}

public String getYear() {
	return YEAR;
}
}
