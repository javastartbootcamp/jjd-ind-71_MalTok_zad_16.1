package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        Season foundSeason = getSeasonFromUser(scanner);
        showMonthsInSeason(foundSeason);
    }

    private Season getSeasonFromUser(Scanner scanner) {
        Season foundSeason = null;
        do {
            System.out.println("Podaj porę roku:");
            showSeasons();
            String userInput = scanner.nextLine();
            for (Season season : Season.values()) {
                if (userInput.equalsIgnoreCase(season.getPlName())) {
                    foundSeason = season;
                    break;
                }
            }
        } while (foundSeason == null);
        return foundSeason;
    }

    private void showMonthsInSeason(Season season) {
        System.out.println("W tej porze roku są następujące miesiące:");
        String[] months = season.getMonths();
        System.out.println(Arrays.toString(months));
    }

    private void showSeasons() {
        for (Season season : Season.values()) {
            System.out.println(season.getPlName());
        }
    }

}
