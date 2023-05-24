import java.util.Random;



public class ServerNameGenerator {
// create 2 arrays [10adjectives], [10nouns]
    private static final String[] adjectives = {
      "Might" ,"Savage", "Fierce" ,"Dominant", "Fearless" ,"Undeniable", "Unstoppable", "Epic" ,"Supreme", "Legendary"
};
    private static final String[] nouns = {
    "Champion", "Warrior", "Gladiator" ,"Titan", "Conqueror" ,"Phenom", "Punisher" ,"Enforcer", "Master" ,"Legend",
    };
    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);

        String serverName = adjective + "-" + noun;
        System.out.println("Generated server name: " + serverName);
    }

    public static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}

