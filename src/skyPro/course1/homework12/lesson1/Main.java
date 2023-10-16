package skyPro.course1.homework12.lesson1;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Smith", "Jordan");
        Author author2 = new Author("Egor", "Pellsov");

        Book book1 = new Book("Book 1", author1, 1996);
        Book book2 = new Book("Book 2", author2, 1998);

        System.out.println(book1.getTitle() + " " + book1.getAuthor().getName() + " " + author1.getSurname() +
                " " + book1.getYear());
        System.out.println(book2.getTitle() + " " + book2.getAuthor().getName() + " " + author2.getSurname() +
                " " + book2.getYear());

        book1.setYear(2000);
        System.out.println(book1.getYear());
    }
}