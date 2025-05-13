package com.generics;

 class OrderedPair<K,V> implements PairInterface<K,V> {

    private K key;
    private V value;

    public OrderedPair (K key,V value)
    {
        this.key = key;
        this.value = value;
    }



    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    public static void main(String[] args)
    {
        PairInterface<String,Integer> pairInterface =null;
        pairInterface =  new OrderedPair<>("One",1);
        pairInterface =  new  OrderedPair<>("two",2);
        //pair.getKey();

        System.out.println( pairInterface.getKey());
        System.out.println( pairInterface.getValue());

    }

}
