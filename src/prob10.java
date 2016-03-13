import java.io.File;
import java.io.*;
import java.util.*;

public class prob10 {

	public static void main(String[] args) {

		try {
			Scanner in = new Scanner(new File("prob10.txt"));
			int n = in.nextInt();
			String output = "";
			for (int i = 0; i < n; i++) {
				int codes = in.nextInt();
				for (int j = 0; j < codes; j++) {
					String code = in.next();
					switch (code) {
					case "81":
						output += "a";
						break;
					case "82":
						output += "b";
						break;
					case "83":
						output += "c";
						break;
					case "84":
						output += "d";
						break;
					case "85":
						output += "e";
						break;
					case "86":
						output += "f";
						break;
					case "87":
						output += "g";
						break;
					case "88":
						output += "h";
						break;
					case "89":
						output += "i";
						break;
					case "91":
						output += "j";
						break;
					case "92":
						output += "k";
						break;
					case "93":
						output += "l";
						break;
					case "94":
						output += "m";
						break;
					case "95":
						output += "n";
						break;
					case "96":
						output += "o";
						break;
					case "97":
						output += "p";
						break;
					case "98":
						output += "q";
						break;
					case "99":
						output += "r";
						break;
					case "A2":
						output += "s";
						break;
					case "A3":
						output += "t";
						break;
					case "A4":
						output += "u";
						break;
					case "A5":
						output += "v";
						break;
					case "A6":
						output += "w";
						break;
					case "A7":
						output += "x";
						break;
					case "A8":
						output += "y";
						break;
					case "A9":
						output += "z";
						break;
					case "C1":
						output += "A";
						break;
					case "C2":
						output += "B";
						break;
					case "C3":
						output += "C";
						break;
					case "C4":
						output += "D";
						break;
					case "C5":
						output += "E";
						break;
					case "C6":
						output += "F";
						break;
					case "C7":
						output += "G";
						break;
					case "C8":
						output += "H";
						break;
					case "C9":
						output += "I";
						break;
					case "D1":
						output += "J";
						break;
					case "D2":
						output += "K";
						break;
					case "D3":
						output += "L";
						break;
					case "D4":
						output += "M";
						break;
					case "D5":
						output += "N";
						break;
					case "D6":
						output += "O";
						break;
					case "D7":
						output += "P";
						break;
					case "D8":
						output += "Q";
						break;
					case "D9":
						output += "R";
						break;
					case "E2":
						output += "S";
						break;
					case "E3":
						output += "T";
						break;
					case "E4":
						output += "U";
						break;
					case "E5":
						output += "V";
						break;
					case "E6":
						output += "W";
						break;
					case "E7":
						output += "X";
						break;
					case "E8":
						output += "Y";
						break;
					case "E9":
						output += "Z";
						break;
					case "40":
						output += " ";
						break;
					case "4B":
						output += ".";
						break;
					case "6B":
						output += ",";
						break;
					case "5A":
						output += "!";
						break;
					default:
						break;

					}
				}
				output += '\n';
			}
			System.out.println(output);
		}

		catch (IOException e) {
			System.out.println("error" + e.getMessage());
		}

	}

}