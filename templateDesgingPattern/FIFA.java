package templateDesgingPattern;

public class FIFA extends VideoGame{

	@Override
	public void initialize() {
		System.out.println("Fifa initialized");
	}

	@Override
	public void startGame() {
		System.out.println("Fifa started");
	}

	@Override
	public void endGame() {
		System.out.println("Fifa ended");
	}

}
