package org.lanqiao.dxzf.util;

public class TestMyHashMap {
    public static void main(String[] args){
        MyHashMap<Integer,Integer> myHashMap = new MyHashMap<>();
        myHashMap.put(11,500);
        myHashMap.put(12,644);
        myHashMap.put(1,55);

        System.out.println(myHashMap.get(11));
        System.out.println(myHashMap.get(12));
        System.out.println(myHashMap.get(1));
    }
}
