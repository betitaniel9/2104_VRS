public class UserManager {
    private static int loggedInUserId;

    public static void login(int userId) {
        loggedInUserId = userId;  // Set the logged-in user ID
    }

    public static int getLoggedInUserId() {
        return loggedInUserId;  // Return the logged-in user ID
    }
}