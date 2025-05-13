package com.generics;

import java.math.BigDecimal;

class BoundedPair<K extends Number,V extends CharSequence> implements PairInterface<K,V> {

        private K key;
        private V value;

        public BoundedPair (K key,V value)
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
            PairInterface<BigDecimal,StringBuilder> pairInterface =null;
            pairInterface =  new BoundedPair<>(new BigDecimal("0.03"),new StringBuilder("one"));
            pairInterface =  new BoundedPair<>(new BigDecimal("0.04"),new StringBuilder("two") );
            //pair.getKey();

            System.out.println( pairInterface.getKey());
            System.out.println( pairInterface.getValue());

        }
}
