package prototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class ColorCache {
	private static Map<String, Color> colorMap = new HashMap<>();
	/*
	 static{
	 	colorMap.put("blue", new Blue());
		colorMap.put("black", new Black());
	 }
	 */
	public static void loadCache() {
		colorMap.put("blue", new Blue());
		colorMap.put("black", new Black());
	}
	
	public static Color getColor(String colorName) {
		return (Color) colorMap.get(colorName).clone();
	}

}
