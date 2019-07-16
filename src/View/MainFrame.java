package View;
/*
Code created by Josh Braza 
*/

import javax.swing.JFrame;
import Interfaces.GameConstants;
import ServerController.Server;


@SuppressWarnings("serial")
public class MainFrame extends JFrame implements GameConstants {
	
	private Session mainPanel;
	private Server server;
	
	public MainFrame(){	
		server = new Server();
		CARDLISTENER.setServer(server);
		BUTTONLISTENER.setServer(server);
		
		mainPanel = server.getSession();
		add(mainPanel);
	}
}
