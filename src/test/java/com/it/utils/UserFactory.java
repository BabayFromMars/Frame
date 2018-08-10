package com.it.utils;

public class UserFactory {
   public static User getValidUser() {
       return new User("ittest2", "337774a", "ittest2@i.ua");

   }
    public static User2 getValidUser2 () {
        return new User2("ittest", "337774a", "ittest@i.ua");
    }
}
