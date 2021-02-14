package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        StringBuilder string = new StringBuilder();
        String newString = new String();

        newString = "a,f,g,h,j,t,re,ww,d,g,r,e,s,g";

        //for loop way
        for (int i = 0; i < 10; i++) {
            if (i != 9) {
                string.append(i + "-");
            } else {
                string.append(i);
            }
        }

        //easy way :-)
//        string.append("0-1-2-3-4-5-6-7-8-9");
        System.out.println(string);

        List<String> stringLis = new ArrayList<String>();
        stringLis.add("Hello");
        stringLis.add("my");
        stringLis.add("name");
        stringLis.add("naughty");
        stringLis.add("never");
        stringLis.add("new");
        stringLis.add("isn't");
        stringLis.add("i am the best");
        stringLis.add("i");
        stringLis.add("Franciscoz");
        System.out.println("#####################################");

//        System.out.println(stringLis);
        System.out.println(listOfStr(stringLis));
//        System.out.println(listOfStr(stringList));

//        List<List<String>> list = Arrays.asList(stringList);
//        List<StringBuilder> lists = Arrays.asList(string);
//        List<String> newStr = Arrays.asList(newString);
//        System.out.println(list);
//        System.out.println(lists);
//        System.out.println(newStr);
        //run it first time it switches the first and last elements
//        List<String> swap = firstLastSwitched(stringLis);
//
//        for (String str : swap) {
//            System.out.println(str);
//        }
        System.out.println("#####################################");
        Integer arr[] = {1, 2, 3, 4, 6, 5, 7, 88, 9, 45, 33, 44, 66, 24, 102};
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("#####################################");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 6, 5, 7, 88, 9, 45, 33, 44, 66, 24, 102);

        System.out.println("#####################################");

        Set<Integer> numsSet = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println("These are the even numbers " + onlyEvenNumbers(set));


        List<List<Integer>> sortedList = integers(nums);

        for (List<Integer> lists : sortedList) {
            System.out.println(lists);
            System.out.println("NEXT LINE");

        }
        //run it again it switches them back
//        System.out.println(firstLastSwitched(stringLis));
        System.out.println(strList(stringLis));

//        System.out.println(elementsConcat(stringLis));
//
//        System.out.println(combineStr(stringLis));
        System.out.println("#####################################");
        List<String> results = secondStringParam(stringLis, "a");
        for (String res : results) {
            System.out.println(res);
        }
        System.out.println("#####################################");
        Set<String> strings = new HashSet();
        strings.add("Are");
        strings.add("you");
        strings.add("ready");
        strings.add("to");
        strings.add("ruuuuuumble!");

//        System.out.println(strings);
        System.out.println("#####################################");

//        System.out.println(stringSet(strings, 'r'));

        System.out.println("#####################################");

//        System.out.println(setOfStrToLists(strings));

//        System.out.println(onlyEvenNumbers());
        Map<String, String> words = new HashMap<>();
        words.put("erica", "preacher's daughter");
        words.put("pie", "a la mode");
        words.put("son", "four years old");
        System.out.println(words);


        System.out.println(matchingKeyValue(words, "pi"));


        System.out.println(allStringsWithChar(stringLis ));

    }

    public static String listOfStr(List<String> listStr) {
        //assume shortest string is first in index. then check if other strings are larger.
        // if so assign to short string
        String shortStr = listStr.get(0);
        for (String string : listStr) {
            if (string.length() < shortStr.length()) {
                shortStr = string;
            }
        }
        return shortStr;
    }

    public static List<String> firstLastSwitched(List<String> strings) {
        String firstEl = strings.get(0);
        strings.set(0, strings.get(strings.size() - 1));
        strings.set(strings.size() - 1, firstEl);
        return strings;
    }

    //did it on my own. happy happy joy joy but it is an arraylist not a string returned :-(
    public static List<String> elementsConcat(List<String> stringList) {
        for (String str : stringList) {
            str.concat(", ");
        }
        return stringList;
    }

    public static String combineStr(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String st : strs) {
            if (st != strs.get(strs.size() - 1)) {
                result.append(st + ", ");
            } else {
                result.append(st);
            }
        }
        return result.toString();
    }


    public static List<List<Integer>> integers(List<Integer> ints) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
//        List<Integer> divisibleBy2 = new ArrayList<>();
//        List<Integer> divisibleBy3 = new ArrayList<>();
//        List<Integer> divisibleBy5 = new ArrayList<>();
//        List<Integer> notDivisible = new ArrayList<>();
        for (Integer i : ints) {
            if (i % 2 == 0) {
                result.get(0).add(i);
            }
            if (i % 3 == 0) {
                result.get(1).add(i);
            }
            if (i % 5 == 0) {
                result.get(2).add(i);
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 == 0) {
                result.get(3).add(i);
            }
        }

        return result;
    }

    //on my own it worked
    public static List<Integer> strList(List<String> strings) {
        List<Integer> ints = new ArrayList<>();

        for (String str : strings) {
            ints.add(str.length());
        }
        return ints;
    }

    //needs better naming convention
    public static List<String> secondStringParam(List<String> list, String str) {
        List<String> newList = new ArrayList<String>();
        for (String st : list) {
            if (st.contains(str)) {
                newList.add(st);
            }
        }
        return newList;
    }

    //almost duh charAt makes sense
    public static Set<String> stringSet(Set<String> strings, char character) {
        Set<String> charStr = new HashSet<>();

        for (String str : strings) {
            if (str.charAt(0) == character) {
                charStr.add(str);
            }
        }
        return charStr;
    }

    //why is this printing the array list twice
    public static List<String> setOfStrToLists(Set<String> strs) {
        //faster way to change set to list ---
        // just pass in the list as an argument when creating a new list
        List<String> newList = new ArrayList<String>(strs);

//        newList.addAll(strs);

        return newList;
    }

    public static Set<Integer> onlyEvenNumbers(Set<Integer> even) {
        Set<Integer> evenNumbers = new HashSet<>();
        for (Integer e : even) {
            if (e % 2 == 0) {
                evenNumbers.add(e);
            }
        }
        return evenNumbers;
    }

    public static String matchingKeyValue(Map<String, String> map, String string) {
        for (String key : map.keySet()) {
            if (key.equals(string)) {
                return map.get(key);
            }
        }
        return "nothing to see here...";
    }

    //these were hard didnt know it was cool
    public static Map<Character, Integer> allStringsWithChar(List<String> strings) {
        Map<Character, Integer> map = new HashMap<>();
        for (String a : strings) {
            char c = a.charAt(0);
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }

}




