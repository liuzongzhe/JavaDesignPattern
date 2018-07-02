package register;

import java.util.HashMap;
import java.util.Map;

/**
 * 类似Spring里面的方法，将类名注册，
 *
 * 登记式单例实际上维护了一组单例类的实例，将这些实例存放在一个Map（登记薄）中，
 * 对于已经登记过的实例，则从Map直接返回，对于没有登记的，则先登记，然后返回。
 * 其实内部实现还是用的饿汉式单例，因为其中的static方法块，它的单例在类被装载的时候就被实例化了。
 * @author lzz
 * @date 2018/6/3
 */
public class Singleton {
    /**
     * 登记簿map
     */
    private static Map<String, Singleton> map = new HashMap<String, Singleton>();

    static {
        Singleton single = new Singleton();
        map.put(single.getClass().getName(), single);
    }

    protected Singleton() {}

    /**
     * 静态工厂方法，返回此类唯一的实例
     */
    public static Singleton getInstance(String name) {
        if (name == null) {
            name = Singleton.class.getName();
            System.out.println("name : " + name);
        }
        if (map.get(name) == null) {
            try {
                map.put(name, (Singleton) Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }

    /**
     * 一个测试方法
     */
    public String test() {
        return "Hello RegisterSingleton";
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance(null);
        System.out.println(singleton.test());
    }
}
