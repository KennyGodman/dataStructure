package dataStructure;

public class Stack extends Vector{
    private  String [] stack = new String[4];
    private boolean isEmpty = true;
    private int count;
    public void push(String item){
        isEmpty = false;
        stack[count] = item;
        count++;
    }
    public String pop(){
        count--;
        return stack[stack.length - 1];
    }
    @Override
    public boolean isEmpty(){
        return isEmpty;
    }
    @Override
    public String get(int id){
        return stack[id];
    }
    @Override
    public int size(){
        return count;
    }
    @Override
    public void set(int id, String element) {
        stack[id] = element;
    }
    public String peek(){
        return stack[stack.length - 1];
    }
    public int search(String element){
        for(int i = 0; i < stack.length; i++){
            if(stack[i] == element){
                return i + 1;
            }
        }
        return -1;
    }

}

