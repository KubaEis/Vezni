import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        List<Vezen> vezni = new ArrayList<>();
        Path soubor = Path.of("data", "vezni_testovaci_data.txt");
        if (!Files.exists(soubor.getParent())) {
            Files.createDirectories(soubor.getParent());
        }
        int pocetRadku = 0;
        try {
            // Otevření BufferedWriter v try-with-resources
            try (BufferedReader reader = Files.newBufferedReader(soubor))
            {
                String[] radky = reader.lines().toArray(String[]::new);
                pocetRadku = radky.length;
                for (int i = 0; i < pocetRadku; i++) {
                    String[] hodnoty = radky[i].split(";");
                    vezni.add(new Vezen(hodnoty[0], hodnoty[1], hodnoty[2], hodnoty[3], hodnoty[4], hodnoty[5], hodnoty[6], hodnoty[7]));
                }
            }
            for (int i = 0; i < vezni.size(); i++) {
                System.out.println(vezni.get(i).toString());
            }
        } catch (IOException e) {
            System.out.println("Chyba při čtení souboru:");
            e.printStackTrace();
        }
    }
}