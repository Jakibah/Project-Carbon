package com.Jakibah.Carbon.Data;



import java.util.ArrayList;

import org.lwjgl.input.Keyboard;

import com.Jakibah.Carbon.Utilities.Draw;
import com.Jakibah.Carbon.Utilities.Time;


public class Player {
	private static String tex;
	private static float x;
	private static float y;
	private static float width;
	private static float height;
	private static float speed;
	private static ArrayList<Player> Players;
	
	
	
	
	public Player (String tex, float speed, float x, float y, float width, float height){
		
		Player.tex = tex;
		Player.x = x;
		Player.y = y;
		Player.width = width;
		Player.height = height;
		Player.speed = speed;
        this.setPlayers(new ArrayList<Player>());
        Players.add(this);
		
		
	}
	
	
	public static int Direction = 2;
	public static boolean Moving = false;
	public static boolean start = false;
	
	public static void handlePlayer(){
		for(Player p: Players){
			Player.Update();
			Player.draw();
		}
	}
	
public static void Walk(){
	if(start == false){
		start = true;
		Moving = false;
	}
	if(Direction == 0 && Moving == true ){
		System.out.println("Walking North");
		  getPlayers().get(0).setY(y -= speed * Delta());
		}
	if(Direction == 1 && Moving == true ){
		System.out.println("Walking East");
		getPlayers().get(0).setX(x += speed * Delta());
		
		}
	if(Direction == 2 && Moving == true ){
		System.out.println("Walking South");
		getPlayers().get(0).setY(y += speed * Delta());
		}
	if(Direction == 3 && Moving == true ){
		System.out.println("Walking West");
		getPlayers().get(0).setX(x -= speed * Delta());
		}
	if(Direction == 0 && Moving == false ){
		System.out.println("Standing North");
		}
	if(Direction == 1 && Moving == false ){
		System.out.println("Standing East");
		}
	if(Direction == 2 && Moving == false ){
		System.out.println("Standing South");
		}
	if(Direction == 3 && Moving == false ){
		System.out.println("Standing West");
		}
}
public static void Inputs(){
		if(Keyboard.isKeyDown(Keyboard.KEY_W)){
			Direction = 0;
			Moving = true;
			}
		if(Keyboard.isKeyDown(Keyboard.KEY_D)){
			Direction = 1;
			Moving = true;
			}
		if(Keyboard.isKeyDown(Keyboard.KEY_S)){
			Direction = 2;
			Moving = true;
			}
		if(Keyboard.isKeyDown(Keyboard.KEY_A)){
			Direction = 3;
			Moving = true;
			}
		if(!Keyboard.isKeyDown(Keyboard.KEY_W) && !Keyboard.isKeyDown(Keyboard.KEY_D) && !Keyboard.isKeyDown(Keyboard.KEY_S) && !Keyboard.isKeyDown(Keyboard.KEY_A)){
			Moving = false;
		}
		}

    public static void draw(){
    	DrawQuadTex(QuickLoad(tex), x, y, width, height);
    }

	

    public static void Update(){
	   System.out.println(getPlayers().get(0).getX() + "x" + getPlayers().get(0).getY() + "y");
       Inputs();
	   Walk();
   }
	public String getTex() {
		return tex;
	}
	public void setTex(String tex) {
		Player.tex = tex;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		Player.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		Player.y = y;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		Player.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		Player.height = height;
	}
	public static ArrayList<Player> getPlayers() {
		return Players;
	}
	public void setPlayers(ArrayList<Player> players) {
		Players = players;
	}
    

    
    
	}
    

