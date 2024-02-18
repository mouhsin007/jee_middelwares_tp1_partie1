package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationDynamic {
    public static void main(String[] args) {
        try {
            Scanner scanner= new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao= (IDao) cDao.getConstructor().newInstance();

            String metierClassName = scanner.nextLine();
            Class cMetier = Class.forName(metierClassName);
            IMetier metier= (IMetier) cMetier.getConstructor().newInstance();

            Method setMethod = cMetier.getDeclaredMethod("setDao",IDao.class);
            setMethod.invoke(metier,dao);
            System.out.println(metier.calcul());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
