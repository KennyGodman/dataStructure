package dataStructure;

public class Vector implements List {
    private  boolean isEmpty = true;
    private int count;
    private String [] elements = new String[5];

    @Override
    public void add(String item) {
        isEmpty = false;
        elements[count] = item;
        count++;
    }

    @Override
    public void remove(int id) {
        elements[id]= null;
        count --;

    }

    @Override
    public void remove(String item) {
        for (int i = 0; i < elements.length ; i++) {
            if(elements[i] == item ){
                elements[i] = null;
            }
        }

    }

    @Override
    public String get(int id) {
        return elements[id];
    }

    @Override
    public void add(int id, String item) {
        for (int i = elements.length - 1; i > id ; i--) {
            elements[i] = elements[i - 1];
        }
        elements[id] = item;
        count++;
    }

    @Override
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
            isEmpty = true;

        }

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == item) {
                return true;
            }
        }
        return false;


    }

    public  void set(int id, String item){
        elements[id] = item;
        count++;

    }
}
