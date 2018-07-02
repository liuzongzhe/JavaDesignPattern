package example2;

/**
 * 抽象策略类-折扣类
 * @author lzz
 * @date 2018/6/6
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    double calcPrice(double booksPrice);
}
