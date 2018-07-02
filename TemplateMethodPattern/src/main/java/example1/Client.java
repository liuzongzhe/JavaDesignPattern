package example1;

/**
 * @author lzz
 * @date 2018/6/7
 */
public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        student.prepareGoToSchool();

        Teacher teacher  = new Teacher();
        teacher.prepareGoToSchool();
    }
}
