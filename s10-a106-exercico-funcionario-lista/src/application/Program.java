package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			System.out.printf("\nEmployee #%d:\n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(employees, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
						
			employees.add(new Employee(id, name, salary));
		}

		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idBusca = sc.nextInt();
		//Integer pos = position(employees, idBusca);
		Employee employeeBusca = employees.stream().filter(x -> x.getId() == idBusca).findFirst().orElse(null);
		
		if(employeeBusca == null) {
			System.out.println("Thid id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			//employees.get(pos).increaseSalary(percentage);
			employeeBusca.increaseSalary(percentage);
		}
		
		/*
		Employee employeeBusca = employees.stream().filter(x -> x.getId() == idBusca).findFirst().orElse(null);
		
		if(employeeBusca == null){
			System.out.println("Thid id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			for(Employee e : employees) {
				if(e.getId() == employeeBusca.getId()) {
					e.increaseSalary(percentage);
				}
			}
		}
		*/
				
		System.out.println("\nList of employees:");
		for(Employee emp : employees) {
			System.out.println(emp);
		}
		
		sc.close();

	}

	public static Integer position(List<Employee> list, int id) {
		 for(int i=0; i<list.size(); i++) {
			 if(list.get(i).getId() == id) {
				 return i;
			 }
		 }
		 return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
