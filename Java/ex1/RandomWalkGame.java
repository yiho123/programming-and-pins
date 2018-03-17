public class RandomWalkGame {

  private int length;
  private int playerPos;

  public RandomWalkGame(int length1){

length = length1;
playerPos = 1;

}



  // This method prints out the dot map showing
  // the current location of the player
  // It does not print out how many units the player moves
  // YOU SHOULD NOT MODIFY THIS METHOD EXCEPT PUTTING THE
  // APPROPRIATE VISIBILITY MODIFIER
  public void printMap() {

    for (int i = 1; i < playerPos; i++)
      System.out.print(".");

    System.out.print('P');

    for (int i = playerPos+1; i <= length; i++)
      System.out.print(".");
  }

  public void play() {
  int count = 0;
  RandomWalkDie Die = new RandomWalkDie(3);
  while (playerPos != length){
  printMap();
   int y = Die.roll();
   int x = (int)Math.pow(playerPos + y - length,2);
   playerPos = length - (int)Math.sqrt(x);
   System.out.println("\t[Player moves " + y + " unit(s)]");
   count ++;

}
System.out.println("The game ends after " + count + " rounds.");



  }
}
