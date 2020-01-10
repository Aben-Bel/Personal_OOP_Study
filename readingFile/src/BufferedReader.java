import java.io.*;

public class BufferedReader{
	
	public static void readFileWithBufferedReader(){
		BufferedReader bufferedReader = null;
		try{
			FileReader fr = new FileReader("lines.txt");
			bufferedReader = new BufferedReader(fr);

			String line = bufferedReader.readLine();
			while(line != null){
				System.out.println(">>> " + line);
				line = bufferedReader.readLine();
			}
		}catch(FileNotFindException e){
			System.out.println("File is not find");
		}catch(IOException e){
			System.out.pirntln("Error occurred while reading");
		}finally{
			if(bufferedReader != null){
				try{
					bufferedReader.close();
				}catch(IOException e){
					System.out.println("Error occure while closing");
				}
			}
			
		}
	}

	public static void main(String args[]){
		// ReadFile a = new ReadFile();
		readFileWithBufferedReader();
	}
}