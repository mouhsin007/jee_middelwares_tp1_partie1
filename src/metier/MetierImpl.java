package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao;

    @Override
    public double calcul() {
        double t = dao.getData();
        return t*99;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
