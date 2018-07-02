package example2;

/**
 * 配料的基类（装饰者，用来对汉堡进行多层装饰，每层装饰增加一些配料，相当于上面Decorator）
 * @author lzz
 * @date 2018/6/4
 */
public abstract class Condiment extends Humburger {

    @Override
    public abstract String getName();
}
