package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> forumUserList = new ArrayList<>();

    public List<ForumUser> getUserList(){

        return new ArrayList<>(forumUserList);
    }

    public void addUser(ForumUser user){
        this.forumUserList.add(user);
    }
}
