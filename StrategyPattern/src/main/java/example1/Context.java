package example1;

/**
 * 环境类（Context)
 * @author lzz
 * @date 2018/6/6
 */
public class Context {

    //不变的内容...

    private Strategy strategy;

    //引入策略方式一：构造函数，要你使用哪个妙计
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //引入策略方式二：动态设置具体策略妙计
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        //调用具体策略方法
        strategy.operate();
    }
}
