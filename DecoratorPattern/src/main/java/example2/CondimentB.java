package example2;

/**
 * 辣椒（装饰者的第二层，相当于上面的decoratorB）
 * @author lzz
 * @date 2018/6/4
 */
public class CondimentB extends Condiment {

    Humburger humburger;

    public CondimentB(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + "加辣椒";
    }

    @Override
    public double getPrice() {
        //辣椒是免费的哦
        return humburger.getPrice();
    }
}
