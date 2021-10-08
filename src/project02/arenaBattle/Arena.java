package project02.arenaBattle;

/**
 * The arena class is the connecting glue between players and battles.
 * It also provides the service contract for external clients.
 */
public class Arena {
  private String battleReport = "You must complete a battle before a report is available.\r\n";

  public void admitPlayers(Player player1, Player player2) {
    runBattleSimulation(player1, player2);
  }

  private void runBattleSimulation(Player player1, Player player2) {
    battleReport = "This is a battle report issued after a battle was fought";
  }

  public String getBattleReport() {
    return battleReport;
  }
}
