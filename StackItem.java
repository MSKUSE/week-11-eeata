public class StackItem {
    private Object item ="NULL";
    private StackItem next ;

    public StackItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        if(item ==null);

        return item;
    }

    public StackItem(StackItem next, Object item) {
        this.next = next;
        this.item = item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }


}
