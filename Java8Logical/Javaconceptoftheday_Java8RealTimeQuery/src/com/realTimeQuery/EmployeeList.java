package com.realTimeQuery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
//import com.realTimeQuery.Employee;

public class EmployeeList {
	
	
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

//1. How many male and female employees are there in the organization?
		/*
		 * For queries such as above where you need to group the input elements, 
		 * use the Collectors.groupingBy() method. In this query, we use 
		 * Collectors.groupingBy() method which takes two arguments. 
		 * We pass Employee::getGender as first argument which groups 
		 * the input elements based on gender and Collectors.counting() 
		 * as second argument which counts the number of entries in each group.*/
		
		Map<String, Long> noOfMaleAndFemaleEmployees=
				employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				         
				System.out.println("Gender Calculation "+noOfMaleAndFemaleEmployees);
				
//2. Print the name of all departments in the organization?
				
				/* For Reference 
				 int id;
			    
			    String name;
			     
			    int age;
			     
			    String gender;
			     
			    String department;
			     
			    int yearOfJoining;
			     
			    double salary;
			     */
				
				/*
				 Use distinct() method after calling map(Employee::getDepartment) 
				 on the stream. It will return unique departments.
				 */
				employeeList.stream().map(Employee::getDepartment).distinct()
									.forEach(x -> System.out.println(x));
				
				
//==================================================================
				System.out.println("********************************************");
				
//3. What is the average age of male and female employees?
				/*
				 * Use same method as query 1 but pass Collectors.averagingInt(Employee::getAge)
				 *  as the second argument to Collectors.groupingBy().*/
				Map<String, Double> avgAgeOfMaleAndFemaleEmployee =
						employeeList.stream()
						.collect(Collectors
								.groupingBy(Employee::getGender, 
										Collectors.averagingDouble(Employee::getAge)));
				
			System.out.println("Average Age of male and female "+ avgAgeOfMaleAndFemaleEmployee);
	
	System.out.println("***************************************************");
	
//4. Get the details of highest paid employee in the organization?
	/*
	 * Use Collectors.maxBy() method which returns maximum element 
	 * wrapped in an Optional object based on supplied Comparator.*/
	
			Optional<Employee> highestPaidEmployeeWrapper= employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
			
			Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
			System.out.println("Detail of Highest Paid Employee -->");
			System.out.println("********************************");
			System.out.println("ID :" + highestPaidEmployee.getId());
			System.out.println("Name :" + highestPaidEmployee.getName());
			System.out.println("Age :"  + highestPaidEmployee.getAge());
			System.out.println("Gender :" + highestPaidEmployee.getGender());
			System.out.println("Department : " + highestPaidEmployee.getDepartment());
			System.out.println("Year Of Joining :" + highestPaidEmployee.getYearOfJoining());
			System.out.println("Salary :" + highestPaidEmployee.getSalary());
			
//===========================================================================================
//5. Get the names of all employees who have joined after 2015?
			/*
			 * For such queries which require filtering of input elements, 
			 * use Stream.filter() method which filters input elements 
			 * according to supplied Predicate.
			 * */

			System.out.println("*************************************");
			
			System.out.println("list of employee who joined after 2015 ******");
		
			employeeList.stream()
						.filter(e-> e.getYearOfJoining()>2015)
						.map(Employee::getName)
						.forEach(System.out::println);


//==========================================================================================
			
//6. Count the number of employees in each department?
			/*
			 This query is same as query 3.1 but here we are grouping 
			 the elements by department.
			 */	
			
			System.out.println("\n***********************************\n");
			System.out.println("Number of employees in each department");
			Map<String, Long> employeeCountByDepartment = 
					employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
					Set<java.util.Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
					for(java.util.Map.Entry<String, Long> entry : entrySet) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
					
//==========================================================================================					
//7. What is the average salary of each department?			
			/*
			 * Use the same method as in the above query 3.6, 
			 * but here pass Collectors.averagingDouble(Employee::getSalary)
			 * as second argument to Collectors.groupingBy() method.
			 */	
		System.out.println("\n*******************************************\n");
		
