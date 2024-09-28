import java.util.Scanner;

public class VirusDefinitionsAPI {
    private VirusDefinitions virusDefinitions;

    public VirusDefinitionsAPI(VirusDefinitions virusDefinitions) {
        this.virusDefinitions = virusDefinitions;
    }

    // Method to add a virus signature
    public void addVirusSignature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter virus signature name: ");
        String name = scanner.nextLine();
        System.out.print("Enter virus signature description: ");
        String description = scanner.nextLine();
        System.out.print("Enter virus signature: ");
        String signature = scanner.nextLine();

        VirusSignature virusSignature = new VirusSignature(name, description, signature);
        virusDefinitions.addVirusSignature(virusSignature);
        System.out.println("Virus signature added successfully!");
    }

    // Method to view all virus signatures
    public void viewVirusSignatures() {
        List<VirusSignature> virusSignatures = virusDefinitions.getVirusSignatures();
        for (VirusSignature virusSignature : virusSignatures) {
            System.out.println("Name: " + virusSignature.getName());
            System.out.println("Description: " + virusSignature.getDescription());
            System.out.println("Signature: " + virusSignature.getSignature());
            System.out.println();
        }
    }

    // Method to search for a virus signature
    public void searchVirusSignature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter virus signature name to search: ");
        String name = scanner.nextLine();

        VirusSignature virusSignature = virusDefinitions.searchVirusSignature(name);
        if (virusSignature != null) {
            System.out.println("Name: " + virusSignature.getName());
            System.out.println("Description: " + virusSignature.getDescription());
            System.out.println("Signature: " + virusSignature.getSignature());
        } else {
            System.out.println("Virus signature not found!");
        }
    }

    // Method to run the API
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add virus signature");
            System.out.println("2. View all virus signatures");
            System.out.println("3. Search for a virus signature");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    addVirusSignature();
                    break;
                case 2:
                    viewVirusSignatures();
                    break;
                case 3:
                    searchVirusSignature();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}