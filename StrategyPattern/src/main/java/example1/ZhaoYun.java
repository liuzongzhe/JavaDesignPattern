package example1;

/**
 *  应用
 * 场景如下，刘备要到江东娶老婆了，走之前诸葛亮给赵云三个锦囊妙计，
 * 说是按天机拆开能解决棘手问题。场景中出现三个要素：
 * 三个妙计（具体策略类）、一个锦囊（环境类）、赵云（调用者）。
 *
 * 策略调用者---赵云
 * @author lzz
 * @date 2018/6/6
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;

        System.out.println("----------刚到吴国, 使用第一个锦囊---------------");
        //使用第一个策略
        context = new Context(new ConcreteStrategy1());
        context.operate();

        System.out.println("----------刘备乐不思蜀, 使用第二个锦囊---------------");
        //使用第二个策略
        context.setStrategy(new ConcreteStrategy2());
        context.operate();

        System.out.println("----------孙权的追兵来了, 使用第三个锦囊---------------");
        //使用第三个策略
        context.setStrategy(new ConcreteStrategy3());
        context.operate();
    }
}