		Map<String, Double> avgSalaryOfDepartment = employeeList.stream()
													.collect(Collectors
															.groupingBy(Employee:: getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		Set<java.util.Map.Entry<String, Double>> entrySet2 = avgSalaryOfDepartment.entrySet();
		for(java.util.Map.Entry<String, Double> entry : entrySet2) {
		System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
		
//======================================================================================		
//8. Get the details of youngest male employee in the product development department?
	/*
	 * For this query, use Stream.filter() method to filter male employees in 
	 * product development department and to find youngest among them, use Stream.min() method.*/	
	System.out.println("*************************************************************");	
	Optional<Employee> youngestMaleEmployeeInProductDevelopementWrapper=
			employeeList.stream().filter(e ->e.getGender()=="Male" &&e.getDepartment()=="Product Development")
			.min(Comparator.comparingInt(Employee::getAge));
	Employee youngestEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopementWrapper.get();
	System.out.println("Details of Youngest Male Employee in Product Development");
	
	System.out.println("--------------------------------------------------------");
	System.out.println("ID : " + youngestEmployeeInProductDevelopment.getId());
	System.out.println("Name : " + youngestEmployeeInProductDevelopment.getName());
	System.out.println("Age : " + youngestEmployeeInProductDevelopment.getAge());
	System.out.println("Year Of Joining : " + youngestEmployeeInProductDevelopment.getYearOfJoining());
	System.out.println("Salary : " + youngestEmployeeInProductDevelopment.getSalary());

//====================================================================================
//9. 	Who has the most working experience in the organization?
	/*
	 For this query, sort employeeList by yearOfJoining in natural order and first employee 
	 will have most working experience in the organization. To solve this query, we will 
	 be using sorted() and findFirst() methods of Stream.*/
	
	System.out.println("*********************************************************");
	Optional<Employee> seniorMostEmployeeWrapper =
			employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
	Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();
	
	System.out.println("Senior Most Employee Details : ");
	System.out.println("--------------------------------");
	
	System.out.println("Id : " + seniorMostEmployee.getId());
	System.out.println("Name : " + seniorMostEmployee.getName());
	System.out.println("Age : " + seniorMostEmployee.getAge());
	System.out.println("Year Of Joining : " + seniorMostEmployee.getYearOfJoining());
	System.out.println("Salary : " + seniorMostEmployee.getSalary());
	
	//employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).forEach(System.out::println);
	//Here  we are taking sample of above code , to figure out the order it is taking
	
//======================================================================================================	

System.out.println("***********************************************************");

//10. 	How many male and female employees are there in the sales and marketing team?
	/*This query is same as query 3.1, but here use filter() method to 
	 * filter sales and marketing employees*/

System.out.println("*******************************************************");
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter");
//String str = sc.nextLine(); // not working

Map<String, Long> countMaleFemaleEmployeesInSaleMarketing =
employeeList.stream()
			.filter(e->e.getDepartment()== "Sales And Marketing")
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
			System.out.println(countMaleFemaleEmployeesInSaleMarketing);

			
//11. What is the average salary of male and female employees?
			/*
	This query is same as query 3.3 where you have found average age of male and female employees. 
	Here, we will be finding average salary of male and female employees.
	*/
	System.out.println("****************************************************");		
	System.out.println("Average Salary Of Male and Female");		
	Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
			employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
			System.out.println(avgSalaryOfMaleAndFemaleEmployees);
	
//12. List down the names of all employees in each department?
			/*
			 *For this query, we will be using Collectors.groupingBy() 
			 *method by passing Employee::getDepartment as an argument.*/
			
			System.out.println("***********************************************");
			Map<String, List<Employee>> employeeListByDepartment=
					employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
					         
					Set<Map.Entry<String, List<Employee>>> entrySet3 = employeeListByDepartment.entrySet();
					         
					for (Map.Entry<String, List<Employee>> entry : entrySet3) 
					{
					    System.out.println("--------------------------------------");
					             
					    System.out.println("Employees In "+entry.getKey() + " : ");
					             
					    System.out.println("--------------------------------------");
					             
					    List<Employee> list = entry.getValue();
					             
					    for (Employee e : list) 
					    {
					        System.out.println(e.getName());
					    }
					}
					
//13. What is the average salary and total salary of the whole organization?
					
	/*
	 * For this query, we use Collectors.summarizingDouble() on Employee::getSalary which will return statistics
	 *  of the employee salary like max, min, average and total.*/
	System.out.println("*******************************************");
	DoubleSummaryStatistics employeeSalaryStatistics=
			employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
			         
			System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());
			         
			System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());

			
	
//14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
	/*
	 *For this query, we will be using Collectors.partitioningBy() method which separates 
	 *input elements based on supplied Predicate. */
			
			System.out.println("***********************************************");
			Map<Boolean, List<Employee>> partitionEmployeesByAge=
					employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
					         
					Set<Entry<Boolean, List<Employee>>> entrySet4 = partitionEmployeesByAge.entrySet();
					         
					for (Entry<Boolean, List<Employee>> entry : entrySet4) 
					{
					    System.out.println("----------------------------");
					             
					    if (entry.getKey()) 
					    {
					        System.out.println("Employees older than 25 years :");
					    }
					    else
					    {
					        System.out.println("Employees younger than or equal to 25 years :");
					    }
					             
					    System.out.println("----------------------------");
					             
					    List<Employee> list = entry.getValue();
					             
					    for (Employee e : list) 
					    {
					        System.out.println(e.getName());
					    }
					}
	
//15. Who is the oldest employee in the organization? What is his age and which department he belongs to?			
	//
					Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
			         
					Employee oldestEmployee = oldestEmployeeWrapper.get();
					         
					System.out.println("Name : "+oldestEmployee.getName());
					         
					System.out.println("Age : "+oldestEmployee.getAge());
					         
					System.out.println("Department : "+oldestEmployee.getDepartment());
	}
	
}
