package SocialMediaSystem;

public class Main {

    public static void main(String[] args) {

        SocialMediaSystem system = new SocialMediaSystem();

        User vishwa = system.signUp("Vishwa");
        User arun = system.signUp("Arun");
        User kumar = system.signUp("Kumar");
        User vijay = system.signUp("Vijay");

        system.addFriend(vishwa, arun);

        system.createPost(vishwa,
                "Hello Everyone!");

        Post post = vishwa.getPosts().get(0);

        system.likePost(arun, post);

        system.commentPost(arun,
                post,
                "Nice Post!");

        system.showPosts(vishwa);

        system.showNotifications(vishwa);

        system.showNotifications(arun);

        system.friendSuggestions(vishwa);

    }
}