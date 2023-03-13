package c322.Homeworks.Homework4.PartA;

class Student implements Subscriber {
    private String name;
    public Student(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}