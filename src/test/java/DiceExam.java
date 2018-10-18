import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiceExam {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("diceplayer.xml");
        Game game = applicationContext.getBean(Game.class);
        game.play();
    }
}
