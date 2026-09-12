package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> candidate = new HashMap<String, Integer>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer qtdVotes = Integer.parseInt(fields[1]);
				
//				candidate.put(name, qtdVotes);
				if(candidate.containsKey(name)) {
					candidate.put(name, candidate.get(name) + qtdVotes);
				}
				else {
					candidate.put(name, qtdVotes);
				}
				
				line = br.readLine();
			}
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		System.out.println();
		
		System.out.println("---------------------------------");
		for (String key : candidate.keySet()) {
			System.out.println(key + ": " + candidate.get(key));
		}
		
		sc.close();

	}

}
