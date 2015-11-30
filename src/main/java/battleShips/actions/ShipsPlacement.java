package battleShips.actions;

import java.awt.Point;

import battleShips.models.Player;
import battleShips.models.enums.BattleShips;

public class ShipsPlacement {
	
	/**
	 * Place a ship on the player board validating
	 * if it is been placed horizontal and if the 
	 * ship is placed in the limits.
	 * 
	 * @param player - the player that's placing the ship
	 * @param ship - the BattleShips to be placed
	 * @param start - the start {@link Point}
	 * @param end - the end {@link Point}
	 */
	public void placeShip(Player player, BattleShips ship, Point start, Point end){
		if(isValidPlacement(start, end)) {
			
		}
	}

	private boolean isValidPlacement(Point start, Point end) {
		if(start.getX() == end.getX() || start.getY() == end.getY()){
			return true;
		}
		return false;
	}
}