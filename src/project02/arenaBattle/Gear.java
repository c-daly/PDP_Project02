package project02.arenaBattle;

import project02.arenaBattle.enumsAndConstants.GearType;
import project02.arenaBattle.enumsAndConstants.PlayerAbility;
import project02.arenaBattle.enumsAndConstants.WearLocation;
import project02.arenaBattle.interfaces.*;

/**
 * This class represents a single piece of player gear.
 */
public class Gear implements IGear {
  GearType type;
  WearLocation location;
  PlayerAbility affectedAbility;
  int bonus;

  /**
   * Constructs the item with the appropriate parameters.
   *
   * @param type the GearType associated with the item
   * @param location the WearLocation associated with the item
   * @param affectedAbility the player ability this item modifies
   * @param bonus the amount by which this item modifies a player ability
   */
  public Gear(GearType type, WearLocation location, PlayerAbility affectedAbility, int bonus)
  {
    this.type = type;
    this.location = location;
    this.affectedAbility = affectedAbility;
    this.bonus = bonus;
  }
}

