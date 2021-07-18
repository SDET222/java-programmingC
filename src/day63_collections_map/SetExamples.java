package day63_collections_map;

import java.util.*;

public class SetExamples {
        public static void main(String[] args) {

                Set<Integer> set = new HashSet<>();
                set.add(100);
                set.add(1);
                set.add(2);
                set.add(3);
                set.add(4);
                set.add(2);
                set.add(2);
                set.add(2);
                System.out.println(set);

                Set<String> words = new HashSet<>();
                words.add("Ferrari");
                words.add("Lambo");
                words.add("BMW");
                words.add("BMW");
                words.add("Maseratti");
                words.add("Bentley");
                words.add("Land Rover");
                words.add("First");
                words.add("Not ordered");
                System.out.println(words);

                //convert to List
                List<String> wordsList = new ArrayList<>(words);
                System.out.println("wordsList = " + wordsList);
                wordsList.add("Ferrari");
                wordsList.add("Ferrari");
                System.out.println("wordsList.get(0) = " + wordsList.get(0));
                System.out.println("wordsList = " + wordsList);

                words.remove("Lambo");
                System.out.println(words);

                System.out.println("====================================");
                //LinkedHashSet insertion order is maintained!

                Set<String> linkedHashSet = new LinkedHashSet<>();
                linkedHashSet.add("24");
                linkedHashSet.add("java");
                linkedHashSet.add("java");
                linkedHashSet.add("#%&$");
                linkedHashSet.add("4");
                linkedHashSet.add("4");
                linkedHashSet.add("apple");
                linkedHashSet.add("hashset");
                linkedHashSet.add("hashmap");

                System.out.println("linkedHashSet = " + linkedHashSet);

                //treeSet  alphabetical/leksographical, numeral, natural order

                Set<String> treeSet = new TreeSet<>();
                treeSet.add("24");
                treeSet.add("java");
                treeSet.add("java");
                treeSet.add("#%&$");
                treeSet.add("4");
                treeSet.add("4");
                treeSet.add("apple");
                treeSet.add("hashset");
                treeSet.add("hashmap");

                System.out.println("treeSet = " + treeSet);

               // ((TreeSet)treeSet).


        }

}
