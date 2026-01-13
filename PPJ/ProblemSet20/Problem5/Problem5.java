import java.util.regex.Matcher;
import java.util.regex.Pattern;

// LatexIndex
public class Problem5 {
    public static void main(String[] args) {
        String text = "Za początek okresu hellenistycznego uznaje się śmierć\n" +
                "\\emph{Stagiryty}.\\index{Stagiryta} To okres powstania\n" +
                "do dziś żywych koncepcji etycznych: \\emph{epikureizmu}\n" +
                "(Epikur, \\index{Epikur} ur. 341, zm. 270 p.n.e.)\n" +
                "mówiącego, że sensem życia jest doznawanie przyjemności\n" +
                "(por. \\emph{hedonizm}) i \\emph{stoicyzmu (IV wiek p.n.e.\n" +
                "II n.e.) dającego wzór postawy mędrca wobec śmierci\n" +
                "(Zenon z Kition, \\index{Zenon\n" +
                "z Kition} Chryzyp, Seneka, mistrz retoryki Cyceron\n" +
                "i Marek Aureliusz\\index{Marek\n" +
                "Aureliusz}, filozof na tronie). Sceptycy starożytni (Pirron,\n" +
                "\\index{Pirron} Sekstus Empiryk)\\index{Sekstus\n" +
                "Empiryk} z pobudek etycznych (uspokojenie umysłu) podawali\n" +
                "w wątpliwość możliwość wszelkiej wiedzy i dali początek wszelkim\n" +
                "nurtom sceptycznym. Tomasz z Akwinu\\index{Tomasz\n" +
                "z Akwinu} (ur. 1225, zm. 1274)";

        String reg = "\\\\index\\{([^}]+)\\}";
        //String reg = "(?s)\\\\index\\{(.*?)\\}";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);

        while (m.find()) {
            String entry = m.group(1).replaceAll("\\s+", " ");
            System.out.println(entry);
        }
    }
}