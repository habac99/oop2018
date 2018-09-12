package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student
    private:
        string  name,
                group,
                id,
                email;
    public:
        String getName()  {return name;}
        String getGroup() {return group;}
        String getId()    {return id;}
        String getEmail() {return email;}

        void setName(String n){
            this.name = n;
        }
        void setGroup(String g){
            this.group = g;
        }
        void setId(String i){
            this.id = i;
        }
        void setEmail(String e){
            this.email = e;
        }


    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        name  = "Student";
        id    = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn"

    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id   = sid;
        email= em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {

        // TODO:
        name = s.name;
        id   = s.id;
        group= s.group;
        email= s.email;
    }

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
