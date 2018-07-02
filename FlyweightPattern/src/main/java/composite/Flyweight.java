package composite;

/**
 * 抽象享元角色类
 * @author lzz
 * @date 2018/6/5
 */
public interface Flyweight {
    //一个示意性方法，参数state是外蕴状态
    void operation(String extrinsicState);
}
