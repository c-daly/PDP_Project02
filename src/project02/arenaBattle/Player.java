package project02.arenaBattle;

import project02.arenaBattle.enumsAndConstants.*;
import project02.arenaBattle.interfaces.IGear;

import java.util.Arrays;
import java.util.Hashtable;

/**
 * Class responsible for handling player actions/state during
 * an arena battle simulation.
 */
public class Player {
  private Hashtable<WearLocation, IGear> equippedGear;
  private final Hashtable<PlayerAbility, Integer> abilityScores;

  /**
   * Creates a new player with initialized properties.
   */
  public Player() {
    equippedGear = new Hashtable<WearLocation, IGear>();
    abilityScores = new Hashtable<PlayerAbility, Integer>();
    rollAbilities();
  }

  public int getAttackDamage() {
    return 0;
  }

  public int getAvoidance() {
    return 0;
  }

  private void rollAbilities() {
    for (PlayerAbility ability : PlayerAbility.values()) {
      abilityScores.put(ability, rollOneAbilityScore());
    }
  }

  private int rollOneAbilityScore() throws IllegalStateException {
    int numDiceRolled = 4;
    int numDiceToKeep = 3;
    int dropValuesBelow = 2;
    int[] rollResults = new int[numDiceRolled];


    int x = 0;
    while (x <= numDiceRolled) {
      int rollResult = getRandomNumber(1,6);
      if (rollResult >= dropValuesBelow) {
        rollResults[x] = rollResult;
        x++;
      }
    }
    Arrays.sort(rollResults);

    int tempScore = 0;

    for (int y = 0; x <= numDiceRolled; x ++) {
      tempScore += rollResults[y];
      x += 1;
      if (y >= numDiceToKeep) {
        return tempScore;
      }
    }
    throw new IllegalStateException("rolLOneAbilityScore: numDiceRolled appears to be less than numDiceToKeep");
  }

  private int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }
}
