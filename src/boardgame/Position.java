package boardgame;

public class Position {

	private int row;
	private int column;
	
	public Position(int row, int position) {
		this.row = row;
		this.column = position;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getPosition() {
		return column;
	}

	public void setPosition(int position) {
		this.column = position;
	}

	@Override
	public String toString() {
		return  row + ", " + column;
	}
	
	
	
}
