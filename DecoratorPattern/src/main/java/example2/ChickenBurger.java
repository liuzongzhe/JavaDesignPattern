package example2;

/**
 * 鸡腿堡类（被装饰者的初始状态，有些自己的简单装饰，相当于上面的Person）
 * @author lzz
 * @date 2018/6/4
 */
public class ChickenBurger extends Humburger {

    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
