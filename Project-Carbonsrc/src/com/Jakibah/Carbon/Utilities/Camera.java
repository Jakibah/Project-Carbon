package com.Jakibah.Carbon.Utilities;

import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.GL11;
import com.Jakibah.Carbon.Data.Player;


public class Camera {
	private static Player target;
	private static float x, y;
	
	
	public Camera(Player target, float x, float y){
		Camera.target = target;
		Camera.x = x;
		Camera.y = y;
	}
	public void update(){
		Camera.setX(target.getX());
		Camera.setY(target.getY());
		
		GL11.glTranslatef(-x + Display.getWidth() / 2, -y + Display.getHeight() / 2, 0.0f);
	}


	public static Player getTarget() {
		return target;
	}


	public static void setTarget(Player target) {
		Camera.target = target;
	}


	public static float getX() {
		return x;
	}


	public static void setX(float f) {
		Camera.x = f;
	}


	public static float getY() {
		return y;
	}


	public static void setY(float f) {
		Camera.y = f;
	}


	

}
