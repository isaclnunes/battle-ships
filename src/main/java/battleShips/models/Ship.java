package battleShips.models;

import java.util.List;

import com.google.common.collect.Lists;

import battleShips.models.enums.BattleShips;

public class Ship {
	
	private final List<BattleShips> fleet = Lists.newArrayList(BattleShips.values());

}
