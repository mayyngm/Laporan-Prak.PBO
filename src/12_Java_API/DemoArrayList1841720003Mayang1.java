package javaapi;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class DemoArrayList1841720003Mayang1 {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("indonesia");
        mListCountry.add("malaysia");
        mListCountry.add("german");
        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.format("%s", element);
        }
    }   
}