import java.util.Arrays;

public class SuperArray{

    private String[] data;
    private int size;

    public SuperArray(){
	data = new String[10];
	size = 0;
    }

    public SuperArray(int InitialCapacity){
	data = new String[InitialCapacity];
    }

    public int size(){
	return size;
    }

    public boolean add(String element){
	if (size==data.length) resize();
	data[size] = element;
	size ++;
	return true;
    }

    public String get(int index){
	return data[index];
    }

    public String set(int index, String element){
	String e = data[index];
	data[index] = element;
	return e;
    }

    private void resize(){
	String[] resized = new String[data.length*2];
	for (int i=0; i<data.length; i++){
	    resized[i] = data[i];
	}
	data = resized;
    }

    public boolean isEmpty(){
	return size()==0;
    }

    public String toString(){
	String s = "[";
	for (int i=0; i<size; i++){
	    if (i!=size-1) s+=String.valueOf(data[i])+", ";
	    else s+=String.valueOf(data[i]);
	}
	return s+"]";
    }

    public boolean contains(String s){
	for (int i=0; i<size; i++){
	    if (data[i].equals(s)) return true;
	}
	return false;
    }

    public void clear(){
	String[] a = new String[data.length];
	data = a;
    }

    public void add(int index, String element){
	if (size==data.length) resize();
	String[] added = new String[data.length];
	added[index] = element;
	for(int i=0; i<size; i++){
	    if (i>=index) added[i+1]=data[i];
	    else added[i]=data[i];
	}
	data = added;
    }

    //public String remove(int index){
    //}

    //public int indexOf(){
    //}

    //public String[] to Array(){
    //}

}

