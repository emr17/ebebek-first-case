public class Employee {

    private String name;

    private double  salary;

    private int workHours;

    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary >1000){
            return this.salary* 0.03;
        }
        else {
            return 0;
        }

    }

    public double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }


    public double raiseSalary(){
        int currentYear=2021;
        int yearsWorked = currentYear-this.hireYear;

        if(yearsWorked<10){
            return (this.salary+ this.bonus()-tax())*0.05;

        } else if (20<yearsWorked && yearsWorked<9) {
            return (this.salary+ this.bonus()-this.tax())*0.1;
        }
        else {
            return (this.salary+ this.bonus()-this.tax())*0.15;

        }
    }

    public String toString() {
        return  "Adı : '" + name + '\n' +
                "Maaşı : " + salary + '\n'+
                "Çalışma Saati : " + workHours + '\n'+
                "Başlangıç Yılı : " + hireYear +'\n' +
                "Vergi : " + this.tax() + '\n'+
                "Bonus  : " + this.bonus() + '\n'+
                "Maaş artışı : " + this.raiseSalary() + '\n'+
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus()- this.tax()) + '\n'+
                "Toplam maaş : " + (this.salary+ this.bonus() +this.raiseSalary())
                ;
    }
}