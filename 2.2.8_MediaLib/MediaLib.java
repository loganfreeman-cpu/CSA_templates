/*************************************
 * Sample solution for Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 * 
 **************************************/
public class MediaLib
{
  private Book book;
  private Movie movie;

  public void addBook(Book b)
  {
    book = b;
  }
  
  public void addMovie(Movie m)
  {
    movie = m;
  }

  public String toString() 
  {
    String info = "";

    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
 
    return info;
  }
}