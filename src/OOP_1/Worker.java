package OOP_1;

public class Worker extends Human implements Salary{
    protected String companyName;
    protected int hoursWorked;
    public Worker (String gender, String name, String companyName, int hoursWorked) {
        super.gender = gender;
        super.name = name;
        this.companyName = companyName;
        this.hoursWorked = hoursWorked;
    }

    public Worker (String companyName, int hoursWorked) {
        this.companyName = companyName;
        this.hoursWorked = hoursWorked;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }



    @Override
    public int calculateSalary() {
        return 150 * this.hoursWorked;
    }
}
