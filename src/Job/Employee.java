package Job;

public abstract class Employee extends Person {
    private Position position;
    private double salaryCoefficient;
    private int experience;

    public Employee(String firstName, String lastName,double salaryCoefficient,int experience){
        super(firstName,lastName);
        this.salaryCoefficient = salaryCoefficient;
        this.experience = experience;
    }
     public abstract  void setPosition();

    public Position getPosition(){
        return position;
    }
    public void setPosition(Position position){
        this.position = position;
    }
     public double getSalaryCoefficient(){
        return salaryCoefficient;
     }
     public int getExperience(){
        return experience;
     }
     public double calculateSalary () {
        double baseRate = 1000.0;
        return baseRate * salaryCoefficient * experience;
     }
}
