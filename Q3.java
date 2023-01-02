package a3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q3 {

	public static void main(String[] args) {
		
		System.out.println(moneyBall("playersCSV.txt"));
		
	}

	public static String moneyBall(String fileName) {

		String line = "";

		String nameOfBest = "";

		int count = 0;

		try {

			File file = new File(fileName);

			FileReader filereader = new FileReader(file.getName());

			BufferedReader bufferReader = new BufferedReader(filereader);

			String firstLine = bufferReader.readLine();

			int length = Integer.parseInt(firstLine);

			String[] names = new String[length];

			int[] numberOfGoals = new int[length];

			int[] minutesPlayed = new int[length];

			int[] cost = new int[length];

			while (line != null) {

				line = bufferReader.readLine();

				if (line != null) {

					String[] splitLines = line.split(",");

					names[count] = splitLines[0];

					numberOfGoals[count] = Integer.parseInt(splitLines[1]);

					minutesPlayed[count] = Integer.parseInt(splitLines[2]);

					cost[count] = Integer.parseInt(splitLines[3]);

				}

				count++;

			}

			double value = 0;

			for (int loop = 0; loop < length; loop++) {

				float newValue = (numberOfGoals[loop] * (minutesPlayed[loop])) / cost[loop];
				
				if (newValue > value) {

					value = newValue;

					nameOfBest = names[loop];

				}

			}

			bufferReader.close();

			filereader.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

		return nameOfBest;

	}

}
