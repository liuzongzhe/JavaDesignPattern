package demo.push;

/**
 * 监考老师
 * @author lzz
 * @date 2018/6/7
 */
public class TeacherObsever implements Observer {

    @Override
    public void update(String state) {
        System.out.println("监考老师发现：" + state);
    }
}
