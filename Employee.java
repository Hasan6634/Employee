package Employee;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            return  0;
        }
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }return salary;
    }

    int bonus() {
        if (this.workHours > 40) {
            return  (this.workHours-40) * 30;
        } else {
            return  0;
        }
    }

    double raiseSalary() {
        if (2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        } else if ((2021 - this.hireYear) >= 9 && (2021 - this.hireYear) < 20) {
            return this.salary * 0.10;
        } else if ((2021 - this.hireYear) > 19) {
           return this.salary * 0.15;
        }else return 0;

    }

    double maas() {
         return (salary + bonus() + raiseSalary() - tax());

    }
    void string(){
        System.out.println("Adı :"+this.name +"\nMaaşı :" +this.salary+ "\nBaşlangıç yılı :"+ this.hireYear+ "\nVergi :"+tax()+"\nBonus :"+bonus()+"\nMaaş artışı :"+raiseSalary()+"\nVergi ve bonuslar ile birlikte maaşı :"+(maas()-raiseSalary())+"\nToplam maaşı :"+maas());
    }
}

