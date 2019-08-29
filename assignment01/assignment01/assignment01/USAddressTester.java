package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class USAddressTester {
  //TO DO
  // Make two objects one with an empty string for add 2 and print them
  // to see that one object prints with 3 lines and the other with two lines
	public static void main(String[] args) {
    StreetUSAddress anAddress = new StreetUSAddress("2440 Amsterdam Avenue","", "New York","NY","10033");
    StreetUSAddress anAddress2 = new StreetUSAddress("3450 Broadway Avenue","2230 St Nicholas Avenue","New York","NY","10040");

    //Print addys
    System.out.println(anAddress);
    System.out.println(anAddress2);


    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

      StreetUSAddress anAddress23 = new StreetUSAddress("2440 Amsterdam Avenue","", "New York","NY","10033");
      StreetUSAddress anAddress24 = new StreetUSAddress("3450 Broadway Avenue","2230 St Nicholas Avenue","New York","NY","10040");

      //Print addys
      output.println(anAddress23);
      output.println(anAddress24);
		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}






  }
}
