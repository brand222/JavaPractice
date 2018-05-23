package workingWithFiles;

public class mainMethod {

	public static void main(String[] args) {
		
		//here we create out new object
		addingDataToFiles g = new addingDataToFiles();
		//here we create and open the file
		g.OpenFile();
		//here we are adding the records to the file
		g.addRecords();
		//here we are calling the 'closeFile' method
		g.closeFile();
	}
}
