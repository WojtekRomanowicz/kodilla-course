package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
       Forum forum = new Forum();

      ForumUser user1 = new ForumUser(001, "Ala", 'F',"1995-06-21" );
      ForumUser user2 = new ForumUser(002, "Wojtek", 'M', "1990-01-01");
      ForumUser user3 = new ForumUser(003, "Natalia" , 'F', "1998-03-25");
      ForumUser user4 = new ForumUser(004, "Andrzej", 'M', "2005-08-12");
      ForumUser user5 = new ForumUser(005, "Krzysiek", 'M', "1975-12-22");
      user1.setPostQuantity(5);
      user2.setPostQuantity(5);
      user3.setPostQuantity(4);
      user4.setPostQuantity(3);
      user5.setPostQuantity(0);

      forum.addUser(user1);
      forum.addUser(user2);
      forum.addUser(user3);
      forum.addUser(user4);
      forum.addUser(user5);

        Map<Integer, ForumUser> theResultMapOfForumUser =forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getBirdhDate().isBefore(LocalDate.now().minusYears(20)) )
                .filter(user -> user.getPostQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}