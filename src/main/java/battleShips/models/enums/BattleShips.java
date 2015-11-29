package battleShips.models.enums;

public enum BattleShips {
	CARRIER(5),
	BATTLESHIP(4),
	CRUISER(3), 
	SUBMARINE(3),
	DESTROYER(2);

	private int size;
	
	BattleShips(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}
}