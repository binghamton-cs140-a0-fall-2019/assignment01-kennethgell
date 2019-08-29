package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class SimpleDateTester {
	public static void main(String[] args) {
    SimpleDate example = SimpleDate.of(2020, 7, 26);
    SimpleDate sampleDate = SimpleDate.of(2020, 8, 26);
    System.out.println(example.before(sampleDate));

    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR SimpleDate.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
    SimpleDate example2 = SimpleDate.of(2020, 7, 26);
    SimpleDate sampleDate2 = SimpleDate.of(2020, 8, 26);
    output.println(example2.before(sampleDate2));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}



  }
}
