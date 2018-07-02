package example2;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class Client {
    public static void main(String[] args) {
        Humburger humburger = new ChickenBurger();
        System.out.println(humburger.getName() + ", 价格：" + humburger.getPrice());

        Humburger humburgerA = new CondimentA(humburger);
        System.out.println(humburgerA.getName() + ", 价格：" + humburgerA.getPrice());

        Humburger humburgerB = new CondimentB(humburger);
        System.out.println(humburgerB.getName() + ", 价格：" + humburgerB.getPrice());

        Humburger humburgerC = new CondimentC(humburger);
        System.out.println(humburgerC.getName() + ", 价格：" + humburgerC.getPrice());

    }
}
