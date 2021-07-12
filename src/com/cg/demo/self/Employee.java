package com.cg.demo.self;


class Employee {
    String name;
    int salary;
    
    public Employee(String name, int salary){
        super();
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary= salary;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append("name: ");
        sb.append(name);
        sb.append(" salary: ");
        sb.append("" + salary+">");
        return sb.toString();

    }
}
class EmployeeInfo{
    enum SortMethod {

       // BYNAME,BYSALARY;
    };
   // public List<Employee> sort(List<Employee> emps, final SortMethod){
        // return new Employee(name, salary); }.
    }
   // Collection<Employee>  list = new ArrayList<Employee>(M);

// public static void main(String[] args){
//     List<Employee> emps = new ArrayList<>();
//     emps.add(new Employee("Mickey", 100000));
//     emps.add(new Employee("Timmy", 50000));
//     emps.add(new Employee("Annny", 40000)); 
// }
List<Human> humans = Lists.newArrayList(new Human("Sarah", 10), new Human("Jack", 12)); 
List<Human> sortedHumans = humans.stream() .sorted(Comparator.comparing(Human::getName)) .collect(Collectors.toList()); assertThat(sortedHumans.get(0), equalTo(new Human("Jack", 12)));