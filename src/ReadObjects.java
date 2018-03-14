import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObjects {

	public static void main(String[] args){
		System.out.println("Reading objects...");
		
		//we created code in Person and WriteObjects first
		//now this will read the stuff we created.
		//do the line first, then add try, then add catch statements
		
		try(FileInputStream fi = new FileInputStream("people.bin")){
			
			ObjectInputStream os = new ObjectInputStream(fi);
			
			Person person1 = (Person)os.readObject();
			//add catch blocks
			Person person2 = (Person)os.readObject();
						
			os.close();
			
			System.out.println(person1);
			System.out.println(person2);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}