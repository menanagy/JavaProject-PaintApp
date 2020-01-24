
import java.awt.Color;

class Line {
private int x1, x2, y1, y2;
private Color colorLine;
    public Line() {
        x1 = x2 = y1 = y2 = 0;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setColorLine(Color colorLine) {
        this.colorLine = colorLine;
    }

    public Color getColorLine() {
        return colorLine;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
}
class Rectangle {
private int x1, y1,width,height;
private boolean filled;
private Color colorRectangle;
    public Rectangle() {
        x1=y1=height=width=0;
        filled=false;
    }

      public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
        public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setColorRectangle(Color colorRectangle) {
        this.colorRectangle= colorRectangle;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Color getColorRectangle() {
        return colorRectangle;
    }
 
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isFilled() {
        return filled;
    }

}
class Oval {
private int x1, y1,width,height,upperLeftX,upperLeftY;
private boolean filled;
private Color colorRectangle;
    public Oval() {
        x1=y1=height=width=upperLeftX=upperLeftY=0;
        filled=false;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
        public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setColorRectangle(Color colorRectangle) {
        this.colorRectangle= colorRectangle;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setUpperLeftX(int upperLeftX) {
        this.upperLeftX = upperLeftX;
    }

    public void setUpperLeftY(int upperLeftY) {
        this.upperLeftY = upperLeftY;
    }
    
    
    public Color getColorRectangle() {
        return colorRectangle;
    }
 
    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isFilled() {
        return filled;
    }

    public int getUpperLeftX() {
        return upperLeftX;
    }

    public int getUpperLeftY() {
        return upperLeftY;
    }

}

public class Shapes {
}
