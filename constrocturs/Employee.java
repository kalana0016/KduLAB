import java.util.Scanner;

class Employee {

 int NetSalary, BasicSalary, Allowances, Deductions;
 String Name;
    public void GetDetail(int x) {
        if(x == 10021){
        Name = "Samuel";
        BasicSalary = 10000;
        Allowances = 5000;
        Deductions = 2000;

        }
        if(x == 13121){
        Name = "Peterson";
        BasicSalary = 25000;
        Allowances = 10000;
        Deductions = 0;
        }
    }
    
    public int CalculateSalary(){
        NetSalary = BasicSalary+Allowances-Deductions;
        return NetSalary;
    }

    public static void main(String[] args){
        Employee emp = new Employee();
        Scanner sun=new Scanner(System.in);
        System.out.print("Enter Employee ID :");
    int empid = sun.nextInt();
        emp.GetDetail(empid);
        int p = emp.CalculateSalary();
        System.out.println("Employee ID : "+empid);
        //System.out.println("Name : "+Name);
        System.out.println("Net Salary : "+ p);
       } 
       
        
    }
