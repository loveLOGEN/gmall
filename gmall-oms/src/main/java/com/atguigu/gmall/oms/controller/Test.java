package com.atguigu.gmall.oms.controller;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Integer[] arr = new Integer[10];
        List<Integer> arrList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            arrList.add(i);
        }
        arr = arrList.toArray(arr);

        for (int i = 1; i <= arr.length+10; i++) {
            System.out.println(i+"   "+resolution(arr, i));
        }
    }

    public static  <T> List resolution(Integer[] arr, int length){

        if (length<=0){
            throw new RuntimeException("份数不合法");
        }

        List<List<T>> bigList = new ArrayList<List<T>>();
        List littleList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            littleList.add(arr[i]);
        }

        if (littleList.size()%length == 0){

            int count = littleList.size() / length;

            for (int i = 0; i < length; i++){
                List<T> subList = littleList.subList(i * count, i * count + count);
                bigList.add(subList);
            }
        }else {
            int flag = 0;
            int k = 0;
            int a = 0;

            int count = 0;
            if ((littleList.size()/2 < length) && (littleList.size() >= length)){
                count = littleList.size() / length;
                flag = littleList.size() - length;
                k=1;
            }else {
                if (length*2 < littleList.size()){
                    int j = 2;
                    count = littleList.size() / length;
                    do {
                        flag = littleList.size() - length*j;
                        if (flag<0){
                            flag = littleList.size() - length*(j-1);
                            break;
                        }
                        j++;
                    }while (flag>count);

                    k=1;
                }else {
                    count = littleList.size() / length+1;
                }
            }

            for (int i = 0; i < length; i++){
                if (i==0){
                    a = 0;
                }else {
                    a+=count;
                }
                if ((i==length-1) && (littleList.size()>=length)){
                    List<T> subList = littleList.subList(a, littleList.size());
                    bigList.add(subList);
                }else if ((i*count+count) <= littleList.size()){
                    List<T> subList = littleList.subList(a, a + count+k);
                    bigList.add(subList);
                }else {
                    List<T> subList = littleList.subList(littleList.size(), littleList.size());
                    bigList.add(subList);
                }
                flag--;
                if (flag==0){
                    a+=k;
                    k=0;
                    flag=0;
                }else if (flag < 0){
                    k=0;
                    flag=0;
                }else {
                    a+=k;
                }
            }
        }

        return bigList;
    }
}
