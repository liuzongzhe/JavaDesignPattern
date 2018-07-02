package example1;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class DecoratorB extends Decorator {

    public DecoratorB(Human human) {
        super(human);
    }

    /**
     * 自定义装饰方法1
     */
    public void goClothesPress() {
        System.out.println("去衣柜找找看...");
    }

    /**
     * 自定义装饰方法2
     */
    public void findBookOnBed() {
        System.out.println("在床上找找书...");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        //装饰穿衣服方法
        goClothesPress();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        //装饰去哪里方法
        findBookOnBed();
    }
}
