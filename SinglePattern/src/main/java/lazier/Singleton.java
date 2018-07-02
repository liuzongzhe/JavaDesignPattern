package lazier;

/**
 * 懒汉式单例类.在第一次调用的时候实例化自己
 * @author lzz
 * @date 2018/6/3
 */
public class Singleton {
    private Singleton() {}
    private static Singleton single = null;
    /**
     * 静态工厂方法
     */
    public static Singleton getInstance() {
        if (single == null) {
            single = new Singleton();
        }
        return single;
    }
}
