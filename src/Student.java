public class Student {
    private  int age;
    private String name;
    private String lastname;
    private String add;

    public Student(int age, String name, String lastname, String add) {
        this.age = age;
        this.name = name;
        this.lastname = lastname;
        this.add = add;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
