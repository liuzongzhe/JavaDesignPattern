package example1;

/**
 * 定义被装饰者类，被装饰者初始状态有些自己的装饰
 * @author lzz
 * @date 2018/6/4
 */
public class Person implements Human {

    @Override
    public void wearClothes() {
        System.out.println("穿什么呢...");
    }

    @Override
    public void walkToWhere() {
        System.out.println("去哪里...");
    }
}
