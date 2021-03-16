package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WorkHours {
    private static final int NAME = 0;
    private static final int HOUR = 1;
    private static final int DATE = 2;

    public String minWork(String file) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(file))) {
            String line = "";
            int minHours = Integer.MAX_VALUE;
            String minWorker = null;
            int hour = 0;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                hour = Integer.parseInt(parts[HOUR]);

                if (hour < minHours) {
                    minWorker = parts[NAME] + ": " + parts[DATE];
                    minHours = hour;
                }
            }

            return minWorker;

        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!");
        }
    }
}
