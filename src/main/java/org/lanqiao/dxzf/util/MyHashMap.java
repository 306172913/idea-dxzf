package org.lanqiao.dxzf.util;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V>{
    private org.lanqiao.dxzf.util.Entry[] table;//Entry数组表
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int size;

    public MyHashMap() {
        table = new org.lanqiao.dxzf.util.Entry[DEFAULT_INITIAL_CAPACITY];
        size = DEFAULT_INITIAL_CAPACITY;
    }

    //数组的长度
    public int size() {
        return size;
    }
    //求index
    static int indexFor(int h,int length){
        return h % (length - 1);
    }
    //获取元素
    public V get(Object key){
        if(key == null) return null;
        int hash = key.hashCode();//key的哈希值
        int index = indexFor(hash,table.length);//求key在数组中的下标
        for(Entry<K,V> e = table[index];e!=null;e = e.next){
            Object k = e.key;
            if(e.key.hashCode() == hash &&(k == key || key.equals(k)))
                return e.value;
        }
        return null;
    }
    //添加元素
    public V put(K key,V value){
        if (key == null) return null;
        int hash = key.hashCode();
        int index = indexFor(hash,table.length);

        //如果key已经存在只需要修改value值即可
        for (Entry<K,V> e = table[index];e != null; e = e.next){
            Object k = e.key;
            if(e.key.hashCode() == hash && (k == key || key.equals(k))){
                V oldValue = e.value;
                e.value = value;
                return oldValue;
            }
        }
        //如果key不存在那么需要添加
        Entry<K,V> e = table[index];
        table[index] = new Entry<K,V>(key,value,e);//新建一个Entry并指向原先的e
        return null;
    }
}
