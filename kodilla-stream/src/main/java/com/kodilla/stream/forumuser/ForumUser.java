package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int userId;
    final String userName;
    final char sex;
    final LocalDate birdhDate;
    int postQuantity;

    public ForumUser(int userId, String userName, char sex, String birdhDate) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birdhDate = LocalDate.parse(birdhDate);
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirdhDate() {
        return birdhDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public void setPostQuantity(int postQuantity) {
        this.postQuantity = postQuantity;
    }
    @Override
    public String toString() {
        return "User name: " + userName + '\n'
                + "User sex: " + sex + '\n'
                + "User birth date: " + birdhDate + '\n'
                + "User writed posts: " + postQuantity;
    }
}
