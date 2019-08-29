package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PersonTester {
	public static void main(String[] args) {
    StreetUSAddress kennyy = new StreetUSAddress("2440 Amsterdam Avenue","","New York","NY","10033");
    DateAndPlaceOfBirth kennyyy = new DateAndPlaceOfBirth(2000,02,7,"New York","NY","USA");
    Person kenny = new Person("Kenny","Gell","142-88-7673",kennyyy,kennyy);

    System.out.println(kenny);





    try(var output =new PrintWriter(new FileOutputStream(
    			    new File("output.txt"), true /* true means append to file */))) {
    			output.println("\nTESTS FOR Person.java:");

    		//Copy all your lines above, add an extra "2" to every variable name
    		// and replace every System.out.print or System.out.println
    		// by output.print or output.println
        StreetUSAddress kennyy2 = new StreetUSAddress("2440 Amsterdam Avenue","","New York","NY","10033");
        DateAndPlaceOfBirth kennyyy2 = new DateAndPlaceOfBirth(2000,02,7,"New York","NY","USA");
        Person kenny2 = new Person("Kenny","Gell","142-88-7673",kennyyy2,kennyy2);

        output.println(kenny2);
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		}

  }
}
