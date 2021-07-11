package components.row_mappers;

import models.Purchase_DB;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PurchaseRowMapper implements RowMapper<Purchase_DB> {

    @Override
    public Purchase_DB mapRow(ResultSet resultSet, int i) throws SQLException {

        Purchase_DB purchaseDB = new Purchase_DB();

        purchaseDB.setPurchase_name(resultSet.getString("purchase_name"));
        purchaseDB.setPurchase_type(resultSet.getString("purchase_type"));
        purchaseDB.setPurchase_cost(resultSet.getFloat("purchase_cost"));
        purchaseDB.setCount(resultSet.getInt("count"));
        purchaseDB.setDay(resultSet.getDate("day"));

        return purchaseDB;
    }
}
