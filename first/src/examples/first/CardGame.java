package examples.first;

import java.util.List;

public class CardGame {
    public static void main(String[] args){
        List<Card> cards = CardFactory.create();
        for(Card card: cards){
            System.out.println(card);
        }
//        List<카드> 카드묶음 = 카드공장.create();
//
//        딜러 d = new 딜러(이름);
//        d.set카드(카드묶음);
//
//        List<Player> playerList = new ArrayList<Player>();
//        playerList.add(new Player("홍길동"));
//        playerList.add(new Player("고길동"));
//        playerList.add(new Player("강길동"));
//
//        d.setPlayers(plyaerList);
//
//        d.newGame();
//        d.카드를섞는다.();
//        for(int i = 0; i < 5; i++){
//            for(Player player : playerList){
//                player.addCard(d.getCard());
//            }
//        }
//        // 3번 호출
//        d.본다(player.getName, player.getCards());
//        d.판정();
    }
}
