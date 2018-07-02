package factory;

/**
 * @author lzz
 * @date 2018/6/3
 */
public class Customer {
    public static void main(String[] args) {
        Car320Factory car320Factory = new Car320Factory();
        Car car320 = car320Factory.createCar();

        Car523Factory car523Factory = new Car523Factory();
        Car car523 = car523Factory.createCar();
    }

}
