package za.ac.cput.projects;

public class Son extends Father {

    private String name;
    //private String srname;


    public Son(String com,String sName, int h,String name)
    {
       super(com,sName,h);
       this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getSurname()
    {
        return super.getSurName();
    }

    public String toString()
    {
        return name+"\n"+super.getSurName()+"\nComplexion :"+super.getComplexion();
    }
}
