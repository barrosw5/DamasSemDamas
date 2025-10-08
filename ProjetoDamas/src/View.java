import pt.iscte.guitoo.Color;
import pt.iscte.guitoo.StandardColor;
import pt.iscte.guitoo.board.Board;

public class View {
	Board board;

	View() {
		board = new Board("...", 6, 6, 40);
	}

	void start() {
		board.open();
	}

	public static void main(String[] args) {
		View gui = new View();
		gui.start();
	}
}