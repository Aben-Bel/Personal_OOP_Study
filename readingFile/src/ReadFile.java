import java.io.*;

public class ReadFile{
	

	// ReadFile(){
	// 	readFile();
	// }

	public static void readFile() {
		FileReader fileReader = null;
		try{
			fileReader = new FileReader("input.txt");
			int c = fileReader.read();
			while (c != -1){
				System.out.println(">> " + (char)c);
				c = fileReader.read();
			}
		}catch(FileNotFoundException e){
			System.out.println("File was not Found");
		}catch(IOException e){
			System.out.println("Error reading from file");
		}finally{
			if(fileReader != null){
				try{fileReader.close();}
				catch(IOException e){}
			}
		}
	}

	public static void main(String args[]){
		// ReadFile a = new ReadFile();
		readFile();
	}
}