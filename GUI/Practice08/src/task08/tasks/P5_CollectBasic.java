package task08.tasks;

import task08.data.TestData;
import task08.model.Post;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public
class P5_CollectBasic {

    public static void go() {

        printHeader("Problem P5 – collect() basics");

        List<Post> posts = TestData.getPosts();

//TODO 23

        //System.out.println("Number of TECH posts: " + techPosts.size());
//TODO 24

        System.out.println("\n--- [2] toSet() – unique categories ---");
//TODO 25

        //System.out.println("Unique categories: " + categories);

        System.out.println("\n--- [2b] Comparison List vs Set with duplicates ---");
//TODO 26

        //System.out.println("List (with duplicates): " + authorsList.size() + " elements -> " + authorsList);
        //System.out.println("Set  (without duplicates): " + authorsSet.size() + " elements -> " + authorsSet);


        System.out.println("\n--- [3] toMap() – post id -> number of likes ---");
//TODO 27

        System.out.println("\n--- [4] List of authors (with duplicates) ---");
//TODO 28

        System.out.println("\n--- [BONUS] toUnmodifiableList() ---");
//TODO 29

    }

    private static void printHeader(String title) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" " + title);
        System.out.println("=".repeat(60));
    }
}