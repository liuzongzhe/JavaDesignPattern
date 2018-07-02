package single;

/**
 * @author lzz
 * @date 2018/6/5
 */
public class Client {
    public static void main(String[] args) {

        Flyweight fly1, fly2, fly3;
        //可用单例模式管理FlyweightFactory
        FlyweightFactory factory = new FlyweightFactory();

        fly1 = factory.getFlyWeight(new Character('a'));
        fly1.operation("First Call");

        fly2 = factory.getFlyWeight(new Character('b'));
        fly2.operation("Second Call");

        fly3 = factory.getFlyWeight(new Character('a'));
        fly3.operation("Third Call");

        //类似于String的常量池，数据库连接池
        //false
        System.out.println(fly1 == fly2);
        //true
        System.out.println(fly1 == fly3);
        //false
        System.out.println(fly2 == fly3);
    }
}
