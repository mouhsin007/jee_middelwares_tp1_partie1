package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationStatic {
    public static void main(String[] args) {
        //Instanciation static
        DaoImpl dao= new DaoImpl();
        MetierImpl metier= new MetierImpl();
        metier.setDao(dao);
        System.out.println("result= "+metier.calcul());


    }
}
