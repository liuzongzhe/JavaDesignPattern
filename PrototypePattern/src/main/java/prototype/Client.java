package prototype;

/**
 * 客户调用
 * @author lzz
 * @date 2018/6/3
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype c = (ConcretePrototype) cp.clone();
            //每一个都是不同的地址值
            System.out.println(c);
        }
    }
}
