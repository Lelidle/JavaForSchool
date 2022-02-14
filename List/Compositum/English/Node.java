package List.Compositum.English;

public abstract class Node {
    public abstract void setNext(Node node);
    public abstract Node getNext();
    public abstract Node appendBack(DataElement data);
    public abstract void appendSorted(DataElement data);
    public abstract DataElement getData();
    public abstract void printList();
    public abstract int searchItemPosition(DataElement data, int counter);
    public abstract DataElement getItemAtPosition(int position, int counter);
    public abstract boolean contains(DataElement data);
    public abstract int length(int counter);
    public abstract void remove(DataElement data);
}
