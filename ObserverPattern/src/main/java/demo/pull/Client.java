package demo.pull;

/**
 * @author lzz
 * @date 2018/6/7
 */
public class Client {
    public static void main(String[] args) {

        //创建主题对象-婴儿
        Subject baby = new BabySubject();

        //创建观察者对象1-妈妈
        Observer mom = new MomObserver();
        //创建观察者对象2-爸爸
        Observer dad = new DadObserver();

        //将两个观察者对象登记到主题对象上-妈妈爸爸时时刻刻照看婴儿
        baby.add(mom);
        baby.add(dad);

        //婴儿大哭
        baby.change("哇哇哇！！！");

        //婴儿睡着了
        baby.change("呼呼呼！！！");
    }
}
