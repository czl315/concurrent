package main.java;

import com.czl.stream.Widget;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        Widget widget1 = new Widget("RED",1);
        Widget widget2 = new Widget("BLACK",2);
        Widget widget3 = new Widget("RED",3);
//        List<Widget> widgets = new ArrayList<>();
        List<Widget> widgets = Arrays.asList(widget1,widget2,widget3);

        int sum = widgets.stream()
                     .filter(w -> "RED".equals(w.getColor()))
                                      .mapToInt(w -> w.getWeight())
                                     .sum();
        System.out.println(sum);

//        widgets.stream().map(item ->{
//            List<Widget> rs = Arrays.asList();
//            if("RED".equals(item.getColor())){
//                rs.add(item);
//            }
//            return item;
//        }).forEach({
//                rs.add(item);
//        });

    }

}
