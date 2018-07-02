import facade1.Facade1;
import facade2.Facade2;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class Client {
    public static void main(String[] args) {

        Facade1 facade1 = new Facade1();
        facade1.test();

        Facade2 facade2 = new Facade2();
        facade2.test();
    }
}
