package day02_Variables;

public class EmployeeInfo_Variables {

      /*
      create a class called EmployeeInfo_Variables:
              print:
              your company's name
              your employeeName
              your EmployeeId
              your Job title
              your Salary
              SSN

       */

    public static void main(String[] args) {


        String employeeName = "Gurcu";
        String companyName  = "Kucuk Holding";
        int employeeId = 5;
        String jobTitle = " CEO ";
        double salary = 100000.5;
        int ssn = 12345678;

        System.out.println("Employee Name: "+employeeName);
        System.out.println("Company Name: "+companyName);
        System.out.println("Employee Id :" +employeeId );
        System.out.println("Job Title :"+jobTitle);
        System.out.println("Social Security Number:"+ssn);
        System.out.println("Salary:"+salary);

        System.out.println("Employee Name:"+employeeName + "\nCompany Name:"+companyName +
                "\nEmployee ID: " +employeeId + "\nJob Title: " + jobTitle +
                "\nSalary:"+ salary + "\nSnn:" +ssn);

        System.out.println("==================================================");

        String firstName = "Zeynep";
        String lastName = "Dere";

        System.out.println("Full Name: " + firstName+" "+lastName);


    }



}
