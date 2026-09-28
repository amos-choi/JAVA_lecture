import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phoneNumber;

    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print(
                    "학생의 학번, 이름, 전공, 전화번호를 입력하세요: "
            );

            Student student = new Student();

            student.setStudentId(Integer.parseInt(scanner.next()));
            student.setName(scanner.next());
            student.setMajor(scanner.next());
            student.setPhoneNumber(Long.parseLong(scanner.next()));

            students[i] = student;
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];

            String studentId = Integer.toString(student.getStudentId());
            String phone = Long.toString(student.getPhoneNumber());

            phone = "0" + phone;

            String formattedPhone =
                    phone.substring(0, 3) + "-" +
                            phone.substring(3, 7) + "-" +
                            phone.substring(7, 11);

            System.out.println((i + 1) + "번째 학생: " + studentId + " " + student.getName()
                    + " " + student.getMajor() + " " + formattedPhone);
        }
    }
}