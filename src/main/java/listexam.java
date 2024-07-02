package kopo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        System.out.println("저장된 데이터 수 : " + listSize);

        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            System.out.println("0" + list.get(i));
        }
        System.out.println("");
        for (String name list) {
            System.out.println("0: + name);
        }

                    System.out.println("CH");
        }
        list.forEach(name -> System.out.println("name : + name));

            System.out.println("");
        list.parallelStream().forEach(name -> System.out.println("name :

            System.out.println("1.5");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name=it.next();
    }
        System.out.println("name : " + name));