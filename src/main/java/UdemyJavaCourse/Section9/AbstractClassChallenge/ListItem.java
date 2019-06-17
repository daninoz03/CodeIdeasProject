package UdemyJavaCourse.Section9.AbstractClassChallenge;

public abstract class ListItem {

    ListItem rightLink;
    ListItem leftLink;

    private Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    public abstract ListItem next();
    public abstract ListItem setToNext(ListItem item);

    public abstract ListItem previous();
    public abstract ListItem setToPrevious(ListItem item);


    public abstract int compareTo(ListItem item);


    public ListItem getRightLink() {
        return rightLink;
    }

    public void setRightLink(ListItem rightLink) {
        this.rightLink = rightLink;
    }

    public ListItem getLeftLink() {
        return leftLink;
    }

    public void setLeftLink(ListItem leftLink) {
        this.leftLink = leftLink;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
