package hashing;
import java.util.Arrays;
import java.util.List;

public class ArrayHashTable extends HashTable {
    
    private int chainSize = 5;
    private int capacity = 10;
    private Object [][] table = new Object [size][size];
    final private int [] counts = new int [10];
    

    public ArrayHashTable(Object [][] table) {
            this.table = table;
            this.table = new Object [capacity] [capacity];
    }

    @Override
    boolean add(Object obj) {
        if (contains(x) != null) return false;
        if (capacity+1 > table.length) resize();
        table[hash(x)].add(x);
        n++;
        
    }
    
    @Override
    boolean contains(Object obj) {
        
    }
    
    @Override
    boolean remove(Object obj) {
        
    }

    public static void main(String[] args) {
        
        
    }
    
}
