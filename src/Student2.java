import java.util.Objects;

public class Student2 {
    public int rollno;
    public String name;

    public Student2(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return rollno == student2.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
