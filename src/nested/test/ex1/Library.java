package nested.test.ex1;

public class Library {

    Book[] books;
    private int count;
    public Library(int n) {
       books = new Book[n];
       count = 0;
    }

    private static class Book{
        private String title;
        private String author;

      Book(String title,String author){
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {

        if (count >= books.length){
            System.out.println("저장공간 부족해!");
            return;
        }
        books[count++] = new Book(title,author);
    }

    public void showBook() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].title + " - " + books[i].author);
        }
    }
}
