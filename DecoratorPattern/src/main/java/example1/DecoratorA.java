package example1;

/**
 * 定义三种装饰，这是第一个，
 * 第二个第三个功能依次细化，
 * 即装饰者的功能越来越多
 * @author lzz
 * @date 2018/6/4
 */
public class DecoratorA extends Decorator {

    public DecoratorA(Human human) {
        super(human);
    }

    /**
     * 自定义装饰方法1
     */
    public void goHome() {
        System.out.println("进房子...");
    }

    /**
     * 自定义装饰方法2
     */
    public void findBook() {
        System.out.println("找本书...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        //装饰穿衣服方法
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        //装饰去哪里方法
        findBook();
    }
}
