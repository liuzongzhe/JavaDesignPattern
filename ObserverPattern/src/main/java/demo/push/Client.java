package demo.push;

/**
 * @author lzz
 * @date 2018/6/7
 */
public class Client {
    public static void main(String[] args) {

        //创建主题对象-考生考试
        Subject student = new StudentSubject();

        //创建观察者对象1-监考老师
        Observer teacher = new TeacherObsever();
        //创建观察者对象2-监控像头
        Observer camera = new CameraObserver();

        //将两个观察者对象登记到主题对象上-考试中有监考老师并开启监控像头
        student.add(teacher);
        student.add(camera);

        //考生突然作弊！！！
       student.change("打开小抄，偷偷作弊...");
    }
}
