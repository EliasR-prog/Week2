import java.awt.*;

public class Rectangle extends Shape {
    private int height;
    private int width;

    public Rectangle(int w, int h,Point initPos, Color col){
        super(initPos, col);
        height=h;
        width=w;
    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,height,width);
    }
}
