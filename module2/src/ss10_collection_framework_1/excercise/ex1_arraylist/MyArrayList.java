package ss10_collection_framework_1.excercise.ex1_arraylist;

import java.util.Arrays;

public class MyArrayList<E> {

    private int size =0;
    private static final int DEFAULT_CAPACITY=10;
    Object[] elements;

    public MyArrayList() {
        elements=new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity>=0){
            elements=new Object[capacity];
        }else {
            throw new IllegalArgumentException("Capacity: "+capacity);
        }

    }
    public int size(){
        return this.size;
    }

    /**
     * Phương thức clear ArraysList
     */
    public void clear(){
        size=0;
        for (int i = 0; i < elements.length; i++) {
            elements[i]=null;
        }
    }

    /**
     * Phương thức add 1 phần tử vào arraylist
     * @param element
     * @return
     */
    public boolean add(E element) throws IllegalAccessException {
        if (elements.length==size){
         ensureCapacity(1);
        }
        elements[size]=element;
        size++;
        return true;
    }
    public void add(E element,int index) throws IllegalAccessException {
        if (index>elements.length){
            throw new IllegalAccessException("index: "+index);
        }else if (elements.length==size){
            this.ensureCapacity(5);
        }
        if (elements[index]==null){
            elements[index]=element;
            size++;
        }else {
            for (int i = size+1 ; i >=index ; i--) {
                elements[i]=elements[i-1];
            }
            elements[index]=element;
            size++;
        }
    }

    /**
     * Phuong thức tăng kích thước cho Arrays list
     * @param minCapacity
     */
    public void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity>=0){
            int newSize=this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
        }else{
            throw new IllegalAccessException("min capacity: "+minCapacity);
        }
    }

    /**
     * Phương thức lấy 1 phần tử tại vị trí index
     * @param index
     * @return
     */
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    /**
     * Phương thức kiểm tra 1 phần tử có trong Arraylist hay không
     * @param element
     * @return
     */
    public boolean contains(E element){
        return this.indexOf(element)>=0;
    }

    /**
     * Phương thức tạo ra 1 bản sao của arraylist
     * @return
     */
    public MyArrayList<E> clone(){
        MyArrayList<E> v=new MyArrayList<>();
        v.elements=Arrays.copyOf(this.elements,this.size);
        v.size=this.size;
        return v;
    }
    public E remove(int index) throws IllegalAccessException {
        if (index<0|| index>elements.length){
            throw new IllegalAccessException("Error index: "+ index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size-1; i++) {
            elements[i]=elements[i+1];

        }
        elements[size-1]=null;
        size--;
        return element;
    }

}
