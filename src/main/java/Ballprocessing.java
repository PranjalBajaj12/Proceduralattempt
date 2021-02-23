import processing.core.PApplet;

public class Ballprocessing extends  PApplet
{

    public static final int WIDTH = 840; //width for a sketch
    public static final int HEIGHT = 680; //height of a sketch
    public static final int DIAMETER = 10; //diameter of the 4 balls
    public static final int INT = 5; //a constant to be used to calculate the y co-ordinate for all the balls
    int x1=0,x2=0,x3=0,x4=0; //x-coordinate for all 4 balls
    int y1,y2,y3,y4;
    int ball1speed=1; // speed for Ball1
    int ball2speed=2; // speed for Ball2
    int ball3speed=3; // speed for Ball3
    int ball4speed=4; // speed for Ball4
    void calculate_Y()
    {
        y1 = HEIGHT * ball1speed / INT; //y-coordinate for Ball1 as height*1/5
        y2 = HEIGHT * ball2speed / INT; //y-coordinate for Ball2 as height*2/5
        y4 = HEIGHT * ball4speed / INT; //y-coordinate for Ball3 as height*3/5
        y3 = HEIGHT * ball3speed / INT; //y-coordinate for Ball4 as height*4/5
    }
    public static void main(String[] args) {
        PApplet.main("Ballprocessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT); //size for sketch
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw()
    {
        calculate_Y();
        ellipse(x1, y1, DIAMETER,DIAMETER); //ball1
        ellipse(x2, y2, DIAMETER,DIAMETER); //ball2
        ellipse(x3, y3, DIAMETER,DIAMETER); //ball3
        ellipse(x4, y4, DIAMETER,DIAMETER); //ball4
        x1+=ball1speed;
        x2+=ball2speed;
        x3+=ball3speed;
        x4+=ball4speed;

    }
}
