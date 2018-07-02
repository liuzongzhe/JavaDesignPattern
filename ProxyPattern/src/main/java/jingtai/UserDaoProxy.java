package jingtai;

/**
 * 代理对象,静态代理
 * 组合关联目标对象，比继承更加灵活好用
 * @author lzz
 * @date 2018/6/4
 */
public class UserDaoProxy /*implements UserDao*/ {

    //接收保存目标对象
    private UserDao target;

    public UserDaoProxy(UserDao target) {
        this.target = target;
    }

    public void save() {
        System.out.println("开始事务...");
        target.save(); //执行目标对象的方法
        System.out.println("提交事务...");
    }
}
