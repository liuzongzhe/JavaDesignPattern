package example2;

/**
 * 高级会员折扣类
 * @author lzz
 * @date 2018/6/6
 */
public class AdvancedMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
