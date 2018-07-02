package example1;

/**
 * @author lzz
 * @date 2018/6/5
 */
public class Client {
    public static void main(String[] args) {

        Bridge B2 = new B2();

        //从哪走
        Area A2 = new A2();
        //去哪里
        A2.setBridge(B2);

        A2.fromArea();
        B2.targetB();

        //A2-->B2
    }
}
