import java.awt.*;
import java.awt.event.*;
public class buttons extends Frame implements ActionListener{
    String msg="";
    public buttons(){
        setLayout(new FlowLayout());
        Button yes=new Button("YES");
        Button no=new Button("NO");
        Button maybe=new Button("UNDECIDED");
        add(yes);
        add(no);
        add(maybe);
        yes.addActionListener(this);
        no.addActionListener(this);
        maybe.addActionListener(this);
   addWindowListener(new WindowAdapter1());
}
public void actionPerformed(ActionEvent ae)
{
    String s=ae.getActionCommand();
    if(s.equals("YES"))
    {
        msg="YOU PRESSED YES";
    }
    else if(s.equals("NO"))
    {
        msg="YOU PRESSED NO";
    }
    else
    {
        msg="YOU PRESSED UNDECIDED";
    }
    repaint();
}
public void paint(Graphics g)
{
    g.drawString(msg,20,100);
}
public static void main(String args[])
{
    buttons b=new buttons();
    b.setSize(new Dimension(250,150));
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


