package example2;

/**
 * 具体模板角色类
 * @author lzz
 * @date 2018/6/7
 */
public class CDAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
