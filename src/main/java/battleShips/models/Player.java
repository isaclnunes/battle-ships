package battleShips.models;

import static battleShips.utils.Maps.entriesToMap;
import static battleShips.utils.Maps.entry;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Stream;

import battleShips.models.enums.BattleShips;

public class Player {
	
	private final Map<BattleShips, Boolean> fleet = Collections.unmodifiableMap(Stream.of(
				entry(BattleShips.CARRIER, Boolean.FALSE),
				entry(BattleShips.BATTLESHIP, Boolean.FALSE),
				entry(BattleShips.CARRIER, Boolean.FALSE),
				entry(BattleShips.CARRIER, Boolean.FALSE),
				entry(BattleShips.CARRIER, Boolean.FALSE))
			.collect(entriesToMap())
			);
	
	private final Board myBoard = new Board();
	private final Board attack = new Board();
	
	public Board getMyBoard() {
		return myBoard;
	}
	
	public Board getAttack() {
		return attack;
	}

	public Map<BattleShips, Boolean> getFleet() {
		return fleet;
	}	
}	