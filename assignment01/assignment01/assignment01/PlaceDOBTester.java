package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester {
	public static void main(String[] args) {
    //TO DO: In the main method make 5 objects 3 with birthplaces in the USA(with state)
    // and 2 from other countries using the second constructor that does not have a state param
    // Give two objects the same birth date and have another object with the same
    // birthday (Month and day) but a different birth year
    //
    //

    DateAndPlaceOfBirth birth1 = new DateAndPlaceOfBirth(2000,2,7,"New York", "New York","USA");
    DateAndPlaceOfBirth birth2 = new DateAndPlaceOfBirth(1980,5,12,"Miami","Florida","USA");
    DateAndPlaceOfBirth birth3 = new DateAndPlaceOfBirth(1995,8,27,"Lawrence","Massachusetts","USA");
    DateAndPlaceOfBirth birth4 = new DateAndPlaceOfBirth(1999,8,27,"Gjakova","Kosovo");
    DateAndPlaceOfBirth birth5 = new DateAndPlaceOfBirth(1999,8,27,"Santo Domingo","Dominican Republic");
    //Print objects
    System.out.println(birth1);
    System.out.println(birth2);
    System.out.println(birth3);
    System.out.println(birth4);
    System.out.println(birth5);
    //Test Birthdays
    System.out.println(birth1.hasSameBirthDayAs(birth2));
    System.out.println(birth2.hasSameBirthDayAs(birth3));
    System.out.println(birth3.hasSameBirthDayAs(birth4));
    System.out.println(birth4.hasSameBirthDayAs(birth5));
    System.out.println(birth1.hasSameBirthDayAs(birth3));
    System.out.println(birth2.hasSameBirthDayAs(birth4));
    System.out.println(birth1.hasSameBirthDayAs(birth5));






    try(var output =new PrintWriter(new FileOutputStream(
  			    new File("output.txt"), true /* true means append to file */))) {
  			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

        DateAndPlaceOfBirth birth12 = new DateAndPlaceOfBirth(2000,2,7,"New York", "New York","USA");
        DateAndPlaceOfBirth birth22 = new DateAndPlaceOfBirth(1980,5,12,"Miami","Florida","USA");
        DateAndPlaceOfBirth birth32 = new DateAndPlaceOfBirth(1995,8,27,"Lawrence","Massachusetts","USA");
        DateAndPlaceOfBirth birth42 = new DateAndPlaceOfBirth(1999,8,27,"Gjakova","Kosovo");
        DateAndPlaceOfBirth birth52 = new DateAndPlaceOfBirth(1999,8,27,"Santo Domingo","Dominican Republic");
        //Print objects
        output.println(birth12);
        output.println(birth22);
        output.println(birth32);
        output.println(birth42);
        output.println(birth52);
        //Test Birthdays
        output.println(birth1.hasSameBirthDayAs(birth22));
        output.println(birth2.hasSameBirthDayAs(birth32));
        output.println(birth3.hasSameBirthDayAs(birth42));
        output.println(birth4.hasSameBirthDayAs(birth52));
        output.println(birth1.hasSameBirthDayAs(birth32));
        output.println(birth2.hasSameBirthDayAs(birth42));
        output.println(birth1.hasSameBirthDayAs(birth52));


  		//Copy all your lines above, add an extra "2" to every variable name
  		// and replace every System.out.print or System.out.println
  		// by output.print or output.println
  		} catch (FileNotFoundException e) {
  			e.printStackTrace();
  		}
    }
  }
