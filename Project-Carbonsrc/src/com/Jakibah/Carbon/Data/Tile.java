package com.Jakibah.Carbon.Data;

import java.util.ArrayList;

import com.Jakibah.Carbon.Types.TileType;
import com.Jakibah.Carbon.Utilities.Draw;

public class Tile {
	private static TileType tile;
	private static String tex;
	private static int x, y, width, height;
	private static ArrayList<Tile> Tiles;
	
	public Tile(TileType tile, String tex, int x, int y, int width, int height){
		Tile.tile = tile;
		Tile.tex = tex;
		Tile.x = x;
		Tile.y = y;
		Tile.width = width;
		Tile.height = height;
		Tile.setTiles(new ArrayList<Tile>());
        Tiles.add(this);
	}
	public static void handleTiles(){
		for(Tile t : Tiles){
			t.draw();
		}
	}
	public void draw(){
		Draw.DrawQuadTex(Draw.QuickLoadTexture(tex), x, y, width, height);
	}
	public static TileType getTile() {
		return tile;
	}
	public static void setTile(TileType tile) {
		Tile.tile = tile;
	}
	public static String getTex() {
		return tex;
	}
	public static void setTex(String tex) {
		Tile.tex = tex;
	}
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		Tile.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		Tile.y = y;
	}
	public static int getWidth() {
		return width;
	}
	public static void setWidth(int width) {
		Tile.width = width;
	}
	public static int getHeight() {
		return height;
	}
	public static void setHeight(int height) {
		Tile.height = height;
	}
	public static ArrayList<Tile> getTiles() {
		return Tiles;
	}
	public static void setTiles(ArrayList<Tile> tiles) {
		Tiles = tiles;
	}

}
