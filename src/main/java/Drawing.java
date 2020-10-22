import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;
    private Circle circle;
    private Rectangle rect;

    // The constructor
    public Drawing() {
        Point p=new Point(200,200);
        Color c=new Color(0x846263);// The RGB number comprises three bytes: red, green and blue
        circle = new Circle(p,c,50);
        Point p1=new Point(50,50);
        rect = new Rectangle(50,100,p1,c);
        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        circle.draw(g);
        rect.draw(g);
    }
}