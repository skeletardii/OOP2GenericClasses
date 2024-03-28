import java.util.ArrayList;

public class MyMap <K, V>{
    private ArrayList<K> keys;
    private ArrayList<V> vals;
    public MyMap(){
        keys = new ArrayList<>();
        vals = new ArrayList<>();
    }
    public void put(K key, V val){
        if(keys.contains(key)){
            vals.set(keys.indexOf(key),val);
            return;
        }
        keys.add(key);
        vals.add(val);
    }

    public V get(K key){
        if(!keys.contains(key))
            return null;
        return vals.get(keys.indexOf(key));
    }
    public V remove(K key){
        if(!keys.contains(key))
            return null;
        int index = keys.indexOf(key);
        V removed = vals.get(index);
        keys.remove(index);
        vals.remove(index);
        return removed;
    }

    public void print(){
        System.out.print("{ ");
        for(int i=0; i<keys.size(); i++){
            System.out.print(keys.get(i) + "->" + vals.get(i));
            if( i != keys.size()-1)
                System.out.print(" , ");
        }
        System.out.print(" } \n");
    }
}
