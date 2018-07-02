package builder;

/**
 * 顾客调用-小成到电脑城找老板买电脑
 * @author lzz
 * @date 2018/6/3
 */
public class Client {
    public static void main(String[] args) {

        //逛了很久终于发现一家合适的电脑店
        //找到该店的老板和装机人员
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        //沟通需求后，老板叫装机人员去装电脑
        director.Construct(builder);

        //装完后，组装人员搬来组装好的电脑
        Computer computer = builder.getComputer();
        //组装人员展示电脑给小成看
        computer.show();
    }
}
