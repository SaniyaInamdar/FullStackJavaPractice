package employee_class;

//- create a class TestEmployee	
//- define main() method 
//- create object of Employee class (5) 
//Employee e1=new Employee();

public class TestEmployee {
	public static void main(String[] args) {
		
		for(int i=0;i<1;i++) {
			new Employee();
		}
		
		for(int j=0;j<Employee.count;j++) {
			System.out.println("Enter details for employee"+(j+1));
			Employee.e[j].accept();
		}
		
		for(int k=0;k<Employee.count;k++) {
			System.out.println("Details of Employee : "+(k+1));
			Employee.e[k].show();
			System.out.println(Employee.e[k].toString());	
		}
		
	}
}
