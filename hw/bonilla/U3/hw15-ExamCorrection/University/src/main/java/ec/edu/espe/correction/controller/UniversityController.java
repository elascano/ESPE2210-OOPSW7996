
package ec.edu.espe.correction.controller;
import ec.edu.espe.correction.model.University;
import org.bson.Document;


/**
 *
 * @author Jairo Bonilla, Gaman GeekLords, DCCO-ESPE
 */
public class UniversityController
{
     public static Document insertUniverstyDocument(University university)
     {
        Document document;
        document=new Document("University Name", university.getNombre()).append("Id:", university.getId()).append("Ranking", university.getRanking());
        return document;
     }
}
