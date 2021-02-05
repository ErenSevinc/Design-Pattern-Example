package templateDesgingPattern;

public abstract class VideoGame {
	
	public abstract void initialize();
	public abstract void startGame();
	public abstract void endGame();
	
	public final void play() {
		initialize();
		startGame();
		endGame();
	}

}
