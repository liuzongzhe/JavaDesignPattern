package example2;

/**
 * 甜酱（装饰者的第三层，相当于上面的decoratorC）
 * @author lzz
 * @date 2018/6/4
 */
public class CondimentC extends Condiment {

    Humburger humburger;

    public CondimentC(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + "加甜酱";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 3.0;
    }
}
