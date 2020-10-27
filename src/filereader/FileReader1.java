package filereader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileReader1 {



        public static void main(String[] args) throws IOException {


                File file = new File("/Users/tafat/Desktop/FileReader/myfile.txt");
            Scanner scan = new Scanner(file);
            //to read the first line from the file we use this below
            System.out.println(scan.nextLine());

            //to read all the file we use this below
//            while(scan.hasNextLine()){
//                System.out.println(scan.nextLine());
//            }


                // To create a new file we use this below
            String fileContent = "This code just made my day!";
            while (scan.hasNextLine()) {
                fileContent = fileContent.concat(scan.nextLine() + "\n");
            }

            FileWriter writer = new FileWriter("/Users/tafat/Desktop/FileReader/newfile.txt");
            writer.write(fileContent);
            writer.close();

        }

    }

