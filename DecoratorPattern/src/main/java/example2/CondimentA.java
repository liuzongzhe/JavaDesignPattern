package example2;

/**
 * 生菜（装饰者的第一层，相当于上面的decoratorA）
 * @author lzz
 * @date 2018/6/4
 */
public class CondimentA extends Condiment {

    Humburger humburger;

    public CondimentA(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + "加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 1.5;
    }
}
