package Cafe;

public class Employee {
	String name;
	int age;
	String address;
	int salary;
	String chsal;

	public Employee(String name, int age, String address, int salary, String chsal) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.salary = salary;
		this.chsal = chsal;
	}

	public void payCheck(Employee Emname, cafeFinance caname) {
		caname.cafecash = caname.cafecash - Emname.salary;
		System.out.println(Emname.name + "에게 " + Emname.chsal + "원을 지급하였습니다.\n");
	}

}
