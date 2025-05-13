package com.Threads;

public class Adder {
    int start;
    int end;
    int sum;

    public Adder(int start, int end)
        {
            this.start = start;
            this.end = end;
            this.sum = 0;
        }


        public void add () {
            for (int i = this.start; i <= this.end; i++) {
                this.sum += i;
            }
        }

        public static void main (String[]args){
            Adder ts = new Adder(1, 10000);
            ts.add();
            System.out.println("sum" + ts.sum);
        }
}
