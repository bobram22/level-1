import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Simple_Calculator implements ActionListener {
JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField t = new JTextField();
	JTextField T = new JTextField();
	JButton a = new JButton("add");
	JButton s = new JButton("sub");
	JButton m = new JButton("mul");
	JButton d = new JButton("div");
	JLabel l = new JLabel();
double	add(double num1, double num2){
	return num1 + num2;	
	}
double sub(double num1 , double num2){
	return num1 - num2;
}
	double mul (double num1, double num2){
		return num1 * num2;
	}
	double div (double num1, double num2){
		return num1 / num2;
	}
	
	void Setup(){
	
	f.setVisible(true);
	f.add(p);
	p.add(l);
	p.add(m);
	p.add(d);
	p.add(s);
	p.add(a);
	p.add(T);
	p.add(t);
	t.setColumns(10);
	T.setColumns(10);
	a.addActionListener(this);
	s.addActionListener(this);
	m.addActionListener(this);
	d.addActionListener(this);
f.pack();
}
public static void main(String[] args) {
	Simple_Calculator cal = new Simple_Calculator();
	cal.Setup();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	String num = t.getText();
	String Num = T.getText();
	double nUm = Integer.parseInt(num);
	double NUm = Integer.parseInt(Num);
	if(e.getSource() == a){
		double aa = add(nUm,NUm);
		l.setText(" "+aa);
	}
	if(e.getSource() == s){
		double as = sub(nUm,NUm);
		l.setText(" "+as);
	}
	if(e.getSource() == m){
		double am = mul(nUm,NUm);
		l.setText(" "+am);
	}
	if(e.getSource() == d){
		double ad = div(nUm,NUm);
		l.setText(" "+ad);
	}
}

}
