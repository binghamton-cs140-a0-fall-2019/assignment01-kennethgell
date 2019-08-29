package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	Computer MacbookAir = new Computer("Macbook Air","Good cpu", 16, 1100, true, 1099.0);
	Computer Dell = new Computer("Dell","Okay cpu",16,1200,false,800.0);
	Computer Asus = new Computer("Asus","Great cpu",32,900,true, 1999.0);
	Computer Hp = new Computer("Hp","Bad cpu",8,500,false,500.0);
	System.out.println(MacbookAir);
	System.out.println(Dell);
	System.out.println(Asus);
	System.out.println(Hp);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");


			Computer MacbookAir2 = new Computer("Macbook Air","Good cpu", 16, 1100, true, 1099.0);
			Computer Dell2 = new Computer("Dell","Okay cpu",16,1200,false,800.0);
			Computer Asus2 = new Computer("Asus","Great cpu",32,900,true, 1999.0);
			Computer Hp2 = new Computer("Hp","Bad cpu",8,500,false,500.0);
			output.println(MacbookAir);
			output.println(Dell);
			output.println(Asus);
			output.println(Hp);



		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
