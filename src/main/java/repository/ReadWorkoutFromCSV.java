package repository;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ReadWorkoutFromCSV {

    public void readWorkoutFromCSVFile() {
        try (CSVReader reader = new CSVReader(new FileReader("resources/sample_workout_csv.csv"))) {
            List<String[]> rows = reader.readAll();
            for (String[] row : rows) {
                System.out.println(Arrays.toString(row));
            }
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }

}
