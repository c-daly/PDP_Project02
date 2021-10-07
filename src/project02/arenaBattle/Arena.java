package project02.arenaBattle;

/**
 * The arena class is the connecting glue between players and battles.
 * It also provides the service contract for external clients.
 */
public class Arena {

  private Player player1;
  private Player player2;
  private GearBag bag;

  public Arena(Player player1, Player player2) {
    this.bag = new GearBag();
    this.player1 = player1;
    this.player2 = player2;
  }

  public void initializeBattle() {

  }

  public void equipPlayersFromBag() {

  }

  public void beginBattle() {

  }

  public String getBattleReport() {
    return "";
  }
}
