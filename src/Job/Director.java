package Job;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee{
    private List<Employee> subordinates = new ArrayList<>();

    public Director(String firstName,String lastName,double salaryCoefficient,int experience){
        super(firstName,lastName,salaryCoefficient,experience);
        setPosition();
    }
    @Override
    public void setPosition(){
        this.setPosition(Position.DIRECTOR);
    }
    public void addWorker(Employee worker) {
        subordinates.add(worker);
    }
    @Override
    public double calculateSalary(){
        double baseSalary = super.calculateSalary();
        return baseSalary + (baseSalary * 0.1 * subordinates.size());
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Директор: ").append((getFullName()))
                .append(",З/П: ").append(calculateSalary())
                .append(", Стаж: ").append(getExperience())
                .append(", Должность: ").append(getPosition())
                .append("\nПодчиненные:\n");

        for(Employee worker : subordinates) {
            sb.append(" -").append(worker.getFullName())
                    .append(", З/П: ").append(worker.calculateSalary())
                    .append(", Стаж: ").append(worker.getExperience())
                    .append("\n");
        }
        return sb.toString();
    }
}
