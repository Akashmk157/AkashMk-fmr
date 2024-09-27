import java.util.Scanner;

class Game{
    public String name;
    public int maxNumPlayers;

    public Game(String name, int maxNumPlayers){
        this.name = name;
        this.maxNumPlayers = maxNumPlayers;
    }

    @Override
    public String toString(){
        return "Maximum num of players for "+name + " is " + maxNumPlayers;
    }

    public int getMaxNumPlayers() {
        return maxNumPlayers;
    }
    public void setMaxNumPlayers(int maxNumPlayers) {
        this.maxNumPlayers = maxNumPlayers;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class GameWithTimeLimit extends Game{
    public int timeLimit;
    public GameWithTimeLimit(String name, int maxNumPlayers, int timeLimit){
        super(name, maxNumPlayers);
        this.timeLimit = timeLimit;
    }

    public int getTimeLimit() {
        return timeLimit;
    }
    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString(){
        return super.toString()+"\nTime limit for "+getName()+" is "+getTimeLimit()+" minutes";
    }

}
public class GameInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a game: ");
        String gameName = sc.next();
        System.out.println("Enter max number of players: ");
        int maxNumPlayers = sc.nextInt();
        Game game = new Game(gameName, maxNumPlayers);

        System.out.println("Enter a game that has time limit: ");
        String gamename2 = sc.next();
        System.out.println("Enter max number of players: ");
        int maxNumPlayers2 = sc.nextInt();
        System.out.println("Enter the time limit in minutes: ");
        int timeLimit = sc.nextInt();
        GameWithTimeLimit game2 = new GameWithTimeLimit(gamename2, maxNumPlayers2, timeLimit);

        System.out.println(game.toString());
        System.out.println(game2.toString());

    }
}
