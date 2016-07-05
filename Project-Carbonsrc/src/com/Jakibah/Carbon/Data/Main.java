package com.Jakibah.Carbon.Data;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;

import com.Jakibah.Carbon.Types.TileType;
import com.Jakibah.Carbon.Utilities.*;

public class Main {

	public Main() {

		Draw.BeginSession();
        
		Player p1 = new Player("Test", 100, 10, 10, 32, 32);
		Tile testtile = new Tile(TileType.Test, "TestTile", 20, 28, 32, 32);
		Camera c = new Camera(p1, p1.getX(), p1.getY());
		
		
		
		while (!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);  
			Tile.handleTiles();
			Time.update();
			Player.handlePlayer();
			c.update();
			Display.update();
			Display.sync(60);
		}

		Display.destroy();

	}
	public static void main(String[] args) {
		new Main();

	}
	}

