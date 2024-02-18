package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("from data base");
        return 23;
    }
}
