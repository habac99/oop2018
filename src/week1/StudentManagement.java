package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        String a1, a2;
        a1 = s1.getGroup();
        a2 = s2.getGroup();
        if (a1.equals(a2))
            return true;
        else
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student st1, st2, st3;
        st1 = new Student("Ha Van Bac", "17020603", "abc@vnu.edu.vn");
        st2 = new Student("Ha Van A", "123456", "fggc@vnu.edu.vn");
        st3 = new Student("Tran Van B", "4675422", "hghj@vnu.edu.vn");
        st3.setGroup("INT22042");
        if (sameGroup(st1, st2)) System.out.println("true");
    }
}
