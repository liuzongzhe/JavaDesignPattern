package prototype;

/**
 * 原型类，实现Cloneable接口
 * @author lzz
 * @date 2018/6/3
 */
public class Prototype implements Cloneable {

    @Override
    public Object clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
