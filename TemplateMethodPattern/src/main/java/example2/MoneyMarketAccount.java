package example2;

/**
 * 具体模板角色类
 * @author lzz
 * @date 2018/6/7
 */
public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
