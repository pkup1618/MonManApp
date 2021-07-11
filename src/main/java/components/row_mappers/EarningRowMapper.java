package components.row_mappers;

import models.Earning_DB;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EarningRowMapper implements RowMapper<Earning_DB> {

    @Override
    public Earning_DB mapRow(ResultSet resultSet, int i) throws SQLException {

        Earning_DB earningDB = new Earning_DB();

        earningDB.setEarning_name(resultSet.getString("earning_name"));
        earningDB.setEarning_type(resultSet.getString("earning_type"));
        earningDB.setEarning_cost(resultSet.getFloat("earning_cost"));
        earningDB.setCount(resultSet.getInt("count"));
        earningDB.setDay(resultSet.getDate("day"));

        return earningDB;
    }
}
