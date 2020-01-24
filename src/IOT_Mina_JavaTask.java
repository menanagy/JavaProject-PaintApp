import java.applet.*;
import java.awt.*;//import java.awt.Graphics;  
import java.awt.event.*;
import java.util.Vector; 
public class IOT_Mina_JavaTask extends Applet {

    Vector<Line> arrline = new Vector<Line>();
    Vector<Rectangle> arrRectangle = new Vector<Rectangle>();
    Vector<Oval> arrOval = new Vector<Oval>();
    int shape=0,indexLine = 0,indexRec=0,indexOval=0;
    Color colorDraw=Color.BLACK;    
    boolean shape_filled=false;
//Line l= new Line();
    
    public void init() {
        Button []arrayButton={new Button("Line"),new Button("Rectangle"),
        new Button("Oval"),new Button("Red"),new Button("Green"),new Button("Blue"),
        new Button("Filled"),new Button("Not Filled"),new Button("ClearAll")
        };
        //Line
        arrayButton[0].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event
                                    shape=0;
                                }
                                });
        
        //Rec
        arrayButton[1].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event
                                    shape=1;
                                }
                                });
        
        //OVal
        arrayButton[2].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event
                                    shape=2;
                                }
                                });
        
        //Red
        arrayButton[3].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event
                                        colorDraw=Color.RED;   
                                }
                                });
        
        //Green
        arrayButton[4].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event  
                                        colorDraw=Color.GREEN;
                                }
                                });
        
        //BLUE
        arrayButton[5].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event
                                       colorDraw=Color.BLUE;
                                }
                                });
        
        //Filled
        arrayButton[6].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event
                                 shape_filled=true;
                                }
                                });
        
        //NOTFILLED
        arrayButton[7].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event
                                   shape_filled=false;
                                }
                                });
        //Clear
        arrayButton[8].addActionListener(new ActionListener(){//Add Listener
                                public void actionPerformed(ActionEvent ev){//Event
                                   arrline.clear();
                                   indexLine=0;
                                   arrRectangle.clear();
                                   indexRec=0;
                                   arrOval.clear();
                                   indexOval=0;
                                   colorDraw=Color.BLACK;
                                   shape_filled=false;
                                   repaint();
                                }
                                });
        
        
        for(int j=0; j<arrayButton.length; j++){
            add(arrayButton[j]);
        }
        this.addMouseListener(
                new MouseListener() {//Add Listener
                    @Override   public void mousePressed(MouseEvent e) {
                        if(shape==0){
                            arrline.add(new Line());
                            arrline.get(indexLine).setColorLine(colorDraw);
                            arrline.get(indexLine).setX1(e.getX());
                            arrline.get(indexLine).setY1(e.getY());
                            
                        }
                        else if(shape==1){
                            arrRectangle.add(new Rectangle());
                            arrRectangle.get(indexRec).setColorRectangle(colorDraw);
                            arrRectangle.get(indexRec).setFilled(shape_filled);
                            arrRectangle.get(indexRec).setX1(e.getX());
                            arrRectangle.get(indexRec).setY1(e.getY());
                        }
                        else if(shape==2){
                            arrOval.add(new Oval());
                            arrOval.get(indexOval).setColorRectangle(colorDraw);
                            arrOval.get(indexOval).setFilled(shape_filled);
                            arrOval.get(indexOval).setX1(e.getX());
                            arrOval.get(indexOval).setY1(e.getY());
                        }
                    }
                    @Override   public void mouseReleased(MouseEvent e) {
                        if(shape==0){
                            indexLine++;
                        }
                        else if(shape==1){
                            indexRec++;
                        }
                        else if(shape==2){
                            indexOval++;
                        }
                        
                    }
                    @Override   public void mouseClicked(MouseEvent e) {}
                    @Override   public void mouseEntered(MouseEvent e){}
                    @Override   public void mouseExited(MouseEvent e){}
                });
        this.addMouseMotionListener(
                new MouseMotionListener() {//Add Listener
                    @Override
                    public void mouseDragged(MouseEvent e) {
                         if(shape==0){
                            arrline.get(indexLine).setX2(e.getX());
                            arrline.get(indexLine).setY2(e.getY());
                            repaint();
                         }
                         else if(shape==1){
                            arrRectangle.get(indexRec).setColorRectangle(colorDraw);
                            arrRectangle.get(indexRec).setWidth(Math.abs(arrRectangle.get(indexRec).getX1()-e.getX()));
                            arrRectangle.get(indexRec).setHeight(Math.abs(arrRectangle.get(indexRec).getY1()-e.getY()));
                            repaint();
                        }
                         else if(shape==2){
                            arrOval.get(indexOval).setColorRectangle(colorDraw);
                            arrOval.get(indexOval).setWidth(Math.abs(e.getX()-arrOval.get(indexOval).getX1()));
                            arrOval.get(indexOval).setHeight(Math.abs(e.getY()-arrOval.get(indexOval).getY1()));
                            arrOval.get(indexOval).setUpperLeftX(Math.min(arrOval.get(indexOval).getX1(),e.getX()));
                            arrOval.get(indexOval).setUpperLeftY(Math.min(arrOval.get(indexOval).getY1(),e.getY()));
                            repaint();
                             //Math.min(getX1(),getX2())
                         }
                    }

                    @Override
                    public void mouseMoved(MouseEvent e) {
                    }
                });
    }

    public void paint(Graphics g) {
        //System.out.print(arrline.length);
            for (int j = 0; j < arrline.size(); j++) {
                g.setColor(arrline.get(j).getColorLine());
                g.drawLine(arrline.get(j).getX1(), arrline.get(j).getY1(), arrline.get(j).getX2(), arrline.get(j).getY2());
               
             }
             for (int j = 0; j < arrRectangle.size(); j++) {
                g.setColor(arrRectangle.get(j).getColorRectangle());
                if(arrRectangle.get(j).isFilled()!=true){
                    g.drawRect(arrRectangle.get(j).getX1(),arrRectangle.get(j).getY1(),
                            arrRectangle.get(j).getWidth(),arrRectangle.get(j).getHeight());
                }
                else{
                    g.fillRect(arrRectangle.get(j).getX1(),arrRectangle.get(j).getY1(),
                            arrRectangle.get(j).getWidth(),arrRectangle.get(j).getHeight());
                }
             }
                for (int j = 0; j <arrOval.size(); j++) {
                g.setColor(arrOval.get(j).getColorRectangle());
                if(arrOval.get(j).isFilled()!=true){
                    g.drawOval(arrOval.get(j).getUpperLeftX(),arrOval.get(j).getUpperLeftY(),
                            arrOval.get(j).getWidth(),arrOval.get(j).getHeight());
                }
                else{
                    g.fillOval(arrOval.get(j).getUpperLeftX(),arrOval.get(j).getUpperLeftY(),
                            arrOval.get(j).getWidth(),arrOval.get(j).getHeight());
                }
                
               
        }
             
    }

}
