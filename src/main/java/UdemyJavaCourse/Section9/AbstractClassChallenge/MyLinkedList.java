package UdemyJavaCourse.Section9.AbstractClassChallenge;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            System.out.println("List was empty");
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                //newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setToNext(newItem).setToPrevious(currentItem);
                    return true;

                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setToNext(newItem);
                    newItem.setToPrevious(currentItem.previous());
                    newItem.setToNext(currentItem).setToPrevious(newItem);

                } else {
                    // the node with a previous is the root
                    newItem.setToNext(this.root);
                    this.root.setToPrevious(newItem);
                    this.root = newItem;

                }
                return true;
            } else {
                //equal
                System.out.println(newItem.getValue() + "already exists in the list");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item: " + item.getValue());

        } else {
            return false;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                //found item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setToNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setToPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {//comparison > 0
                //We are at an item greater than the one to be deleted
                //so the item is not in the list
                System.out.println("Item " + item.getValue() + " is not in the list");
                return false;

            }
        }

        //We have reached the end of the list
        //We didn't find anything

        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("This list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
