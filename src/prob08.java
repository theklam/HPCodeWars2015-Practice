import java.io.File;
import java.io.*;
import java.util.*;

public class prob08 {

	public static void main(String[] args) {

		try {
			Scanner in = new Scanner(new File("prob08.txt"));
			int n = in.nextInt();
			int[] duplicate = new int[301];
			int empty = 0;
			int duplicates = 0;
			int withoutCube = 0;

			for (int i = 0; i < n; i++) {

				String name = in.next();

				int cubeNumber = in.nextInt();
				if (name.equals("NA")) {
					empty++;
				}
				if (cubeNumber == 0) {
					withoutCube++;
				}
				duplicate[cubeNumber]++;
			}
			
			for(int j = 0; j < duplicate.length; j++) {
				if (duplicate[j] > 1) {
					duplicates++;
				}
			}
			
			System.out.println("Empty Cubes: " + empty);
			System.out.println("Duplicate Cube Assignments: " + duplicates);
			System.out.println("Employees without Cube: " + withoutCube);

		}

		catch (IOException e) {
			System.out.println("error" + e.getMessage());
		}

	}

}