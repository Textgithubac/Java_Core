package com.learning.core.Day5;
import java.util.Random;

class Register<T> {
    private String registerId;

    public Register(String registerId) 
    {
        this.registerId = registerId;
    }

    public String generateRegisterId(int length) 
    {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) 
        {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public void display(T user) 
    {
        if (user instanceof Employee) 
        {
            Employee employee = (Employee) user;
            System.out.println(generateRegisterId(7) + " " + employee.getName() + " " + employee.getPhoneNo() + " " + employee.getEmployeeId() + " " + employee.getPassportNo());
        } 
        else if (user instanceof Student) 
        {
            Student student = (Student) user;
            System.out.println(generateRegisterId(7) + " " + student.getName() + " " + student.getPhoneNo() + " " + student.getLicenseNo() + " " + student.getPanCardNo());
        }
    }
}

class Employee {
    private String name;
    private long phoneNo;
    private int employeeId;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;

    public Employee(String name, long phoneNo, int employeeId, String passportNo) 
    {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) 
    {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, int voterId) 
    {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public String getName() 
    {
        return name;
    }

    public long getPhoneNo() 
    {
        return phoneNo;
    }

    public int getEmployeeId() 
    {
        return employeeId;
    }

    public String getPassportNo() 
    {
        return passportNo;
    }

    public int getLicenseNo() 
    {
        return licenseNo;
    }

    public String getPanCardNo() 
    {
        return panCardNo;
    }
}

class Student 
{
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;

    public Student(String name, long phoneNo, String passportNo) 
    {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Student(String name, long phoneNo, int licenseNo, String panCardNo) 
    {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Student(String name, long phoneNo, int voterId, int licenseNo) 
    {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public String getName() 
    {
        return name;
    }

    public long getPhoneNo() 
    {
        return phoneNo;
    }

    public String getPassportNo() 
    {
        return passportNo;
    }

    public int getLicenseNo() 
    {
        return licenseNo;
    }

    public String getPanCardNo() 
    {
        return panCardNo;
    }
}
public class D05P01 {
	public static void main(String[] args) 
    {
        Employee employee = new Employee("Arun", 9123456780L, 1101, "LA78833DG");

        Register<Employee> employeeRegister = new Register<>("Employee");
        employeeRegister.display(employee);

        Student student = new Student("Joseph", 9123412780L, 2210, "SJLD1717K");

        Register<Student> studentRegister = new Register<>("Student");
        studentRegister.display(student);
    }
}


