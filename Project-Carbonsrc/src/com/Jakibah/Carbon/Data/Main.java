package com.Jakibah.Carbon.Data;

import org.lwjgl.opengl.Display;


import com.Jakibah.Carbon.Utilities.*;

public class Main {

	public Main() {

		Draw.BeginSession();
        
		Player p1 = new Player("Test", 8, 10, 10, 32, 32);
		
		
		
		while (!Display.isCloseRequested()) {
			Time.update();
			Player.handlePlayer();
			Display.update();
			Display.sync(122);
		}

		Display.destroy();

	}
	public static void main(String[] args) {
		new Main();

	}
	}

