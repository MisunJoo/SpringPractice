package soundsystem.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

//    public BookService(BookDao bookDao){
//        this.bookDao = bookDao;
//        System.out.println("BookService()");
//    }

    public void service(){
        bookDao.crud();
    }
}
