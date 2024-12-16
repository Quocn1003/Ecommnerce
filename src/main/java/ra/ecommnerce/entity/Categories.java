package ra.ecommnerce.entity;

public class Categories {
    private int catalog_id;
    private String catalog_name;
    private String catalog_description;
    private boolean catalog_status;

    public Categories() {
    }

    public Categories(int catalog_id, String catalog_name, String catalog_description, boolean catalog_status) {
        this.catalog_id = catalog_id;
        this.catalog_name = catalog_name;
        this.catalog_description = catalog_description;
        this.catalog_status = catalog_status;
    }

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    public String getCatalog_name() {
        return catalog_name;
    }

    public void setCatalog_name(String catalog_name) {
        this.catalog_name = catalog_name;
    }

    public String getCatalog_description() {
        return catalog_description;
    }

    public void setCatalog_description(String catalog_description) {
        this.catalog_description = catalog_description;
    }

    public boolean isCatalog_status() {
        return catalog_status;
    }

    public void setCatalog_status(boolean catalog_status) {
        this.catalog_status = catalog_status;
    }
}
