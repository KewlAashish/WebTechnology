class Employee{
    String name;
    int joiningYear;
    int salary;
    String address;

    Employee(String name, int joiningYear, int salary, String address){
        this.name=name;
        this.joiningYear=joiningYear;
        this.salary=salary;
        this.address=address;
    }

    void printData(){
        System.out.println(this.name+"      "+this.joiningYear+"      "+this.salary+"     "+this.address);
    }
}

class questionTwo{
    public static void main(String[] args) {
        Employee e1 = new Employee("Mehul", 2021, 200000, "Panchkula");
        Employee e2 = new Employee("Gurcharan", 2020, 150000, "Mohali");
        Employee e3 = new Employee("Gautam", 2019, 00000, "Kishanganj");
        Employee e4 = new Employee("Snehit", 2019, 140000, "Mumbai");

        System.out.println("Name    Year of Joining     Salary      Address");
        e1.printData();
        e2.printData();
        e3.printData();
        e4.printData();   
    }   
}