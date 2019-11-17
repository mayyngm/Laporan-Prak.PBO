package javaapi;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet1841720003Mayang {
    public static void main(String[] args) {
        Set mSetCity = new HashSet();
        mSetCity.add("malang");
        mSetCity.add("banyuwangi");
        mSetCity.add("jogjakarta");
        mSetCity.add("batu");

        System.out.println(mSetCity);
        Iterator<String> mIterator = mSetCity.iterator();
        while (mIterator.hasNext()) {
            System.out.println(mIterator.next().toLowerCase());
        }
    }
}
