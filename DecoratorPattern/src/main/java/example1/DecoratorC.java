package example1;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class DecoratorC extends Decorator {

    public DecoratorC(Human human) {
        super(human);
    }

    /**
     * 自定义装饰方法1
     */
    public void goClothes() {
        System.out.println("找到一件衣服...");
    }

    /**
     * 自定义装饰方法2
     */
    public void findTarget() {
        System.out.println("找到一本书...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        //装饰穿衣服方法
        goClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        //装饰去哪里方法
        findTarget();
    }
}
