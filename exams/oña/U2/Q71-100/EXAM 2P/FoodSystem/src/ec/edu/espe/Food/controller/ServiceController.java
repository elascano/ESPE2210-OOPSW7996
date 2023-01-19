package ec.edu.espe.Food.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author GiftSoft TEAM, DCCO-ESPE
 */

public class ServiceController implements ServiceInterface{

    @Override
    public boolean Email(String email) {
        Pattern patron = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-"
        + "\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9]"
        + "(?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}"
        + "(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]"
        + "|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
        Matcher comparador = patron.matcher(email);
        return comparador.find();
    }

    @Override
    public Boolean Validar_CampoHora(String Hora) {
        boolean b;
        char[] a = Hora.toString().toCharArray();
        String[] c = Hora.split(":");
        if ((a[0] == ' ') ||  (a[1] == ' ') || (a[2] == ' ')
                || (a[3] == ' ') || (a[4] == ' ')
                || (getInteger(c[0]) > 24) || (getInteger(c[1]) > 59)){
            b = false;
        }else {
            b = true;
        }
        return b;
    }

    @Override
    public int getInteger(String valor) {
        int integer = Integer.parseInt(valor);
        return integer;
    }
}

