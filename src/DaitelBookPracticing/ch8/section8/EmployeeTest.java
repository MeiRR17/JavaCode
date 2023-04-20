package src.DaitelBookPracticing.ch8.section8;

// Fig. 8.9: EmployeeTest.java
// Composition demonstration.

public class EmployeeTest
{
    public static void main(String[] args)
    {
        Date birth = new Date(9, 17, 2003);
        Date hire = new Date(12, 28, 2022);
        Employee artium = new Employee("Artium", "Bander", birth, hire);
        System.out.println(artium);
    }
} // end class EmployeeTest