package ArraysApp;

final class Student{
    private int id;
    private String studentName;
    private String studentEmail;

    public Student(){

    }
    public Student(int id,String studentName,String studentEmail){
        this.id=id;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}

//class Exam extends Student{  // we cannot inherit because student is a final class
//
//}

public class ImmutableClassExample {
    public static void main(String[] args) {
            Student student = new Student(101,"Apeksha","apeksha@yahoo.com");
            System.out.println(student);
    }
}
