package SocialMediaSystem;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private int postId;
    private String content;
    private User owner;

    private int likes;
    private List<String> comments;

    Post(int postId, String content, User owner) {

        this.postId = postId;
        this.content = content;
        this.owner = owner;

        likes = 0;
        comments = new ArrayList<>();
    }

    public int getPostId() {
        return postId;
    }

    public String getContent() {
        return content;
    }

    public User getOwner() {
        return owner;
    }

    public int getLikes() {
        return likes;
    }

    public List<String> getComments() {
        return comments;
    }

    public void like() {
        likes++;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }
}