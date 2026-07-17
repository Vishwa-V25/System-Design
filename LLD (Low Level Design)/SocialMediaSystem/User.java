package SocialMediaSystem;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
    private String name;

    private List<User> friends;
    private List<Post> posts;
    private List<Notification> notifications;

    User(int userId, String name) {
        this.userId = userId;
        this.name = name;

        friends = new ArrayList<>();
        posts = new ArrayList<>();
        notifications = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public void addNotification(Notification n) {
        notifications.add(n);
    }
}
