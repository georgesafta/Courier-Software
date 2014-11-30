package software;

public class Route 
{
    private String content;

    public Route(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }

    @Override
    public String toString() 
    {
        return "Route{" + "content=" + content + '}';
    }
    
}
