package ec.edu.espe.cellphone.utils;

/**
 *
 * @author Barrionuevo Lindsay, DeltaTeam, DCCO-ESPE
 */
public class HelpException {

    public HelpException() {
    }

    public void validateAddAnother(String addCellphoneNew) throws MessageException {
        if (!"y".equals(addCellphoneNew.toLowerCase())&&!"n".equals(addCellphoneNew.toLowerCase())) {
            throw new MessageException("Wrong letter!");
    }
   }
}
