package javaapi;
import java.util.ArrayList;
import java.util.List;
public class DemoArrayList1841720003Mayang {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("indonesia");
        mListCountry.add("malaysia");
        mListCountry.add("german");
        System.out.println(mListCountry);
        System.out.format("list index 0 = %s\n", mListCountry.get(0));
        System.out.format("list index 2 = %s\n", mListCountry.get(2));
    }   
}