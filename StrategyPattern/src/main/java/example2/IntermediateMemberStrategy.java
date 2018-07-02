package example2;

/**
 * 中级会员折扣类
 * @author lzz
 * @date 2018/6/6
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
