package task08.tasks;

import task08.data.TestData;
import task08.model.Post;
import task08.model.User;

import java.util.List;
import java.util.Optional;

public
class P4_TerminalOperations {

    public static void go() {

        printHeader("Problem P4 – Terminal Operations");

        List<Post> posts = TestData.getPosts();
        List<User> users = TestData.getUsers();

        System.out.println("--- [1] count() – number of NEWS posts ---");
//TODO 16
        long newsCount = posts.stream()
                .filter(p -> p.getCategory().equals("NEWS"))
                .count();

        System.out.println("Number of NEWS posts: " + newsCount);

        System.out.println("\n--- [2] anyMatch() – is there a post with tag 'docker'? ---");
//TODO 17
        boolean hasDocker = posts.stream()
                .anyMatch(p -> p.getTags().contains("docker"));

        System.out.println("Is there a post with 'docker': " + hasDocker);


        System.out.println("\n--- [3] allMatch() – do all have at least 1 comment? ---");
//TODO 18
        boolean allHaveComments = posts.stream()
                .allMatch(p -> p.getComments() > 0);

        System.out.println("Do all have comments: " + allHaveComments);

        System.out.println("\n--- [4] noneMatch() – do none of the posts have negative likes? ---");
//TODO 19
        boolean noNegativeLikes = posts.stream()
                .noneMatch(p -> p.getLikes() < 0);

        System.out.println("Do none have negative likes: " + noNegativeLikes);

        System.out.println("\n--- [5] findFirst() – first LIFESTYLE post ---");
//TODO 20
        Optional<Post> firstLifestyle = posts.stream()
                .filter(p -> p.getCategory().equals("LIFESTYLE"))
                .findFirst();
        firstLifestyle.ifPresentOrElse();

        System.out.println("Content (orElse): " + content);

        System.out.println("\n--- [6] findFirst() – unverified user from Kraków ---");
//TODO 21


        System.out.println("\n--- [7] Optional – method demonstration ---");
//TODO 22

    }

    private static void printHeader(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + title);
        System.out.println("=".repeat(60));
    }
}