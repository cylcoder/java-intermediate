package nested.test.ex1;

public class Library {

    private final Book[] books;
    private int bookCount;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(String title, String author) {
        // 검증 로직을 다 처리하고
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        // 정상 로직을 처리
        books[bookCount++] = new Book(title, author);

        // 어떤 부분이 정상 로직인지 예외 로직인지 헷갈리고 depth가 증가함
        // 예외 처리를 전부 한 뒤에 정상 로직이 실행되도록 하는 것을 추천
        /*if (bookCount < books.length) {
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }*/
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목: " + books[i].title + ", 저자: "+ books[i].author);
        }
    }

    private static class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

}
