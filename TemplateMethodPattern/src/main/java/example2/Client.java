package example2;

/**
 * @author lzz
 * @date 2018/6/7
 */
public class Client {
    public static void main(String[] args) {

        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());

        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }

}
