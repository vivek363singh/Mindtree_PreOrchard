
public class Employee {
	int empId;
	String empName,empDesig,empDep;
	
	Employee(){
		
	}
	Employee(int empId,String empNmae,String empDesig,String EmpDep){
		
	}
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		System.out.println(obj.setempName("vivek"));;
		System.out.println(obj.setempDep("Digital"));
		System.out.println(obj.setempDesig("tester"));;
		System.out.println(obj.setempId(255));;
	}
	
	int setempId(int empId)
	{	if(empId==0)
		{
		 System.out.println("Enter valid id");
		}
		this.empId=empId;
		return this.empId;
	}
	
	int getempId() {
		return this.empId;
	}
	
	String setempName(String empName)
	{	
		this.empName=empName;
		return this.empName;
	}
	
	String getempName() {
		return this.empName;
	}
	
	String setempDep(String empDep)
	{	if(empDep.equals("RCM") || empDep.equals("TTH") || empDep.equals("Digital") || empDep.equals("Devops"))
		{this.empDep=empDep;
		return this.empDep;
		}
	else
	{
		System.out.println("Invalid department");
		return null;
	}
	}
	
	String getempDep() {
		return this.empDep;
	}
	
	String setempDesig(String empDesig)
	{	if(empDesig.equals("developer") || empDesig.equals("tester") || empDesig.equals("lead")|| empDesig.equals("manager"))
		{this.empDesig=empDesig;
		return this.empDesig;
		}
		else
		{
			System.out.println("Invalid desgination");
			return null;
		}
	}
	
	String getempDesig() {
		return this.empDesig;
	}
}
