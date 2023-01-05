
package ec.edu.espe.InClass.controller;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Projections;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import ec.edu.espe.InClass.model.Teacher;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class DataBaseManager {
    
    public static void addTeacher(Teacher teacher, MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        String name;
        String id;
        int tutorship;
        try {
            System.out.print("Teacher name: ");
            name = sc.nextLine();
            teacher.setName(name);
            System.out.print("Teacher id: ");
            id = sc.nextLine();
            teacher.setId(id);
            System.out.print("Tutorships Number: ");
            tutorship = sc.nextInt();
            teacher.setTutorship(tutorship);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Data was not saved");
        }
        try {
            InsertOneResult result = collection.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("name", teacher.getName())
                    .append("id", teacher.getId())
                    .append("tutorship", teacher.getTutorship()));

            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }

    public static void findTeacher(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        String nameToFind = "";
        try {
            System.out.print("type name to find: ");
            nameToFind = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "id", "tutorship"),
                Projections.excludeId());
        Document teacherFind = (Document) collection.find(eq("name", nameToFind))
                .projection(projectionFields)
                .first();
        if (teacherFind == null) {
            System.out.println("No results found.");
        } else {
            System.out.println(teacherFind.toJson());
        }
    }

    public static void updateTeacher(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int optionFind = 0;
        String teacherToUpdate = "";
        try {
            System.out.print("type teacher's name to update: ");
            teacherToUpdate = sc.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "id", "tutorship"),
                Projections.excludeId());
        Document doc = (Document) collection.find(eq("name", teacherToUpdate))
                .projection(projectionFields)
                .first();
        if (doc == null) {
            System.out.println("No results found.");
        } else {
            Document teacher = new Document().append("name", teacherToUpdate);

            while (optionFind != 4) {

                System.out.println("1. Name");
                System.out.println("2. ID");
                System.out.println("3. Tutorships Number");
                System.out.println("4. Return");

                System.out.print("Please choose an option: ");
                try {
                    optionFind = sc.nextInt();
                } catch (Exception e) {
                    optionFind = 0;
                }
                sc.nextLine();
                switch (optionFind) {
                    case 1 -> {
                        String nameUpdated;

                        System.out.print("type the new name: ");
                        nameUpdated = sc.nextLine();

                        Bson updates = Updates.combine(
                                Updates.set("name", nameUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(teacher, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 2 -> {
                        String idUpdated;

                        System.out.print("type the new id: ");
                        idUpdated = sc.nextLine();

                        Bson updates = Updates.combine(
                                Updates.set("id", idUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(teacher, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 3 -> {
                        int tutorshipUpdated;

                        System.out.print("type the new tutorship Number: ");
                        tutorshipUpdated = sc.nextInt();

                        Bson updates = Updates.combine(
                                Updates.set("tutorshipNumber", tutorshipUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(teacher, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 4 -> {

                    }
                    default ->
                        System.out.println("Error: Invalid option try again.");

                }
            }
        }
    }

    public static void deleteTeacher(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int teacherToDelete = 0;
        try {
            System.out.print("type teacher's id to delete: ");
            teacherToDelete = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "id", "tutorship"),
                Projections.excludeId());
        Document doc = (Document) collection.find(eq("id", teacherToDelete))
                .projection(projectionFields)
                .first();
        if (doc == null) {
            System.out.println("No results found.");
        } else {
            Bson teacherDelete = eq("id", teacherToDelete);
            try {
                DeleteResult result = collection.deleteOne(teacherDelete);
                System.out.println("Deleted document count: " + result.getDeletedCount());
            } catch (MongoException me) {
                System.err.println("Unable to delete due to an error: " + me);
            }
        }
    }

    public static void printTeacher(MongoCollection collection) {
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void calculateTotalTutorships(MongoCollection collectionTeacher, MongoCollection collectionTotalTutorships) {
        ArrayList<Teacher> teachers;
        ArrayList<Object> listObjects;
        listObjects = new ArrayList<>();
        int totalTutorshipNumber = 0;
        LocalDate now = LocalDate.now();

        try ( MongoCursor<Document> cursor = collectionTeacher.find().iterator()) {
            while (cursor.hasNext()) {
                listObjects.add(cursor.next().values().toArray());
            }
        }

        teachers = Teacher.read(listObjects);

        for (int i = 0; i < teachers.size(); i++) {
            totalTutorshipNumber += teachers.get(i).getTutorship();
        }

        try {
            InsertOneResult result = collectionTotalTutorships.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("date", now.format(DateTimeFormatter.ISO_DATE))
                    .append("totalTeacher", collectionTeacher.countDocuments())
                    .append("totalTutorshipNumber", totalTutorshipNumber));

            System.out.println("The total number of tutorships is : " + totalTutorshipNumber);
            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }

}
