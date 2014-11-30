package software;

public class Paper 
{
    private String date;

    public Paper(String date) 
    {
        this.date = date;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    @Override
    public String toString() 
    {
        return "Paper{" + "date=" + date + '}';
    }
    
}
