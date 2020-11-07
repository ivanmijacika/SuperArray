public class SuperArray{

    private String[] data;
    private int size;

    public SuperArray(){
	data = new String[10];
	size = 0;
    }

    public SuperArray(int InitialCapacity){
	data = new String[InitialCapacity];
	size = 0;
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
	return size==0;
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
	size = 0;
    }

    public void add(int index, String element){
	if (size==data.length) resize();
	for (int i=size-1; i>=index; i--){
	    data[i+1] = data[i];
	}
	data[index] = element;
	size++;
    }

    public String remove(int index){
	String e = data[index];
	for (int i=index+1; i<size; i++){
	    data[i-1]=data[i];
	}
	size--;
	return e;
    }

    public int indexOf(String s){
	for (int i=0; i<size; i++){
	    if (data[i].equals(s)) return i;
	}
	return -1;
    }

    public String[] toArray(){
	String[] arr = new String[size];
	for (int i=0; i<size; i++){
	    arr[i] = data[i];
	}
	return arr;
    }

    public int lastIndexOf(String value){
	for (int i=size-1; i>=0; i--){
	    if (data[i].equals(value)) return i;
	}
	return -1;
    }

//    public boolean equals(SuperArray other){
	
  //  }

}
