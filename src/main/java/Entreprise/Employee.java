package Entreprise;

public class Employee {

    private int id;
    private String name;
    private Adress address;
    private double salary;

    public Employee(){
        this.id=-1;
    }

    public Employee(int id, String name, Adress address, double salary){
        this.id=id;
        this.name=name;
        this.address=address;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Adress getAddress(){
        return this.address;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAddress(Adress address){
        this.address=address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
