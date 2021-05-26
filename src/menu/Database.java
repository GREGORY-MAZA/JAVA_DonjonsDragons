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
            this.connection = DriverManager.getConnection("jdbc:mariadb://localhost:3307/rdK", "root", "");
            this.statement = connection.createStatement();
            this.resultSet = null;


        } catch (Exception e) {
            System.out.println(" ! ! ! ! !  NOTHING HERE ! ! ! ! ! !");
        }
    }

    //  --------------------------------------  SQL QUERY ---------------------------------------

    public void showAllHeroes() {
        try {

            resultSet = statement.executeQuery("SELECT * from players");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("There are no Heroes around here...");
        }
    }

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

    public void saveHero(Character player) {

        {
            try {
                statement.executeUpdate("INSERT INTO players (name , health, power,weapon,defense) " +
                                "VALUES ('" + player.getName() + "' , '" + player.getDefaultHealth() + "' , '" + player.getDefaultAttack() + "' , '" + player.getAttackHand() + "' , '" + player.getDefenseHand() + "');",
                        Statement.RETURN_GENERATED_KEYS);
            } catch (Exception e) {
                System.out.println(" ! ! ! ! !  AIE ! ! ! ! ! !" + e);
            }

        }
        //------------------------------------ GETTERS & SETTERS  ------------------------------------------




//------------------------------------               END               ---------------------------------
    }
}
