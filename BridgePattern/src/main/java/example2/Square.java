package example2;

/**
 * @author lzz
 * @date 2018/6/5
 */
public class Square extends Shape {
    @Override
    public void drawShape(Color color) {
        color.paintColor();
        System.out.println("正方形");
    }
}
