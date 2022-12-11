package evaluation_19sep;

abstract public class Employee {
     int employeeId;
     String employeeName;
     double salary;
     public Employee(){};
     public Employee(int employeeId, String employeeName) {
          this.employeeId = employeeId;
          this.employeeName = employeeName;
     }
     abstract void calculateSalary();

      static class PermanentEmployee extends Employee{
           public void setBasicPay(double basicPay) {
                this.basicPay = basicPay;
           }

           private double basicPay;
          double salary;
          public PermanentEmployee(int employeeId, String employeeName,double salary) {
               super(employeeId,employeeName);
               setBasicPay(salary);
               calculateSalary();
          }


           @Override
           void calculateSalary() {
                super.salary=basicPay-(basicPay*0.12);
           }
      }
     static class TemporaryEmployee extends Employee{
          private int hoursWorked;
          private int hourlyWages;

          public void setHoursWorked(int hoursWorked) {
               this.hoursWorked = hoursWorked;
          }

          public void setHourlyWages(int hourlyWages) {
               this.hourlyWages = hourlyWages;
          }

          public TemporaryEmployee(int employeeId, String employeeName, int hourlyWages, int hoursWorked) {
               super(employeeId, employeeName);
               setHourlyWages(hourlyWages);
               setHoursWorked(hoursWorked);
               calculateSalary();
          }


          @Override
          void calculateSalary() {
               super.salary=hourlyWages*hoursWorked;
          }
     }

     static class Loan{
          public static double calculateLoanAmount(Employee employeeObj){
               if(employeeObj==null){
                    System.out.println("this is a null object");
                    return -1;
               }
               if(employeeObj instanceof PermanentEmployee){
                   return (employeeObj.salary*15/100);
               }else {
                    return (employeeObj.salary*10/100);
               }

          }

     }

     public static void main(String[] args) {
          PermanentEmployee emp1=new PermanentEmployee(1,"Ashish",18000.250);
          System.out.println(Loan.calculateLoanAmount(emp1));
          TemporaryEmployee temp1=new TemporaryEmployee(2,"Arjun",4000,5);
          System.out.println(Loan.calculateLoanAmount(temp1));
          Employee e2=null;
          System.out.println(Loan.calculateLoanAmount(e2));

     }

}
