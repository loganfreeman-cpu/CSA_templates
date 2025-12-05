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
  private Song song;

  public void addBook(Book b)
  {
    book = b;
  }
  
  public void addMovie(Movie m)
  {
    movie = m;
  }
  public void addSong(Song s)
  {
    song = s;
  }

  public String toString() 
  {
    String info = "";

    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
    if (book != null)
      info += "Song: " + song + "\n";
 
    return info;
  }
}