package kopo;

import java.util.HashMap;
import java.util.Map;

public class MapExam {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "ON");

        System.out.println("조회결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : "+map.get("email"));
        System.out.println("dept : "+ map.get("dept"));

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() +" : " + entry.getValue());

        });

    }
}
