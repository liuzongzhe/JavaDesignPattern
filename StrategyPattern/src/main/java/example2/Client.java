package example2;

/**
 * 客户端-购买者
 * @author lzz
 * @date 2018/6/6
 */
public class Client {
    public static void main(String[] args) {
        //创建环境
        Price price1, price2, price3;
        //计算折扣价
        double quote1, quote2, quote3;

        //选择并创建需要使用的策略对象1
        price1 = new Price(new PrimaryMemberStrategy());
        quote1 = price1.quote(300);
        System.out.println("图书的最终价格为：" + quote1);

        //选择并创建需要使用的策略对象2
        price2 = new Price(new IntermediateMemberStrategy());
        quote2 = price2.quote(300);
        System.out.println("图书的最终价格为：" + quote2);

        //选择并创建需要使用的策略对象3
        MemberStrategy strategy = new AdvancedMemberStrategy();
        price3 = new Price(strategy);
        quote3 = price3.quote(300);
        System.out.println("图书的最终价格为：" + quote3);
    }
}
