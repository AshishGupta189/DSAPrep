package day9_assignment;

public class prob3 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.Name="Arjun";
        e1.Address="BlR";
        e1.Age=28;
        e1.Phone_number="9878945646";
        e1.Salary=9874.2589;
        e1.printsalary();
        Manager m1=new Manager();
        m1.Name="Akshay";
        m1.Address="BlR";
        m1.Age=25;
        m1.Phone_number="9878945646";
        m1.Salary=92341.2589;
        m1.printsalary();

    }
    static class Member{
        String Name;
        int Age ;
        String Phone_number;
        String Address ;
        double Salary;

        void printsalary(){
            System.out.println(this.Salary);
        }
    }

    static class Employee extends Member{

    }
    static class Manager extends Member{
        String specialization;
        String Department;
    }
}
