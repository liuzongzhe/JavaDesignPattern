package simple;

/**
 * 客户类
 * @author lzz
 * @date 2018/6/3
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car320 = factory.createCar(320);
        Car car523 = factory.createCar(523);
    }
}
