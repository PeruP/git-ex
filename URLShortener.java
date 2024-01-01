import java.util.*;
public class URLShortener {
    static Map<String, String> shortToLong = new HashMap<>();
    static Map<String, String> longToShort = new HashMap<>();
    static int count = 0;
    public static void shortenURL(String longURL) {
        String shortCode;
        if(longToShort.containsKey(longURL)){
            shortCode=longToShort.get(longURL);
        }
        else{
            shortCode = generateShortCode();
            shortToLong.put(shortCode, longURL);
            longToShort.put(longURL,shortCode);
        }
        System.out.println("Shortened URL: " + shortCode);
    }
    public static void retrieveURL(String shortCode) {
        if (shortToLong.containsKey(shortCode)) {
            System.out.println("Original URL: " + shortToLong.get(shortCode));
        } 
        else {
            System.out.println("URL not found for the given short code.");
        }
    }
    public static String generateShortCode() {
        count++;
        return "http://shortened-url/" + (count%100000);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nURL Shortener Console Application");
            System.out.println("1. Shorten URL");
            System.out.println("2. Retrieve URL");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter the long url : ");
                    String longURL=sc.nextLine();
                    shortenURL(longURL);
                    break;
                case 2:
                    System.out.print("Enter the short url: ");
                    String shortCode = sc.nextLine();
                    retrieveURL(shortCode);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}