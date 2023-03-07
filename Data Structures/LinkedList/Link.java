package LinkedList;
public class Link{
    private int destinationNo; // unique
    private String description;
    private String photo;
    public Link next;
    
    public Link(int destinationNo, String description, String photo){
        this.destinationNo = destinationNo;
        this.description = description;
        this.photo = photo;
        next = null;
    }

    public int getDestinationNo() {
        return destinationNo;
    }

    public String getDescription() {
        return description;
    }

    public String getPhoto() {
        return photo;
    }

    public Link getNext() {
        return next;
    }
}
