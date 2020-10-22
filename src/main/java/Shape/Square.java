package Shape;

import java.awt.*;

public class Square extends Rectangle {
    private int side;

    public Square(int side, Point initPos, Color col) {
        super(side,side,initPos,col);
    }
}