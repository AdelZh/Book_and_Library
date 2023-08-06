// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        Book book=new Book("Becoming", 23, "Obama");
        Book book1=new Book("Rich dad", 78, "Robert");
        Book book2=new Book("Poor dad", 67, "Michell");
        Book book3=new Book("Nature", 34, "Adel");

        Book[] books={book, book1, book2};

        Library library=new Library(books);

        System.out.println(library.updateInfo("Rich dad", 8));
        library.getMeAllBooks();
        System.out.println("-------------------------------");

        System.out.println(library.searchByName("Becoming"));
        System.out.println("--------------------------------");

        System.out.println(library.addNewBook(book3));
        library.getMeAllBooks();
        System.out.println("---------------------------");


        System.out.println(library.removeBook("Poor dad"));

    }
}