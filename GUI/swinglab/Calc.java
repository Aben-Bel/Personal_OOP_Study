package swinglab;

import java.awt.*;
import javax.swing.*;

public class Calc extends JFrame{
	private JPanel entryPanel;
	private JPanel answerPanel;
	private JComboBox operation;

	public static String ADD_OP = "ADDITION";
	public static String SUB_OP = "SUBTRACTION";
	public static String MUL_OP = "MULTIPLICATION";
	public static String DIV_OP = "DIVISION";

	public Calc() {
		Container cp = getContentPane();

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setBackground(Color.white);

		setTitle("My Funcky Calculator");
		setSize(1000, 700);

		entryPanel = new JPanel();
		entryPanel.setBackground(Color.orange);
		answerPanel = new JPanel();
		answerPanel.setBackground(Color.yellow);
		cp.add(entryPanel);
		cp.add(answerPanel);

		operation = new JComboBox();
		operation.addItem(ADD_OP);
		operation.addItem(SUB_OP);
		operation.addItem(MUL_OP);
		operation.addItem(DIV_OP);

		operation.setBackground(Color.blue);

	}
	public static void main(String[] args){
		Calc trial = new Calc();

		trial.setVisible(true);
	}
}