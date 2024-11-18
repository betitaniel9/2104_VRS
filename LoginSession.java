public class LoginSession {
    private static int loggedInUserId = -1;  // Default value (no user logged in)

    // Get the logged-in user ID
    public static int getLoggedInUserId() {
        return loggedInUserId;
    }

    // Set the logged-in user ID
    public static void setLoggedInUserId(int userId) {
        loggedInUserId = userId;
    }

    // Check if a user is logged in
    public static boolean isUserLoggedIn() {
        return loggedInUserId != -1;
    }
}