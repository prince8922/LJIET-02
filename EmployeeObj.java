package com.pk;


class Employee{
	
    	int empId;
    	String empName;
    	
		public Employee(int empId, String empName) {
			super();
			this.empId = empId;
			this.empName = empName;
			
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + "]";
		}	
	
}

public class EmployeeObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee[] emp=new Employee[5];
		 int empCount=0;
		
		 	for(int i=0;i<5;i++) {
			 	emp[0]=new Employee(11,"jek");
			 	emp[1]=new Employee(12,"jdk");
				emp[2]=new Employee(13,"jck");
				emp[3]=new Employee(14,"jkb");
				emp[4]=new Employee(15,"jak");
			 }
		 	
		 	for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
			empCount++;		
			}
		 	System.out.println("number of count is :"+empCount);
	}

}
