import java.io.*;
public class BufferedReading {
    public static void readFileWithBufferedReader(){
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader("lines.txt"));

            String line = bufferedReader.readLine();
            while(line != null){
                System.out.println(">>> " + line);
                line = bufferedReader.readLine();
            }
        }catch(FileNotFoundException e){
            System.out.println("File is not find");
        }catch(IOException e){
            System.out.println("Error occurred while reading");
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
