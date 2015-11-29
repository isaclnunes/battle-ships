package battleShips;

import static org.junit.Assert.*;

import org.junit.Test;

import battleShips.models.enums.BattleShips;

public class TestBattleShipsName {

	@Test
	public void testGetSize() {
		assertTrue(BattleShips.CARRIER.getSize() == 5);
		assertTrue(BattleShips.BATTLESHIP.getSize() == 4);
		assertTrue(BattleShips.CRUISER.getSize() == 3);
		assertTrue(BattleShips.SUBMARINE.getSize() == 3);
		assertTrue(BattleShips.DESTROYER.getSize() == 2);
	}

}

