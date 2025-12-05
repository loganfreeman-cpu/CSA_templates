public class Song {
   private String title;
   private int rating;
   private String artist;

  public Song(String t, int r, String a)
  {
    title = t;
    rating = r;
    artist = a;
  }

  public String getTitle()
    {
     return title;
    }
  public int getRating()
    {
     return rating;
    }
  public String getArtist()
    {
      return artist;
    }
  public boolean equals(Song b)
    {
     if(this.title.equals(b.title) && this.rating == b.rating && this.artist.equals(b.artist))
        {
        return true;
        } 
        return false;
    }
  public String toString() 
    {
     String info = "\"" + title + "\", written by " + artist;
     if (rating != 0) 
       info += ", rating is " + rating;
     return info;
    }
   public void setAuthor(String a) 
    {
    artist = a;
    }
   public void setTitle(String t) 
    {
      title = t;
    }

   public void adjustRating(int r)
    {
    if ((rating + r >= 0) &&  (rating + r <= 10))
        {
        rating += r;
        } 
    }

}
