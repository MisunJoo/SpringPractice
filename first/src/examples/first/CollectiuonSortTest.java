package examples.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectiuonSortTest {
    public static void main(String[] args){
        List<Book> list = new ArrayList<>();
        list.add(new Book("홍길동전", 3000));
        list.add(new Book("즐거운자바", 4000));
        list.add(new Book("jsp", 2000));

        Collections.sort(list);

        for(Book book : list){
            System.out.println(book.getTitle() + ", " + book.getPrice());
        }

    }
}

class Book implements Comparable<Book>{
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        // Book type의 클래스가 가지는 메소드 안에서
        // 파라미터로 들어온 Book타입의 필드를 비교할 때는
        // private이어도 사용할 수 있다.
        return price - o.price;
    }
}
