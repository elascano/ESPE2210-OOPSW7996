
package ec.edu.espe.exam2.view;

/**
 *
 * @author Alex_22
 */
class MongoDB {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void saveProgrammingLanguages(ProgrammingLanguages enteredLanguages) {

        save(enteredLanguages);
    }

    public static void save(ProgrammingLanguages enteredLanguages) {
        String uri = "mongodb+srv://alextrejo:1402oop@cluster0.ydafxco.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Exam2_Programming_Languages");
            try {
                MongoCollection<Document> programmingLanguagesCollection = database.getCollection("Programming_Languages");

                Document programmingLanguagesNew = new Document("_id", new ObjectId())
                        .append("id", enteredLanguages.getId())
                        .append("nameOfTheProgrammingLanguage", enteredLanguages.getNameOfTheProgrammingLanguage())
                        .append("yearOfCreation", enteredLanguages.getYearOfCreation()
                                .append("nameOfTheCreator", enteredLanguages.getNameOfTheCreator()));

                programmingLanguagesCollection.insertOne(programmingLanguagesNew);

            } catch (MongoException me) {
                System.out.println("An error occurred while attempting to connect: " + me);
            }
        }
    }
    
}
