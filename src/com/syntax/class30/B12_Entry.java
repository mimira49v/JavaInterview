package com.syntax.class30;

import java.util.HashSet;
import java.util.Set;

public class B12_Entry {

        String key;
        Double value;
        public B12_Entry(String key,Double value){
            this.key=key;
            this.value=value;
        }
        String getKey(){
            return key;
        }
        Double getValue(){
            return value;
        }

    @Override
    public String toString() {
        return "B12_Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
    Set<B12_Entry> entries = new HashSet<>();
    entries.add(new B12_Entry("Apple",12.0));
    entries.add(new B12_Entry("Mango",15.0));
    entries.add(new B12_Entry("Banana",18.0));
    entries.add(new B12_Entry("Kiwi",12.0));
    System.out.println(entries);


        for (B12_Entry b:entries) {
            System.out.println(b);
        }
    }
}