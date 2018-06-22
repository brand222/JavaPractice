package types;

public class typesDefined {

	public static void main(String[] args) {
		
		byte bigByte = 127; //largest amount that a byte can hold, minimum is -128
		
		short bigShort = 32767;//smallest amount a short can hold is -32768
		
		int bigInt = 2100000000; //2.1 trillion is the biggest int
		
		long bigLong = 9220000000000000000L; //the maximum for a long is 922 (with 16 zeros)
		
		float bigFloat = 3.14F;  //roughly precise to 6 decimal places
		
		double bigDouble = 3.123423423423423523523523; //this holds the largest amount of digits
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		boolean trueOrFalse = true;
		
		char randChar = 66;
		char anotherChar = 'A';
		
		char escapedCharacters = '\\'; // others include: \b - backspace, \f - formfeed, \t - horizontal tab,
		
		System.out.println(randChar); //here we are printing a character code (code: 66 = 'B')
	}
}
