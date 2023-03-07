package LinkedList;

public class LinkList {
    private Link first;

    public LinkList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    } //return first

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int no, String d, String p) {
        Link travel = new Link(no, d, p);
        travel.next = first;
        first = travel;
    }

    
    public void insertLast(int no, String d, String p) {
      Link travel = new Link(no, d, p);
       if(isEmpty()){
           first = travel;
       }else{
           Link c = first;
           while(c.next != null){
               c= c.next;
           }
           c.next = travel;
       }
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.next;
        return temp;
    }

    public boolean insertBefore(int key, int no, String d, String p) {
          Link current = first;
        Link previous = current;
         Link l= new Link(no,d,p);;
        while (current != null) {
            if (current.getDestinationNo() == key) {
                if (current == first) {
                    insertFirst(no,d,p);

                } else {
                    l.next = current;
                    previous.next = l;
                   
                }
                return true;
            } else {
                previous = current;
                current = current.next;
            }

        }
        return false;
    }
//Key is the destination number of the existing destination

    public Link find(int no) {
        Link current = first;
        while (current != null) {
            if (current.getDestinationNo() == no) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link delete(int no) {
        Link current = first;
        Link previous = current;
        while(current != null){
            if(current.getDestinationNo() == no){
                if(current == first){
                    first = first.next;
                }else{
                    previous.next = current.next;
                }
                return current;
            }else{
                previous= current;
                current = current.next;
            }
        }
        return null;
    }
}
