package App;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class playbackMp3 implements ActionListener {

	Font appFont = new Font("Arial", Font.PLAIN, 15);
	Font buttonFont = new Font("Arial", Font.PLAIN, 12);
	JFrame frame;
	JPanel panel;
	JTextField searchBar, songDisplay;
	JButton[] functionButtons = new JButton[5];
	JButton play, pause, prev, next, search;
	String searchBox;
	String payphone_maroon5 = "Payphone - Maroon 5";
	
	boolean searchSong = false;
	public playbackMp3() {
		
		//gui
		frame = new JFrame("MP3");
		frame.setSize(320, 140);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setBackground(Color.black);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		
		searchBar = new JTextField();
		searchBar.setBounds(23,8, 164, 25);
		searchBar.setFont(appFont);
		searchBar.setHorizontalAlignment(JTextField.LEFT);
		
		songDisplay = new JTextField();
		songDisplay.setBounds(23, 38, 253, 25);
		songDisplay.setFont(appFont);
		songDisplay.setHorizontalAlignment(JTextField.CENTER);
		songDisplay.setEditable(false);
		songDisplay.setBorder(null);
		songDisplay.setText("Searching song to listen...");
		//songDisplay.setBackground(Color.black);
		
		play = new JButton("PLAY");
		pause = new JButton("PAUSE");
		prev = new JButton("PREV");
		next = new JButton("NEXT");
		search = new JButton ("SEARCH");
		
		functionButtons [0] = play;
		functionButtons [1] = pause;
		functionButtons [2] = next;
		functionButtons [3] = prev;
		functionButtons [4] = search;
		
		for (int i = 0; i < 5; i++) {
			
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(buttonFont);
			functionButtons[i].setFocusable(false);
			functionButtons[i].setBackground(Color.white);
			
		}
		
		search.setBounds(192, 8, 84, 24);
		play.setBounds(10, 68, 64, 25);
		pause.setBounds(79, 68, 74, 25);
		next.setBounds(158, 68, 66, 25);
		prev.setBounds(229, 68, 66, 25);
		
		frame.add(prev);
		frame.add(next);
		frame.add(pause);
		frame.add(play);
		frame.add(songDisplay);
		frame.add(search);
		frame.add(searchBar);
		frame.setVisible(true);
		}
	
	
	public static void main(String[] args) {
		playbackMp3 mp3 = new playbackMp3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == search) {
			searchBox = searchBar.getText();
			songDisplay.setText(searchBox);
//			if(searchBox == check_custhekid) {
//				songDisplay.setText("YES");
//			}
		}
	}

}
	