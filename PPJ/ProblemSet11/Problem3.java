import java.util.Arrays;

public class Problem3 {
    public void main() {
        String[][] arr = {
                {"Germany", "2", "Scotland", "1"},
                {"Poland", "2", "Germany", "0"},
                {"Germany", "1", "Ireland", "1"},
                {"Poland", "2", "Scotland", "2"},
                {"Scotland", "1", "Ireland", "0"},
                {"Ireland", "1", "Poland", "1"},
                {"Ireland", "1", "Scotland", "1"},
                {"Germany", "3", "Poland", "1"},
                {"Scotland", "2", "Germany", "3"},
                {"Ireland", "1", "Germany", "0"},
                {"Scotland", "2", "Poland", "2"},
                {"Poland", "2", "Ireland", "1"}
        };

        int[] scores = new int[4];

        for (String[] match : arr) {
            String team1 = match[0];
            int score1 = Integer.parseInt(match[1]);
            String team2 = match[2];
            int score2 = Integer.parseInt(match[3]);

            int index1 = getIndex(team1);
            int index2 = getIndex(team2);

            if (score1 > score2)
                scores[index1] += 3;
            else if (score1 < score2)
                scores[index2] += 3;
            else {
                scores[index1] += 1;
                scores[index2] += 1;
            }
        }

        System.out.println("Scores (Germany, Ireland, Poland, Scotland):");
        System.out.println(Arrays.toString(scores));
    }

    public static int getIndex(String country) {
        return switch (country) {
            case "Germany" -> 0;
            case "Ireland" -> 1;
            case "Poland" -> 2;
            case "Scotland" -> 3;
            default -> -1;
        };
    }
}