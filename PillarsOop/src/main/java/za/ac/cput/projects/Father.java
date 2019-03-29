package za.ac.cput.projects;

public class Father {

    private String surName;
    private String complexion;
    private int height;

    public Father(String comp,String sn,int h)
    {
     this.complexion = comp;
     this.surName = sn;
     this.height = h;
    }

    public String getSurName() {
        return surName;
    }

    public String getComplexion()

    {

        return complexion;
    }

    public int getHeight() {
        return height;
    }
    public String toString()
    {
      return "\n"+height+"\n"+complexion+"\n"+surName;
    }

}
