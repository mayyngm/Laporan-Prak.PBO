package javaapi;
import java.util.HashMap;
public class DemoMap1841720003Mayang {
    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "Biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.format("Hashmap Item Total : %d\n\n", hMapItem.size());
        
        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from Hashmap\n", mObject);
        System.out.format("HashMap Item Total: %d\n", hMapItem.size());
        System.out.println(hMapItem);
        
        hMapItem.clear();
        System.out.format("HasMap Item Total : %d\n", hMapItem.size());
    }
}