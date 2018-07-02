package example1;

/**
 * @author lzz
 * @date 2018/6/4
 */
public class Client {
    public static void main(String[] args) {
        Human person = new Person();

//        Decorator decoratorA = new DecoratorA(person);
//        Decorator decoratorB = new DecoratorB(person);
//        Decorator decoratorC = new DecoratorC(person);
        //Decorator implements Human

        //单层装饰
        Human personA = new DecoratorA(person);
        Human personB = new DecoratorB(person);
        Human personC = new DecoratorC(person);

        //多层装饰
        Human decoratorPerson = new DecoratorC(new DecoratorB(new DecoratorA(person)));
        decoratorPerson.wearClothes();
        decoratorPerson.walkToWhere();
    }
}
