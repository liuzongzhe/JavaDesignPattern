/**
 * 客户类
 * @author lzz
 * @date 2018/6/3
 */
public class Customer {
    public static void main(String[] args) {
        //生产宝马320系列配件
        Car320Factory car320Factory = new Car320Factory();
        Engine engineA = car320Factory.createEngine();

        //生产宝马523系列配件
        Car523Factory car523Factory = new Car523Factory();
        Engine engineB = car523Factory.createEngine();
    }
}
