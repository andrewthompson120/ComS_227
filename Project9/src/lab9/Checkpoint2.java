package lab9;

import java.io.File;
import java.util.ArrayList;

public class Checkpoint2 {	
	/*
	private static ArrayList<Thing> presents = new ArrayList<Thing>(1);
	private static ArrayList<Thing> tempArr;
	private static int tempArray = 0;
	private static int masterArrayLength = 0;
	*/
	/**
	 * Returns a list of files beneath the given file or directory.
	 * @param file
	 * @return
	 */
	public static ArrayList<String> findFiles(File file) {
		// create an empty array list.
		ArrayList<String> arr = new ArrayList<String>();
		    
		// pass it into the recursive method
		//findFiles(file, arr);
		if (!file.isDirectory()) {
			arr.add(file.getName());
		}
		else {
			// recursively search the subdirectory
			for (File f : file.listFiles()) {
				arr.addAll(findFiles(f));
			}
		}
		
		// and return the filled-up ArrayList
		return arr;
	}
	
	public static void listAllPresents(Thing thing) {
		
		if(thing.isPresent()) {
			//listAllPresents(thing);
			System.out.println(thing.getDescription());
		}				
		else {
			//readIn = thing.getContents();		
			for(int i=0; i<thing.getContents().size();i++) {
				listAllPresents(thing.getContents().get(i));
				//System.out.println(thing.getDescription());
			}
		}
		
	}
	
	
	public static void main(String[] argc) {
		
			// Choose the directory you want to list.
			// If running in Eclipse, "." will just be the current project directory.
			// Use ".." to list the whole workspace directory, or enter a path to
			// some other directory.
			String rootDirectory = "."; 

			System.out.println(findFiles(new File(rootDirectory)).toString());
		
		
	}
		  
	
}
