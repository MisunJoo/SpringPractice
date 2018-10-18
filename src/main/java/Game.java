import java.util.List;

public class Game {
    List<Player> playersList;

    public Game(){
        System.out.println("Game 객체가 생성되었습니다.");
    }

    public void setPlayerList(List<Player> playerList) {
        this.playersList = playerList;
    }

    public void play(){
        System.out.println("게임이 시작됩니다.");
        for(Player player : playersList)
            player.play();

    }

}
