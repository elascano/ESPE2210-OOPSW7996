package ec.edu.espe.inclass.controller;

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
import ec.edu.espe.inclass.model.Course;
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
 * @author Alexander Guaman, Developer Bears, DCCO-ESPE
 */
public class DataBaseManager {

    public static void addCourse(Course course, MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        String name;
        int nrc;
        int studentNumber;
        try {
            System.out.print("type name's course: ");
            name = sc.nextLine();
            course.setName(name);
            System.out.print("type nrc's course: ");
            nrc = sc.nextInt();
            course.setNrc(nrc);
            System.out.print("type student Number: ");
            studentNumber = sc.nextInt();
            course.setStudentNumber(studentNumber);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Data not saved");
        }
        try {
            InsertOneResult result = collection.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("name", course.getName())
                    .append("nrc", course.getNrc())
                    .append("studentNumber", course.getStudentNumber()));

            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }

    }

    public static void findCourse(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int nrcToFind = 0;
        try {
            System.out.print("type nrc to find: ");
            nrcToFind = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "nrc", "studentNumber"),
                Projections.excludeId());
        Document courseFind = (Document) collection.find(eq("nrc", nrcToFind))
                .projection(projectionFields)
                .first();
        if (courseFind == null) {
            System.out.println("No results found.");
        } else {
            System.out.println(courseFind.toJson());
        }
    }

    public static void updateCourse(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int optionFind = 0;
        int courseToUpdate = 0;
        try {
            System.out.print("type nrc's course to update: ");
            courseToUpdate = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "nrc", "studentNumber"),
                Projections.excludeId());
        Document doc = (Document) collection.find(eq("nrc", courseToUpdate))
                .projection(projectionFields)
                .first();
        if (doc == null) {
            System.out.println("No results found.");
        } else {
            Document course = new Document().append("nrc", courseToUpdate);

            while (optionFind != 4) {

                System.out.println("1. Nrc");
                System.out.println("2. Name");
                System.out.println("3. Student Number");
                System.out.println("4. return");

                System.out.print("Choose an option: ");
                try {
                    optionFind = sc.nextInt();
                } catch (Exception e) {
                    optionFind = 0;
                }
                sc.nextLine();
                switch (optionFind) {
                    case 1 -> {
                        int nrcUpdated;

                        //nrc
                        System.out.print("type the new nrc: ");
                        nrcUpdated = sc.nextInt();

                        Bson updates = Updates.combine(
                                Updates.set("nrc", nrcUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(course, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 2 -> {
                        String nameUpdated;

                        //name
                        System.out.print("type the new name: ");
                        nameUpdated = sc.nextLine();

                        Bson updates = Updates.combine(
                                Updates.set("name", nameUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(course, updates, options);
                            System.out.println("Modified document count: " + result.getModifiedCount());
                            System.out.println("Upserted id: " + result.getUpsertedId());
                        } catch (MongoException me) {
                            System.err.println("Unable to update due to an error: " + me);
                        }
                    }
                    case 3 -> {
                        int studentNumberUpdated;

                        //student Number
                        System.out.print("type the new studen Number: ");
                        studentNumberUpdated = sc.nextInt();

                        Bson updates = Updates.combine(
                                Updates.set("studentNumber", studentNumberUpdated));
                        UpdateOptions options = new UpdateOptions().upsert(true);
                        try {
                            UpdateResult result = collection.updateOne(course, updates, options);
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

    public static void deleteCourse(MongoCollection collection) {
        Scanner sc = new Scanner(System.in);
        int courseToDelete = 0;
        try {
            System.out.print("type nrc's course to delete: ");
            courseToDelete = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }

        Bson projectionFields = Projections.fields(
                Projections.include("name", "nrc", "studentNumber"),
                Projections.excludeId());
        Document doc = (Document) collection.find(eq("nrc", courseToDelete))
                .projection(projectionFields)
                .first();
        if (doc == null) {
            System.out.println("No results found.");
        } else {
            Bson courseDelete = eq("nrc", courseToDelete);
            try {
                DeleteResult result = collection.deleteOne(courseDelete);
                System.out.println("Deleted document count: " + result.getDeletedCount());
            } catch (MongoException me) {
                System.err.println("Unable to delete due to an error: " + me);
            }
        }
    }

    public static void printCourses(MongoCollection collection) {
        FindIterable<Document> iterDoc = collection.find();
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void calculateTotalStudents(MongoCollection collectionCourse, MongoCollection collectionTotalStudents) {
        ArrayList<Course> courses;
        ArrayList<Object> listObjects;
        listObjects = new ArrayList<>();
        int totalNumberStudent = 0;
        LocalDate now = LocalDate.now();

        try ( MongoCursor<Document> cursor = collectionCourse.find().iterator()) {
            while (cursor.hasNext()) {
                listObjects.add(cursor.next().values().toArray());
            }
        }

        courses = Course.read(listObjects);

        for (int i = 0; i < courses.size(); i++) {
            totalNumberStudent += courses.get(i).getStudentNumber();
        }

        try {
            InsertOneResult result = collectionTotalStudents.insertOne(new Document()
                    .append("_id", new ObjectId())
                    .append("date", now.format(DateTimeFormatter.ISO_DATE))
                    .append("totalCourses", collectionCourse.countDocuments())
                    .append("totalNumberStudents", totalNumberStudent));

            System.out.println("The total number of students is : " + totalNumberStudent);
            System.out.println("Success! Inserted document id: " + result.getInsertedId());

        } catch (MongoException me) {
            System.err.println("Unable to insert due to an error: " + me);
        }
    }

}
