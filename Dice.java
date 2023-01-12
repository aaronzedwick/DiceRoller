import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Dice implements ActionListener{

	Font defaultFont = new Font("", Font.BOLD,20);
	Font tweleveFont = new Font("", Font.BOLD ,10);
	JTextField field = new JTextField();
	JFrame dice = new JFrame("Dice Roller");
	JButton fourSided = new JButton("4");
	JButton sixSided = new JButton("6");
	JButton tweleveSided = new JButton("12");
	JLabel dieSelect = new JLabel("Select Die To Roll:");
	JLabel result = new JLabel("Result:");
	
	
	Dice(){
		field.setBounds(125,125,100,50);
		field.setFont(defaultFont);
		field.setEditable(false);
		field.setFocusable(false);
		result.setBounds(125,105,50,20);
		tweleveSided.setBounds(0,20,45,45);
		tweleveSided.setFocusable(false);
		tweleveSided.addActionListener(this);
		tweleveSided.setFont(tweleveFont);
		sixSided.setBounds(0,80,45,45);
		sixSided.setFocusable(false);
		sixSided.addActionListener(this);
		sixSided.setFont(defaultFont);
		fourSided.setBounds(0,140,45,45);
		fourSided.setFocusable(false);
		fourSided.addActionListener(this);
		fourSided.setFont(defaultFont);
		dieSelect.setBounds(0,0,120,10);
		dice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dice.setSize(250,250);
		dice.setLayout(null);
		dice.setVisible(true);
		dice.add(field);
		dice.add(tweleveSided);
		dice.add(sixSided);
		dice.add(fourSided);
		dice.add(dieSelect);
		dice.add(result);
	}
	
	public static void main(String[] args) {
		
		Dice die = new Dice();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == fourSided) {
			Random rand = new Random();
			int randomInt = 1 + rand.nextInt(4);
			field.setText(String.valueOf(randomInt));
		}
		if(e.getSource() == sixSided) {
			Random rand = new Random();
			int randomInt = 1 + rand.nextInt(6);
			field.setText(String.valueOf(randomInt));
		}
		if(e.getSource() == tweleveSided) {
			Random rand = new Random();
			int randomInt = 1 + rand.nextInt(12);
			field.setText(String.valueOf(randomInt));
		}
	}

}
