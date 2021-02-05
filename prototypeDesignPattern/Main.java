package prototypeDesignPattern;

public class Main {

	public static void main(String[] args) {
		ColorCache.loadCache();
		/*
		Color black = ColorCache.getColor("black");
		black.addColor();
		*/
		ColorCache.getColor("black").addColor();
		ColorCache.getColor("blue").addColor();
	}

}
