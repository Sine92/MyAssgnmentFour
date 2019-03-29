package GoodOpenClosed;

public class Pastor {
    private Bible bible;

   public Pastor(Bible bible)
   {
    this.bible = bible;
   }
   public String getScriptures()
   {
       return this.bible.getScrip();
   }
}
