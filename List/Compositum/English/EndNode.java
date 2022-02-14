package List.Compositum.English;

public class EndNode extends Node {

    @Override
    public void setNext(Node node) {
        System.out.println("This is an end, it has no successor");
    }

    @Override
    public Node getNext() {
        System.out.println("This is an end, it has no successor");
        return null;
    }

    @Override
    public Node appendBack(DataElement data) {
        return new DataNode(this, data);
    }

    @Override
    public void appendSorted(DataElement data) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public DataElement getData() {
        System.out.println("This is an end, it has no data");
        return null;
    }

    @Override
    public void printList() {
        return;    
    }

    @Override
    public int searchItemPosition(DataElement data, int counter) {
        return -1;
    }

    @Override
    public DataElement getItemAtPosition(int position, int counter) {
        return null;
    }

    @Override
    public boolean contains(DataElement data) {
        return false;
    }

    @Override
    public int length(int counter) {
        return 0;
    }

    @Override
    public void remove(DataElement data) {}
    
}
