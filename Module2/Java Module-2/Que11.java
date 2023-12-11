package basic;
class Member{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	public void printSalary() {
		System.out.println(salary);
	}
}
class Employee extends Member{
	String specialization;
}
class Manager extends Member{
	String department;
}
public class Que11 {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.name="java";
		e.age=30;
		e.phoneno= 897898786;
		e.address="ahmedabad";
		e.salary=20000;
	
		Manager m=new Manager();
		m.name="python";
		m.age=20;
		m.phoneno= 897894786;
		m.address="new york";
		m.salary=80000;
		m.department="faculty";
	}
}
