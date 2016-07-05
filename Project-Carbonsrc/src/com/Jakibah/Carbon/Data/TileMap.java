package com.Jakibah.Carbon.Data;

import com.Jakibah.Carbon.Types.TileType;

public class TileMap {

	private int[] map;
	
	public TileMap(int[] map){
		this.setMap(map);
	}
	public void build(){
		for(int i = 0; 0 < map.length; i++){
			new Tile(TileType.Test, "TestTile", i * 32, i * 32, 32, 32);
		}
	}

	public int[] getMap() {
		return map;
	}

	public void setMap(int[] map) {
		this.map = map;
	}
}
