/**
 * Write a description of class Service here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Service
{ 
    private String title;
    private int price;

    public Service(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle(){
        return title;
    }

    public int getPrice(){
        return price;
    }
}