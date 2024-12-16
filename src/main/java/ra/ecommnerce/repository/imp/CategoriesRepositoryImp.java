package ra.ecommnerce.repository.imp;

import ra.ecommnerce.entity.Categories;
import ra.ecommnerce.repository.CategoriesRepository;
import ra.ecommnerce.util.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CategoriesRepositoryImp implements CategoriesRepository {

    @Override
    public List<Categories> findAll() {
        Connection con = null;
        CallableStatement callSt = null;
        List<Categories> ListCategories = null;
        try {
            con = ConnectionDB.openConnection();
            callSt = con.prepareCall("{call find_all_categories()}");
            ResultSet rs = callSt.executeQuery();
            ListCategories = new ArrayList<>();
            while (rs.next()) {
                Categories catalog = new Categories();
                catalog.setCatalog_id(rs.getInt("catalog_id"));
                catalog.setCatalog_name(rs.getString("catalog_name"));
                catalog.setCatalog_description(rs.getString("catalog_description"));
                catalog.setCatalog_status(rs.getBoolean("catalog_status"));
                ListCategories.add(catalog);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(con,callSt);
        }
        return ListCategories;
    }
}
