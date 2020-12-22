import java.awt.*;
import java.awt.event.*;
public class cop extends Frame implements ActionListener{
    TextField f1, f2;
    Label lf1, lf2;
    Button b;
    public cop(){
        setLayout(new FlowLayout());
        Label lf1 = new Label("FIELD 1", Label.RIGHT);
        Label lf2 = new Label("FIELD 2", Label.RIGHT);
        f1 = new TextField(12);
        f2 = new TextField(12);
        b = new Button("PASTE");
        add(lf1);
        add(f1);
        add(lf2);
        add(f2);
        add(b);
        b.addActionListener(this);
        addWindowListener(new WindowAdapter1());
    }
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==b){           
                 String t1= f1.getText();
                 f2.setText(t1);            
         }
    }
    public static void main(String args[]) {
        cop cp = new cop();
        cp.setSize(new Dimension(400, 400));
        cp.setTitle("COPY & PASTE");
        cp.setVisible(true);
    }

    class WindowAdapter1 extends WindowAdapter {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }
}
