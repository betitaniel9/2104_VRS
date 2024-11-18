import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookmarkManager {
    private Connection connection;

    public BookmarkManager(Connection connection) {
        this.connection = connection;
    }

    public void addBookmark(int userId, int vehicleId) throws SQLException {
        String sql = "INSERT INTO bookmarks (user_id, vehicle_id) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, userId);
        preparedStatement.setInt(2, vehicleId);
        preparedStatement.executeUpdate();
        System.out.println("Vehicle bookmarked successfully!");
    }
}