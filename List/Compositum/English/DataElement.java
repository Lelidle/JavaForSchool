package List.Compositum.English;

/**
 * Abstract class that defines the necessary behaviour of a data element
 * for the list. presentation() presents details on the console for 
 * the given dataelement. isGreater() defines a method for comparison.
 */
public abstract class DataElement {
    
    public abstract void presentation();
    public abstract boolean isGreater(DataElement data);
}
