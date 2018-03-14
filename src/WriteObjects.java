import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");

		// we'll use this class to create two objects of Person
		Person mike = new Person(543, "Mike");
		Person sue = new Person(123, "Sue");

		// this will print their info.
		System.out.println(mike);
		System.out.println(sue);

		// this will write the info to a file:
		try (FileOutputStream fs = new FileOutputStream("people.bin"))
		// you can name it anything, but it's saying where the file will be written
		// it'll show up after you run the program, in the main program folder (refresh it)
		{
			// try catch was added first.
			// this is added next:
			ObjectOutputStream os = new ObjectOutputStream(fs);

			os.writeObject(mike);
			os.writeObject(sue);
			
			os.close();
			//fyi, sometimes methods have to be closed,
			//other times java closes them automatically.
			//just be prepared
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// note java forced us to add the try-catch stuff.
		// we'll just leave the default text because its not a lesson on
		// exceptions
	}
}
