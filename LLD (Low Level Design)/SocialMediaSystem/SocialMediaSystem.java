package SocialMediaSystem;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaSystem {

    private List<User> users;

    private int userId = 1;
    private int postId = 1;

    SocialMediaSystem() {
        users = new ArrayList<>();
    }

    public User signUp(String name) {

        User user = new User(userId++, name);

        users.add(user);

        System.out.println(name + " Registered");

        return user;
    }

    public void addFriend(User u1, User u2) {

        u1.addFriend(u2);
        u2.addFriend(u1);

        System.out.println("Friend Added");
    }

    public void createPost(User user, String content) {

        Post post = new Post(postId++, content, user);

        user.addPost(post);

        for (User friend : user.getFriends()) {

            friend.addNotification(
                    new Notification(
                            user.getName() + " added a new post."));
        }

        System.out.println("Post Created");
    }

    public void likePost(User user, Post post) {

        post.like();

        post.getOwner().addNotification(
                new Notification(
                        user.getName() + " liked your post."));
    }

    public void commentPost(User user, Post post, String comment) {

        post.addComment(user.getName() + ": " + comment);

        post.getOwner().addNotification(
                new Notification(
                        user.getName() + " commented on your post."));
    }

    public void showNotifications(User user) {

        System.out.println();

        System.out.println(user.getName() + " Notifications");

        for (Notification n : user.getNotifications()) {

            System.out.println(n.getMessage());

        }

    }

    public void showPosts(User user) {

        System.out.println();

        System.out.println(user.getName() + " Posts");

        for (Post p : user.getPosts()) {

            System.out.println("--------------------------------");

            System.out.println("Post ID : " + p.getPostId());

            System.out.println(p.getContent());

            System.out.println("Likes : " + p.getLikes());

            System.out.println("Comments");

            for (String c : p.getComments())

                System.out.println(c);

        }

    }

    public void friendSuggestions(User user) {

        System.out.println();

        System.out.println("Friend Suggestions");

        for (User u : users) {

            if (u == user)

                continue;

            if (!user.getFriends().contains(u))

                System.out.println(u.getName());

        }

    }
}