package example2;

/**
 * @author lzz
 * @date 2018/6/5
 */
public class Client {
    public static void main(String[] args) {
        //白色
        Color white = new White();
        //圆形
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        //白色的圆形
        circle.drawShape(white);
        //白色的矩形
        rectangle.drawShape(white);
    }
}
