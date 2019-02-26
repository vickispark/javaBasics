package com.immutable_class;

import java.util.HashMap;

/*
 * Copyright (c), AnkitMittal JavaMadeSoEasy.com
 * Main class for testing ImmutableClass_1
 */
public class ImmutableClassTests{
    public static void main(String[] args) {
      
       Integer localId=new Integer(1); //local
      
       String localName=new String("ankit"); //local
      
        HashMap<Integer, String> localMap = new HashMap<Integer,String>(); //local
        localMap.put(11, "audi");
      
        ImmutableClass_1 immutableClass_1 = new ImmutableClass_1(localId, localName, localMap);
       
 
        System.out.println("----Display ImmutableClass members before changing----");
        System.out.println(immutableClass_1.getName());  // "ankit"
        System.out.println(immutableClass_1.getId());        // 1
        System.out.println(immutableClass_1.getMap());   //{11=audi}
 
        //Comparing ImmutableClass members with local before changing
        System.out.println(localName==immutableClass_1.getName());  //true
        System.out.println(localId==immutableClass_1.getId());      //true
        System.out.println(localMap == immutableClass_1.getMap());  //false
 
       
        //change local
        localId = new Integer(2);
        localName = new String("mittal");
        localMap.put(12, "ferarri");
 
       
        System.out.println("\n----Display ImmutableClass members after changing----");
        System.out.println(immutableClass_1.getName());  // "ankit"
        System.out.println(immutableClass_1.getId());        // 1
        System.out.println(immutableClass_1.getMap());   //{11=audi}
 
        //Comparing ImmutableClass members with local after changing
        System.out.println(localName==immutableClass_1.getName());  //false
        System.out.println(localId==immutableClass_1.getId());      //false
        System.out.println(localMap == immutableClass_1.getMap());  //false
 
    }
 
}