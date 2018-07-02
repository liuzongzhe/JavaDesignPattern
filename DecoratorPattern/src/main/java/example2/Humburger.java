package example2;

/**
 * 汉堡基类（被装饰者，相当于上面的Human）
 * @author lzz
 * @date 2018/6/4
 */
public abstract class Humburger {

    protected  String name ;

    public String getName(){
        return name;
    }

    public abstract double getPrice();
}
