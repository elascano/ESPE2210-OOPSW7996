package ec.edu.espe.CompositePattern.model;

/**
 *
 * @author Martín Suquillo, WebMasterTeam, DCCO-ESPE
 */
class SetUp {
    public static void main(String args[]){
        Teller lonny = new Teller(" Lonny");
        Clerk cal = new Clerk(" Cal");
        Manager able = new Manager(" Able");
        able.add(lonny);
        able.add(cal);
        
        Teller juanita = new Teller(" Juanita");
        Teller tina = new Teller(" Tina");
        Teller thelma = new Teller(" Thelma");
        Manager becky = new Manager(" Becky");
        becky.add(juanita);
        becky.add(tina);
        becky.add(thelma);
        
        President pete = President.getPresident(" Pete");
        pete.add(able);
        pete.add(becky);
        
        Client.employee = pete;
        Client.doClientTask();
    }
}
