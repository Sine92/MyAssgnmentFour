package za.ac.cput.projects;

import java.util.Objects;

public class Pastor {

    private String scripture;
    private String pastorName;
    private String pastorNumber;



    public String getScripture() {

        if(this.scripture == "Matthew 4:4")
        {
           return "Man Shall not leave by alone but by every word that is from the mouth of God";
        }
        else if(this.scripture == "John 3:16")
        {
            return "For God so loved the world";
        }
        else
        {
            return "No Scripture";
        }

    }

    public String getPastorName() {

        if(this.pastorName == "Sinetemba Kewuti")
        {
            return "Ps S Kewuti";
        }
        else if(this.pastorName == "Sakhumzi Landu")
        {
            return "Prophet S W Landu";
        }
        else if (this.pastorName == "Aviwe Yenge")
        {
            return "Evangelist A Yenge";
        }
        else{
            return "No Pastor name selected";
        }

    }

    public String getPastorNumber() {
        if(this.pastorNumber == "084") {
            return "This is the number of Prophet SW Landu";
        }
        else if(this.pastorNumber == "071")
        {
            return "This is Pastor S Kewuti";
        }
        else if(this.pastorNumber == "064")
        {
            return "This is Evangelist A Yenge";
        }
        else{
            return "No number selected";

        }

    }

public void setScripture(String scripture)
{
    this.scripture = scripture;
}
public void setPastorName(String pastorName)
{
    this.pastorName = pastorName;
}
public void setPastorNumber(String pastorNumber)
{
    this.pastorNumber = pastorNumber;
}

    }


