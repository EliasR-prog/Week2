import java.awt.*;

public class Rectangle {
    private int height;
    private int width;
    private Point pos;
    private Color col;
    public Rectangle(int w, int h,Point initPos, Color col){
        height=h;
        width=w;
        pos=initPos;
        this.col=col;
    }
    public void draw(Graphics g) { // A method that draws the object in g
        g.setColor(col);
        g.fillRect(pos.x,pos.y,height,width);
    }
}
