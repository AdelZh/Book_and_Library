import java.util.Arrays;

public class Library {

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String updateInfo(String name, int newQuantity) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(name)) {
                books[i].setQuantity(newQuantity);
            }
        }
        return "Updated";
    }

    public String searchByName(String name) {
        for (Book bb : books) {
            if (bb.getName().equals(name)) {
                System.out.println(bb);
            }
        }
        return "Founded";

    }


    public String addNewBook(Book book) {


        Book[] arr = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
           arr[i]=books[i];
        }
        arr[books.length] = book;
        books = Arrays.copyOf(arr, arr.length);

        return "Added";
    }
    public String removeBook(String name){
        int toRemove=-1;
        for(int i=0; i<books.length; i++){
            if(books[i].getName().equals(name)){
                toRemove=i;

            }
        }
        if (toRemove != -1){
            Book [] arr1=new Book[books.length-1];
            int j=0;

            for(int i=0; i<books.length-1; i++){
                if(i != toRemove){
                    arr1[i]=books[i];

                    j++;
                    if(books[i]!=null){
                        System.out.println(books[i]);
                    }



                }
            }
            books=arr1;


        }
       return "Which book was removed?: "+books.length+" "+"book was removed";


    }

    public void getMeAllBooks(){
        for(int i=0; i<books.length; i++){
            System.out.println(books[i]);
        }


    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
