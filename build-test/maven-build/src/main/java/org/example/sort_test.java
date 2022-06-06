package org.example;

class Array{
    private long[] a;
    private int n;

    public Array(int nmax){
        a = new long[nmax];
        n = 0;
    }

    public void Add(long value){
        a[n] = value;
        n++;
    }

    public void create(int k){
        for(int i = 0; i < k; i++){
            a[i] = (int) (Math.random()*30);
        }
    }

    public void Print(){
        for(int i = 0; i < n; i++){
            System.out.println(a[i]+" ("+ i +")");
        }
        System.out.println("------------------");
    }

    public void bubbleSort(){
        long tmp;
        for (int i = n-1; i>=1;i--){
            for (int j = 0; j<i;j++){
                if (a[j]>a[i]){
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    }


}

public class sort_test {
    public static void main(String[] args){
        int L = 10;
        Array array = new Array(L);

        for(int i = 0; i < L; i++){
            array.Add((int) (Math.random()*30));
        }
        array.Print();
        array.bubbleSort();
        array.Print();
    }
}
