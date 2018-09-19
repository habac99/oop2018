package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public Student Students[] = new Student[100];
    private int n = 0;
    public void setList(Student st)
        {
            if (n<100)
            {
                Students[n] = st;
                n++;
            }

        }


    public  boolean sameGroup(Student s1, Student s2) {
        // TODO:


            return (s1.getGroup().equals(s2.getGroup()));

    }

    void studentsByGroup() {

       // int  n = Students.length;
        int[] A = new int[100];
        int i,j;
        for( i = 0;i<n;i++) A[i] = 1;
        for( i = 0;i<n;i++ )
        {
            if(A[i] == 1)
            {
                String s = Students[i].getGroup();
                System.out.println("Danh sach Sinh Vien Lop " + s + " :");
                for(j=i;j<n;j++)
                {
                    if(Students[j].getGroup().equals(s))
                    {
                        System.out.println(Students[j].getName());
                        A[j] = 0;
                    }


                }
            }
        }

        // TODO:
    }

    void removeStudent(String id) {

        int i = 0, j;
        while(!Students[i].getId().equals(id)){
            i++;
        }
        j = i;
        while(Students[j+1] != null)
        {
            Students[j] = new Student(Students[j+1]);
            j++;
            i=j;
        }


        n--;



    }

    public static void main(String[] args) {
        // TODO:
        StudentManagement Sm = new StudentManagement();
        Student test = new Student();
        test.setGroup("INT22041");;
        test.setName("Ha Van Bac");
        test.setId("17020603");
        test.setEmail("17020603@vnu.edu.vn");
        System.out.println(test.getName());
        System.out.println(test.getInfo());

        Student st1, st2, st3,st4;
        st1 = new Student("Ha Van Nam", "17020603", "abc@vnu.edu.vn");
        st2 = new Student("Ha Van A", "123456", "fggc@vnu.edu.vn");
        st3 = new Student("Tran Van B", "4675422", "hghj@vnu.edu.vn");
        st3.setGroup("INT22042");
        st4 = new Student(st3);


        System.out.println(Sm.sameGroup(st1, st3));
        Sm.setList(st1);
        Sm.setList(st2);
        Sm.setList(st3);
        Sm.setList(st4);

        Sm.studentsByGroup();
        Sm.removeStudent("123456");
        Sm.studentsByGroup();




    }
}
