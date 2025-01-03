package ss10_array_list.model;

public class Teacher {
    private int id;
    private String name;
    private String subject;
    private double salary;

    public Teacher(int id, String name, String subject, double salary) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher { " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", subject = '" + subject + '\'' +
                ", salary = " + salary +
                '}';
    }
}