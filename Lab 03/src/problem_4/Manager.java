package problem_4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

class Manager extends Employee {
    Vector<Employee> team;
    double bonus;

    Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    @Override
    public String toString() {
        return "Manager" +
                " Name='" + name + "', Salary=" + salary +
                ", Hire Date=" + hireDate + ", Insurance Number='" + insuranceNumber + "'" +
                ", Bonus=" + bonus + ", Team=" + team;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0 &&
                Objects.equals(team, manager.team);
    }

    @Override
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            Manager otherManager = (Manager) other;
            int salaryComparison = Double.compare(this.salary, otherManager.salary);
            return (salaryComparison != 0) ? salaryComparison : Double.compare(this.bonus, otherManager.bonus);
        }
        return super.compareTo(other);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = (Vector<Employee>) team.clone();
        return cloned;
    }
}