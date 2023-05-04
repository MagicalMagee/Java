
import java.util.ArrayList;
import java.io.LineNumberReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Produce {
    
    public static void main(String args[]) throws IOException {
        
        
        ArrayList<String> produceList = new ArrayList<String>();
        
        produceList.add("bananas 0.59");
        produceList.add("grapes 2.99");
        produceList.add("apples 1.49");
        produceList.add("pears 1.39");
        produceList.add("lettuce 0.99");
        produceList.add("onions 0.79");
        produceList.add("potatoes 0.59");
        produceList.add("peaches 1.59");
        
        try {
            FileWriter writer = new FileWriter("ProducePrice.txt");
            for (int i = 0; i < produceList.size(); i++) {
                writer.write(i + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        
        int lineCount = FileLineCount("ProducePrice.txt");
        System.out.println("There are " + lineCount + " products in the file.");
        
        produceList.add("peppers 0.99");
        produceList.add("celery 1.29");
        produceList.add("cabbage 0.79");
        produceList.add("tomatoes 1.19");
        
        try {
            FileWriter writer = new FileWriter("ProducePrice.txt");
            for (int j = 0; j < produceList.size(); j++) {
                writer.write(j + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
        
        lineCount = FileLineCount("ProducePrice.txt");
        System.out.println("There are " + lineCount + " products in the file.");
        

        ArrayList<String> producePrices = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader("ProducePrice.txt");
            Scanner scan = new Scanner(fileReader);
            while (scan.hasNextLine()) {
                producePrices.add(scan.nextLine());
            }
                scan.close();
                fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        }
        
        for(int k = 0; k < producePrices.size(); k++) {
            System.out.println((k+1) + ".\t" + producePrices.get(k));
        }
    }
    
    public static int FileLineCount(String filename) throws FileNotFoundException, IOException {
        int count = 0;
        FileReader fileReader = new FileReader(filename);
        LineNumberReader reader = new LineNumberReader(fileReader);

        while (reader.readLine() != null) {
            count++;
        }
        
        reader.close();
        fileReader.close();
    
        return count;
    }
}
