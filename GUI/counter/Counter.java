package counter;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Counter extends JFrame{
	JLabel myLabel = new JLabel("At: 0");
	JButton btn = new JButton("increment");
	private static int count = 0;

	public Counter(){
		super("Counter");
		setSize(350, 100);

		// ClickPrinter printer = new ClickPrinter();
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// System.out.println("Button was pressed");
				myLabel.setText("At: " + ++count);
			}
		});

		getContentPane().add(myLabel);
		getContentPane().add(btn);
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args){
		new Counter();
	}
}