import java.util.NoSuchElementException;

public class Queue 
{
    //private ArrayList<Object> listQueue = new ArrayList<Object>();
    private int nElements = 1000000;
    private Object[] listQueue = new Object[nElements]; 
    private int items = 0;
    private int initial = 0;
    
    public boolean add(Object o) {
    	/*listQueue.add(o);*/
    	if(items < nElements){
        	listQueue[initial + items] = o;
        	items++;  		
    	}else{
    		Object[] newList = new Object[nElements*2];
    		System.arraycopy(listQueue, initial, newList, 0, initial+items);
    		nElements = nElements*2;
    	    Object[] listQueue = new Object[nElements]; 
    	    listQueue = newList;
        	listQueue[initial + items] = o;
        	items++;  		
    	}
    	return true;  
    }
    
    public Object remove() {
    	if(items == 0){
    		throw new NoSuchElementException();    		
    	}
    	Object o = listQueue[initial];
    	initial++;
    	items--;
    	/*if(listQueue.isEmpty())
    		throw new NoSuchElementException();
    	Object o = listQueue.remove(0);*/
    	return o;
    }
    
    public Object element() {
    	/*if(listQueue.isEmpty())*//*
			throw new NoSuchElementException();*/
    	/*Object o = listQueue.get(0);*/
    	if(items == 0)
    		throw new NoSuchElementException();
    	Object o = listQueue[initial];
    	return o;
    }
}
