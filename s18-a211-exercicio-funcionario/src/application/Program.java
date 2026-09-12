package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<Employee>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			for(Employee emp : list) {
				System.out.println(emp);
			}
			
			System.out.print("Enter salary: ");
			double valor = sc.nextDouble();
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream()
					.filter(p -> p.getSalary() > valor)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			List<Double> inicialM = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.collect(Collectors.toList());
			
			double sum = 0.0;
			
			for(Double d : inicialM) {
				sum += d;
			}
			
			System.out.printf("\nSum of salary of people whose name starts with 'M': %.2f", sum);
			
			double sumInicialM = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			
			System.out.printf("\nSum of salary of people whose name starts with 'M': %.2f", sumInicialM);
			
//			double avg = list.stream()
//					.map(p -> p.getPrice())
//					.reduce(0.0, (x,y) -> x + y) / list.size();
//			
//			System.out.println("Average price: " + String.format("%.2f", avg));
//			
//			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
//			
//			List<String> names = list.stream()
//					.filter(p -> p.getPrice() < avg)
//					.map(p -> p.getName())
//					.sorted(comp.reversed())
//					.collect(Collectors.toList());
//			
//			names.forEach(System.out::println);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
