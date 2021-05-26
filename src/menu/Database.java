package menu;

import menu.Character;

import java.sql.*;


public class Database {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

 //  --------------------------------------    CONFIG to CONNECT ---------------------------------------

    public Database() {
        try {
           // Class.forName("org.mariadb.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/rdK", "root", "");

        } catch (Exception e) {
            System.out.println(" ! ! ! ! !  NOTHING HERE ! ! ! ! ! !");
        }
    }

    //  --------------------------------------  SQL QUERY ---------------------------------------

    public void showAllHeroes() {
        try {
            this.statement = connection.createStatement();
            this.resultSet = null;
        resultSet = statement.executeQuery("SELECT * from players");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(3));
            }
        }
        catch (SQLException e) {
            System.out.println("There are no Heroes around here...");
        }
    }
    //------------------------------------ GETTERS & SETTERS  ------------------------------------------

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }


//------------------------------------               END               ---------------------------------
}
