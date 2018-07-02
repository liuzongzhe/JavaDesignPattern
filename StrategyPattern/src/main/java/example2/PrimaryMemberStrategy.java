package example2;

/**
 * 初级会员折扣类
 * @author lzz
 * @date 2018/6/6
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
