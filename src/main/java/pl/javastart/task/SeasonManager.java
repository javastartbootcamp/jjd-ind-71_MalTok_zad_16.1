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
        while (true) {
            System.out.println("Podaj porę roku:");
            showSeasons();
            String userInput = scanner.nextLine();
            Season season = Season.findSeasonByMonth(userInput);
            if (season != null) {
                return season;
            } else {
                System.out.println("Nie ma takiej pory roku, spróbuj ponownie");
            }
        }
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
