package io_streams;


import java.io.*;
import java.util.*;
public class QuestionOperations03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
String inputFileName = sc.nextLine();

System.out.print("Enter the output file name: ");
String outputFileName = sc.nextLine();

Map<String, Integer> wordCountMap = new TreeMap<>(); 

try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
    String line;

    while ((line = reader.readLine()) != null) {
        String[] words = line.split("\\s+"); 

for (String word : words) {
    word = word.replaceAll("[^a-zA-Z]", ""); 
        if (!word.isEmpty()) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
    }
}

try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
        writer.write(entry.getKey() + ": " + entry.getValue());
        writer.newLine();
    }
}

System.out.println("Word counts have been written to " + outputFileName);

} catch (FileNotFoundException e) {
    System.out.println("Input file not found.");
} catch (IOException e) {
    System.out.println("An error occurred while processing the file.");
	        }

	        sc.close();
	    }
	}