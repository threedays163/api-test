package com.huatu.paike.api_test;


public class MyTest {

    static int step=0;

    public static void hanno(String i,String j,String k,int m){
        if(m==1){
            System.out.printf("第%d步:将%d从%s->%s\n",++step,m,i,k);
        }else{
            hanno(i,k,j,m-1);
            System.out.printf("第%d步:将%d从%s->%s\n",++step,m,i,k);
            hanno(j,i,k,m-1);

        }
    }

    public static void main(String[] args) {
        hanno("A","B","C",10);
    }
}
