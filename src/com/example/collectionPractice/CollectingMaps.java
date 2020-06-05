package com.example.collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class CollectingMaps {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else{
            languages.put("Java", "Compiled, High level, platform independent language");
            System.out.println("Java has been successfully added");
        }
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "An algorithmic language");
        languages.put("BASIC", "Beginners ALL Purpose Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about java");
        }

        System.out.println("===================================================");

//        languages.remove("Lisp");
        if(languages.remove("Algol", "An algorithmic language")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")){
            System.out.println("Lip Replaced");
        }else{
            System.out.println("Lisp was not replaced");
        }

        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
