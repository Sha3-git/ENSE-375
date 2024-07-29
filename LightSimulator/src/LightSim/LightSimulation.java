package LightSim;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LightSimulation {

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("/***************************\n" + " * Welcome to LightSim v3.0\n" + " *\n"
				+ " * Written by:\n" + " * Connor\n" + " * Shema\n" + " * Kevin\n" + " **************************/");

		

		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Please select an option to calculate:\n" + "1. Reflection\n" + "2. Albedo\n"
					+ "3. Intensity\n Or -1 to exit\n");
			
			System.out.print("Enter the number of your choice: ");
			try {
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					snell(scanner);
					break;
				case 2:
					albedo(scanner);
					break;
				case 3:
					intensity(scanner);
					break;
				case -1:
					System.out.println("Exited with -1");
					break;
				default:
					System.out.println("Invalid choice. Please select 1, 2, or 3, or -1 to exit.");
					break;

				}
				
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.next(); // Clear the invalid input
				choice = scanner.nextInt(); // Set a default value to continue the loop
			}

		} while (choice != -1);
		
		

	}

	public static void intensity(Scanner scanner) {
		Intensity intensity = new Intensity(0, 0, 0, 0);

		System.out.println("Select the calculation method:");
		System.out.println("1. Calculate intensity based on energy, time, and area");
		System.out.println("2. Calculate intensity based on power and area");
		System.out.print("Enter your choice (1 or 2): ");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			// Calculate intensity using energy, time, and area
			System.out.print("Enter energy (Joules): ");
			double energy = scanner.nextDouble();

			System.out.print("Enter time (seconds): ");
			double time = scanner.nextDouble();

			System.out.print("Enter area (square meters): ");
			double area = scanner.nextDouble();

			double intensity1 = intensity.calculateIntensity(energy, time, area);
			if (intensity1 != -1) {
				System.out.printf("Intensity: %.2f W/m²%n", intensity1);
			} else {
				System.out.println("Invalid input values. All values must be greater than zero.");
			}
			break;

		case 2:
			// Calculate intensity using power and area
			System.out.print("Enter power (Watts): ");
			double power = scanner.nextDouble();

			System.out.print("Enter area (square meters): ");
			double area2 = scanner.nextDouble();

			double intensity2 = intensity.calculateIntensity(power, area2);
			if (intensity2 != -1) {
				System.out.printf("Intensity: %.2f W/m²%n", intensity2);
			} else {
				System.out.println("Invalid input values. Power and area must be greater than zero.");
			}
			break;

		default:
			System.out.println("Invalid choice. Please select 1 or 2.");
			break;
		}
		if (intensity.getIntensity() < 100) {
			System.out
					.println("The intensity is low. This might indicate dim lighting or a very diffuse light source.");
		} else if (intensity.getIntensity() >= 100 && intensity.getIntensity() <= 500) {
			System.out.println("The intensity is moderate. This is typical for standard indoor lighting conditions.");
		} else {
			System.out
					.println("The intensity is high. This could be due to bright lighting or a focused light source.");
		}


	}

	public static void snell(Scanner scanner) {


		// Create Snell object
		Snell snell = null;

		// Choice selection
		System.out.println("\nChoose what you want to calculate:");
		System.out.println("1. Calculate Theta1");
		System.out.println("2. Calculate Theta2");
		System.out.println("3. Calculate Index1");
		System.out.println("4. Calculate Index2");
		System.out.println("5. Reflection and Refraction");

		int choice = scanner.nextInt();

		switch (choice) {
		  case 1:
              System.out.print("Enter the refractive index of the first medium: ");
              double index1ForTheta1 = scanner.nextDouble();
              System.out.print("Enter the refractive index of the second medium: ");
              double index2ForTheta1 = scanner.nextDouble();
              System.out.print("Enter the angle of refraction (degrees): ");
              double theta2ForTheta1 = scanner.nextDouble();
              snell = new Snell(0, theta2ForTheta1, index1ForTheta1, index2ForTheta1);
              if (snell.calculateTheta1() != -1) {
                  System.out.printf("Theta1: %.2f degrees%n", snell.calculateTheta1());
                  interpretTheta(snell.calculateTheta1(), "Theta1");
              } else {
                  System.out.printf("Invalid Input");
              }
              break;

          case 2:
              System.out.print("Enter the refractive index of the first medium: ");
              double index1ForTheta2 = scanner.nextDouble();
              System.out.print("Enter the refractive index of the second medium: ");
              double index2ForTheta2 = scanner.nextDouble();
              System.out.print("Enter the angle of incidence (degrees): ");
              double theta1ForTheta2 = scanner.nextDouble();
              snell = new Snell(theta1ForTheta2, 0, index1ForTheta2, index2ForTheta2);
              if (snell.calculateTheta2() != -1) {
                  System.out.printf("Theta2: %.2f degrees%n", snell.calculateTheta2());
                  interpretTheta(snell.calculateTheta2(), "Theta2");
              } else {
                  System.out.printf("Invalid Input");
              }
              break;

          case 3:
              System.out.print("Enter the refractive index of the second medium: ");
              double index2ForIndex1 = scanner.nextDouble();
              System.out.print("Enter the angle of incidence (degrees): ");
              double theta1ForIndex1 = scanner.nextDouble();
              System.out.print("Enter the angle of refraction (degrees): ");
              double theta2ForIndex1 = scanner.nextDouble();
              snell = new Snell(theta1ForIndex1, theta2ForIndex1, 0, index2ForIndex1);
              if (snell.calculateIndex1() != -1) {
                  System.out.printf("Index1: %.2f%n", snell.calculateIndex1());
                  interpretIndex(snell.calculateIndex1(), "Index1");
              } else {
                  System.out.printf("Invalid Input");
              }
              break;

          case 4:
              System.out.print("Enter the refractive index of the first medium: ");
              double index1ForIndex2 = scanner.nextDouble();
              System.out.print("Enter the angle of incidence (degrees): ");
              double theta1ForIndex2 = scanner.nextDouble();
              System.out.print("Enter the angle of refraction (degrees): ");
              double theta2ForIndex2 = scanner.nextDouble();
              snell = new Snell(theta1ForIndex2, theta2ForIndex2, index1ForIndex2, 0);
              if (snell.calculateIndex2() != -1) {
                  System.out.printf("Index2: %.2f%n", snell.calculateIndex2());
                  interpretIndex(snell.calculateIndex2(), "Index2");
              } else {
                  System.out.printf("Invalid Input");
              }
              break;

          case 5:
              System.out.print("Enter the refractive index of the first medium: ");
              double index1ForReflection = scanner.nextDouble();
              System.out.print("Enter the refractive index of the second medium: ");
              double index2ForReflection = scanner.nextDouble();
              System.out.print("Enter the angle of incidence (degrees): ");
              double theta1ForReflection = scanner.nextDouble();
              System.out.print("Enter the angle of refraction (degrees): ");
              double theta2ForReflection = scanner.nextDouble();
              snell = new Snell(theta1ForReflection, theta2ForReflection, index1ForReflection, index2ForReflection);
              if (snell.calculateTheta1() != -1 && snell.calculateTheta2() != -1) {
                  printReflectionRefraction(snell);
              } else {
                  System.out.printf("Invalid Input");
              }
              break;

		default:
			System.out.println("Invalid choice.");
		}


	}
	

    public static void interpretTheta(double theta, String thetaName) {
        if (theta >= 0 && theta < 30) {
            System.out.printf("%s is quite shallow, indicating the light is entering or exiting at a low angle.%n", thetaName);
        } else if (theta >= 30 && theta <= 60) {
            System.out.printf("%s is moderate, indicating the light is entering or exiting at a moderate angle.%n", thetaName);
        } else if (theta > 60 && theta <= 90) {
            System.out.printf("%s is steep, indicating the light is entering or exiting at a steep angle.%n", thetaName);
        } else {
            System.out.printf("%s is out of the typical range, indicating an error in calculation or input.%n", thetaName);
        }
    }

    public static void interpretIndex(double index, String indexName) {
        if (index >= 1 && index <= 1.5) {
            System.out.printf("%s indicates a low refractive index, typical for gases or air.%n", indexName);
        } else if (index > 1.5 && index <= 2.5) {
            System.out.printf("%s indicates a moderate refractive index, typical for liquids like water.%n", indexName);
        } else if (index > 2.5 && index <= 4) {
            System.out.printf("%s indicates a high refractive index, typical for certain solids or dense materials.%n", indexName);
        } else {
            System.out.printf("%s is out of the typical range, indicating an error in calculation or input.%n", indexName);
        }
    }

	private static void printReflectionRefraction(Snell snell) {
		System.out.println("\n### Reflection and Refraction ###");

		double theta1 = snell.getTheta1();
		double theta2 = snell.getTheta2();

		System.out.println("Angle of incidence (θ1): " + theta1 + " degrees");
		System.out.println("Angle of refraction (θ2): " + theta2 + " degrees");

		// Drawing the angles with dots
		drawAngles(theta1, theta2);
	}
	

	private static void drawAngles(double theta1, double theta2) {
		int gridWidth = 40; // Width of the grid
		int gridHeight = 20; // Height of the grid
		char[][] grid = new char[gridHeight][gridWidth];

		// Initialize grid with spaces
		for (int i = 0; i < gridHeight; i++) {
			for (int j = 0; j < gridWidth; j++) {
				grid[i][j] = ' ';
			}
		}

		// Calculate positions for the incident and refracted rays
		int centerX = gridWidth / 4; // X position of the normal line
		int centerY = gridHeight / 2; // Y position of the normal line

		int length1 = (int) (gridHeight * (theta1 / 90.0)); // Scale angle to length
		int length2 = (int) (gridHeight * (theta2 / 90.0)); // Scale angle to length

		// Draw the normal line
		for (int i = 0; i < gridHeight; i++) {
			grid[i][centerX] = '|';
		}

		// Draw the incident ray
		for (int i = 0; i < length1; i++) {
			int y = centerY - i;
			if (y >= 0) {
				grid[y][centerX - i] = '.';
			}
		}

		// Draw the refracted ray
		for (int i = 0; i < length2; i++) {
			int y = centerY + i;
			if (y < gridHeight) {
				grid[y][centerX + i] = '.';
			}
		}

		// Print the grid
		for (int i = 0; i < gridHeight; i++) {
			for (int j = 0; j < gridWidth; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}

	public static void albedo(Scanner scanner) {
		System.out.print("Enter the reflected solar intensity (W/m²): ");
		double reflectedSolar = scanner.nextDouble();

		System.out.print("Enter the incident solar intensity (W/m²): ");
		double incidentSolar = scanner.nextDouble();

		// Create Albedo object and calculate albedo
		Albedo albedo = new Albedo(reflectedSolar, incidentSolar);
		double calculatedAlbedo = albedo.calculateAlbedo();

		// Display the results
		if (calculatedAlbedo >= 0) {
			System.out.printf("Reflected Solar Intensity: %.2f W/m²%n", albedo.getReflectedSolar());
			System.out.printf("Incident Solar Intensity: %.2f W/m²%n", albedo.getIncidentSolar());
			System.out.printf("Calculated Albedo: %.2f%n", calculatedAlbedo);

			if (albedo.getAlbedo() >= 0.8) {
				System.out.println("**High Albedo**");
				System.out.println(
						"Definition: A high albedo means that a larger proportion of incident light or radiation is reflected back.");
				System.out.println("Typical Values: Near 1 or 100%. Common examples include:");
				System.out.println("  - Fresh snow: Albedo can be around 0.8 to 0.9.");
				System.out.println("  - Ice and glaciers: Albedo values often range from 0.6 to 0.8.");
				System.out.println();
				System.out.println("Implications:");
				System.out.println(
						"  - Reflectivity: High albedo surfaces are highly reflective and absorb less solar energy.");
				System.out.println(
						"  - Temperature Effects: Surfaces with high albedo generally stay cooler because they reflect a significant portion of incoming solar energy.");
				System.out.println(
						"  - Climate Impact: Increased albedo in polar regions due to melting ice can initially lead to cooler temperatures. However, reduced ice cover can eventually lead to further warming due to exposure of lower albedo surfaces like open water.");
			} else if (albedo.getAlbedo() <= 0.2) {
				System.out.println("**Low Albedo**");
				System.out.println(
						"Definition: A low albedo means that a smaller proportion of incident light or radiation is reflected back.");
				System.out.println("Typical Values: Near 0 or 0%. Common examples include:");
				System.out.println(
						"  - Ocean water: Albedo values can be as low as 0.05 to 0.1, depending on the angle of the sun and the state of the water surface.");
				System.out.println("  - Asphalt and concrete: Albedo values can range from 0.05 to 0.2.");
				System.out.println();
				System.out.println("Implications:");
				System.out.println("  - Absorptivity: Low albedo surfaces absorb more solar energy and reflect less.");
				System.out.println(
						"  - Temperature Effects: Surfaces with low albedo generally become warmer because they absorb more energy from the sun.");
				System.out.println(
						"  - Climate Impact: Lower albedo surfaces, such as dark oceans or urban areas, can contribute to warming, like in urban heat islands where city environments are warmer than rural surroundings due to lower albedo of surfaces like asphalt and buildings.");
			} else {
				System.out.println("**Moderate Albedo**");
				System.out
						.println("Definition: An albedo value between 0.2 and 0.8 represents a moderate reflectivity.");
				System.out.println("Typical Values: Examples include:");
				System.out.println("  - Grasslands and forests: Albedo values typically range from 0.2 to 0.4.");
				System.out.println("  - Deserts: Albedo values can range from 0.3 to 0.5.");
				System.out.println();
				System.out.println("Implications:");
				System.out.println(
						"  - Reflectivity and Absorptivity: Surfaces with moderate albedo reflect and absorb a balanced amount of solar energy.");
				System.out.println(
						"  - Temperature Effects: These surfaces have intermediate temperature effects, reflecting some sunlight while absorbing a moderate amount of energy.");
			}
		} else {
			System.out.println("Error: Incident solar intensity must be greater than zero.");
		}
	}

}
