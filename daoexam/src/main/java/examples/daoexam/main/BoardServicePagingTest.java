package examples.daoexam.main;

import examples.daoexam.config.ApplicationConfig;
import examples.daoexam.dto.Board;
import examples.daoexam.service.BoardService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardServicePagingTest {
    public static void main(String[] args) {
        ApplicationContext ac =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        BoardService boardService = ac.getBean(BoardService.class);
        List<Board> board = boardService.getBoards(2,4);

        for(Board printBoard : board)
            System.out.println(printBoard);

    }
}
