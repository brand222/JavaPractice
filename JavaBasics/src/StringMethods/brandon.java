package StringMethods;

public class brandon {

	public static void main(String[] args) {
		
		String[] words = {"funk", "chunk", "furry", "baconator" };
		//here we have an enhanced for loop that loops through each string object 
		//of the array
		//if the word starts with 'fu' then print it out.
		//alternatively, any word that ends with 'unk' print them out
		for (String w : words) {
			//if (w.startsWith("fu")) {
			if (w.endsWith("unk")) {
				System.out.println(w + " starts with unk");
			}
		}
	}
}
