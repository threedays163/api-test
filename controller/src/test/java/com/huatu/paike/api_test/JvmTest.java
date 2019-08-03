package com.huatu.paike.api_test;

import org.junit.Test;

import java.lang.ref.SoftReference;

public class JvmTest {

    @Test
    public void testClassLoader(){
        //System.out.println(System.getProperty("sun.boot.class.path"));

        //C:\Program Files\Java\jdk1.8.0_152\jre\lib\resources.jar;     //资源 包括各种静态配置文件 properties, 静态图片, 二进制数据文件
        // C:\Program Files\Java\jdk1.8.0_152\jre\lib\rt.jar;           //bootstrap classes; 开发中使用到的绝大部分api(基本数据类型,基本类库,IO(文件,网络),,并发工具包,)
        // C:\Program Files\Java\jdk1.8.0_152\jre\lib\sunrsasign.jar;   //SunRsaSign 在windows版里不存在 , 标准版里有.是RSA签名的一个增强替代
        // C:\Program Files\Java\jdk1.8.0_152\jre\lib\jsse.jar;     //Java Secure Socket Extension Java安全套接字扩展包
        // C:\Program Files\Java\jdk1.8.0_152\jre\lib\jce.jar;      //Java Cryptography Extension Java加密扩展包
        // C:\Program Files\Java\jdk1.8.0_152\jre\lib\charsets.jar; //字符集类
        // C:\Program Files\Java\jdk1.8.0_152\jre\lib\jfr.jar;
        // C:\Program Files\Java\jdk1.8.0_152\jre\classes

        //System.out.println(System.getProperty(""));


        long i=0;

        while(true){
            if(i==Long.MAX_VALUE){
                i=0;
            }
            SoftReference<String> str=new SoftReference<>(""+i);
            str.get();
            if(i%100000==0){
                try {
                    Thread.sleep(2000L);
                }catch (Exception e){
                }
            }
            i++;
        }

    }

    @Test
    public void testMaxThreadCount(){
        int count=0;
        while(true){
            try {
                Thread thread=new Thread(()->{
                    try {
                        Thread.sleep(1200000L);
                    }catch (Exception e){

                    }
                });
                thread.start();
                count++;
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("count="+count);
                throw e;
            }catch (OutOfMemoryError e){
                e.printStackTrace();
                System.out.println("count="+count);
                throw e;
            }catch(StackOverflowError e){
                e.printStackTrace();
                System.out.println("count="+count);
                throw e;
            }
        }
    }
}
