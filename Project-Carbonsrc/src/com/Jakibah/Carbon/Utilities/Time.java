package com.Jakibah.Carbon.Utilities;

import org.lwjgl.Sys;

public class Time {

	private static boolean paused = false;
	public static long lastframe, totaltime;
	public static float d = 0, multiplier = 1;

	public static long getTime() {
		return Sys.getTime() * 1000 / Sys.getTimerResolution();

	}

	public static float getDelta() {
		long currenttime = getTime();
		int delta = (int) (currenttime - lastframe);
		lastframe = getTime();
		if(delta * 0.001f > 0.05f)
			return 0.05f;
		return delta * 0.001f;
	}

	public static float Delta() {
		if (paused)
			return 0;
		else
			
			return d * multiplier;
	}

	public static float Totaltime() {
		return totaltime;

	}

	public static float Multiplier() {
		return multiplier;
	}

	public static void update() {
		d = getDelta();
		totaltime += d;
	}

	public static void changemultiplier(float change) {
		if (multiplier + change < -1 && multiplier + change > 7) {

		} else {
			multiplier += change;
		}
	}

	public static void pause() {
		if (paused)
			paused = false;
		else
			
			paused = true;
	}

}

