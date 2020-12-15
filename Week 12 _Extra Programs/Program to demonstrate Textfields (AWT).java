import java.awt.*;
import java.awt.event.*;
public class textfields extends Frame implements ActionListener{
    TextField name,pass;
    public textfields(){
        setLayout(new FlowLayout());
        Label lname=new Label("NAME: ",Label.RIGHT);
        name=new TextField(12);
        Label lpass=new Label("PASSWORD: ",Label.RIGHT);
        pass=new TextField(8);
        pass.setEchoChar('*');
        add(lname);
        add(name);
        add(lpass);
        add(pass);
        name.addActionListener(this);
        pass.addActionListener(this);
   addWindowListener(new WindowAdapter1());
}
public void actionPerformed(ActionEvent ae)
{
    repaint();
}
public void paint(Graphics g)
{
    g.drawString("NAME:"+name.getText(),20,100);
    g.drawString("SELECTED TEXT IN THE NAME:"+name.getSelectedText(),20,160);
    g.drawString("PASSWORD:"+pass.getText(),20,220);
}
public static void main(String args[])
{
    textfields b=new textfields();
    b.setSize(new Dimension(400,400));
    b.setTitle("Button");
    b.setVisible(true);
}
 }

 class WindowAdapter1 extends WindowAdapter{
     public void windowClosing(WindowEvent we)
     {
         System.exit(0);
     }
 }

