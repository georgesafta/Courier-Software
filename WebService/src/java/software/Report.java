package software;

public class Report 
{
    private int number;
    private String date;
    private String cause;

    public Report(int number, String date, String cause) 
    {
        this.number = number;
        this.date = date;
        this.cause = cause;
    }

    public int getNumber() 
    {
        return number;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getCause() 
    {
        return cause;
    }

    public void setCause(String cause) 
    {
        this.cause = cause;
    }

    @Override
    public String toString() 
    {
        return "Report{" + "number=" + number + ", date=" + date + ", cause=" + cause + '}';
    }
    
}
