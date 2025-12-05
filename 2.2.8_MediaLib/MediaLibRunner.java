/*************************************
 * Sample solution for Activity 2.2.7
 * for the It's Your Turn section
 **************************************/
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();

    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    myLib.addBook(myBook);
    Movie myMovie1 = new Movie("Young Frankenstein", 1.75);
    myLib.addMovie(myMovie1);
    Song mySong1 = new Song("Passion Fruit", 10, "Drake");
    myLib.addSong(mySong1);

    System.out.println("Library:\n" + myLib);

    // test the equals methods
    Movie myMovie2 = new Movie("Young Frankenstein", 1.75);
    System.out.println("Movies are the same: " + myMovie1.equals(myMovie2)); //Expect 'true'
    myMovie2.setTitle("Frankenstein");
    System.out.println("Movies are the same: " + myMovie1.equals(myMovie2)); //Expect 'false'

    Song mySong2 = new Song("Passion Fruit", 10, "Drake");
    System.out.println("Songs are the same: " + mySong1.equals(mySong2)); //Sould be ture
    mySong1.setTitle("Teenage Fever");
    System.out.println("Songs are the same: " + mySong1.equals(mySong2)); //Sould be false
    System.out.println(mySong1.toString());
  }
}