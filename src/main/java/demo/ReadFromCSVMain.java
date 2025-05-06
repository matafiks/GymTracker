package demo;

import repository.ReadWorkoutFromCSV;

public class ReadFromCSVMain {

    public static void main(String[] args) {

        ReadWorkoutFromCSV read = new ReadWorkoutFromCSV();
        read.readWorkoutFromCSVFile();
    }
}
