public class Main {
    public static void main(String[] args) {
        VirusDefinitions virusDefinitions = new VirusDefinitions();
        VirusDefinitionsAPI virusDefinitionsAPI = new VirusDefinitionsAPI(virusDefinitions);
        virusDefinitionsAPI.run();
    }
}