package Core;

import javax.swing.JFrame;



import window.Window;

public class Main extends JFrame{

	public static void main(String[] args) {
		
		Window window = new Window("Calculator - By Ryandw11");
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
