package example1;

/**
 * @author lzz
 * @date 2018/6/7
 */
public class Student extends AbstractPerson {

    @Override
    protected void dressUp() {
        System.out.println("穿校服");
    }

    @Override
    protected void eatBreakfast() {
        System.out.println("吃妈妈做好的早饭");
    }

    @Override
    protected void takeThings() {
        System.out.println("背书包，带上家庭作业和红领巾");
    }
}
