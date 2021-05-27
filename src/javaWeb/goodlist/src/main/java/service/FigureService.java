package service;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import model.Figure;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FigureService {
    private final static DataSource dataSource;

    static {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setDatabaseName("2021-5-20");
        mysqlDataSource.setCharacterEncoding("utf8");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setServerTimezone("Asia/Shanghai");
        //mysqlDataSource.setURL("jdbc:mysql://127.0.0.1:3306/servlet_demo_java32?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai");
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("1231");

        dataSource = mysqlDataSource;
    }

    public List<Figure> getList() throws SQLException {
        String sql = "SELECT id, images_Url, title, brief FROM figures ORDER BY id";
        List<Figure> figureList = new ArrayList<>();
        try (Connection c = dataSource.getConnection()) {
            try (PreparedStatement s = c.prepareStatement(sql)) {
                try (ResultSet rs = s.executeQuery()) {
                    while (rs.next()) {
                        Figure figure = new Figure();
                        figure.id = rs.getInt("id");
                        figure.imageUrl = rs.getString("imageUrl");
                        figure.name = rs.getString("name");
                        figure.brief = rs.getString("brief");

                        figureList.add(figure);
                    }
                }
            }
        }

        return figureList;
    }
}
