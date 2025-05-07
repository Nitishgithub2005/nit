public class Employee {
    String name;
    String email;
    int salary;
    static final String company="BIET";// static and final are used so we cannot change it
    public Employee(String name, String email, int salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Nitish","nit@gmail.com",120000);
        System.out.println(e1.name+"\n"+e1.email+ "\n"+e1.salary+"\n"+e1.company);
    }
}
