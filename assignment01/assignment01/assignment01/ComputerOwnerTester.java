package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerOwnerTester {
	public static void main(String[] args) {
    DateAndPlaceOfBirth kennyAlsina = new DateAndPlaceOfBirth(2000,2,7,"New York", "New York","USA");
    StreetUSAddress kennyAddress = new StreetUSAddress("2440 Amsterdam Avenue","", "New York","NY","10033");
    Person kAlsina = new Person("Kenny","Alsina","132-77-6543", kennyAlsina,kennyAddress);

    ComputerOwner compOwner = new ComputerOwner(kAlsina);

    Computer Toshiba = new Computer("Toshiba","Good cpu", 32, 1200, true, 1000.0);
    Computer Mac = new Computer("Mac","Good cpu", 16, 1000, false, 1100.0);
    Computer Lenovo = new Computer("Lenovo","Bad cpu", 8, 500, true, 500.0);
    Computer Acer = new Computer("Acer","Okay cpu", 32, 900, false, 900.0);

    compOwner.addComputer(Toshiba);
    compOwner.addComputer(Mac);
    compOwner.addComputer(Lenovo);
    compOwner.addComputer(Acer);

    System.out.println(compOwner);

    compOwner.removeComputer(0);
    compOwner.removeComputer(1);
    System.out.println(compOwner);

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
    DateAndPlaceOfBirth kennyAlsina2 = new DateAndPlaceOfBirth(2000,2,7,"New York", "New York","USA");
    StreetUSAddress kennyAddress2 = new StreetUSAddress("2440 Amsterdam Avenue","", "New York","NY","10033");
    Person kAlsina2 = new Person("Kenny","Alsina","132-77-6543", kennyAlsina,kennyAddress);

    ComputerOwner compOwner2 = new ComputerOwner(kAlsina);

    Computer Toshiba2 = new Computer("Toshiba","Good cpu", 32, 1200, true, 1000.0);
    Computer Mac2 = new Computer("Mac","Good cpu", 16, 1000, false, 1100.0);
    Computer Lenovo2 = new Computer("Lenovo","Bad cpu", 8, 500, true, 500.0);
    Computer Acer2 = new Computer("Acer","Okay cpu", 32, 900, false, 900.0);

    compOwner2.addComputer(Toshiba2);
    compOwner2.addComputer(Mac2);
    compOwner2.addComputer(Lenovo2);
    compOwner2.addComputer(Acer2);

    output.println(compOwner2);

    compOwner2.removeComputer(0);
    compOwner2.removeComputer(1);
    output.println(compOwner2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}





  }
}
