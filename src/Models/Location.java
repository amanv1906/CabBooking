package CabBooking.src.Models;

public class Location {
    private int x;
    private int y;
    public Location(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int get_x()
    {
        return x;
    }
    public int get_y()
    {
        return y;
    }
    public void set_x(int x)
    {
        this.x = x;
    }
    public void set_y(int y)
    {
        this.y = y;
    }
    
}
