package ec.edu.espe.competitorregistration.controller;

import com.google.gson.Gson;
import com.mongodb.MongoException;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import ec.edu.espe.competitorregistration.model.*;
import java.util.ArrayList;
import java.util.Scanner;
import org.bson.*;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author Cristian Acalo, Scriptal, DCCO-ESPE
 */
public class mongoDBManager {

    public static void addClient() {
        Document client;
        Document averageCalculated;

        competitor = insertCompetitorData();

        if (competitor != null) {
            averageCalculated = calculateAverage(competitor);

            String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("oop");

                try {
                    System.out.println("Connected successfully to server.");

                    MongoCollection competitorsCollection = database.getCollection("Competitor");
                    MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                    competitorsCollection.insertOne(competitor);
                    averagedTimeCollection.insertOne(averageCalculated);

                    System.out.println("\n..:: The competitor " + competitor.get("name") + " with id: {" + competitor.get("id") +"} has been added ::..");

                } catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
        } else {
            System.out.println("..:: AN ERROR HAS OCURRED ::..");
        }
    }

    public static void findOneCompetitor() {
        try {
            Scanner sc = new Scanner(System.in);
            Document dataCompetitor;
            Document dataTimeAveraged;
            int idToSearch;

            System.out.print("..:: Insert the id to search: ");
            idToSearch = sc.nextInt();

            String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("oop");

                try {
                    System.out.println("Connected successfully to server.");

                    MongoCollection competitorsCollection = database.getCollection("Competitor");
                    MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                    Bson filter = Filters.and(Filters.eq("id", idToSearch));
                    dataCompetitor = (Document) competitorsCollection.find(filter).first();
                    dataTimeAveraged = (Document) averagedTimeCollection.find(filter).first();

                    if (dataCompetitor != null && dataTimeAveraged != null) {
                        System.out.println("---> " + dataCompetitor.toJson());
                        System.out.println("---> " + dataTimeAveraged.toJson());
                    } else {
                        System.out.println("..:: DATA NOT FOUND ::..");
                    }

                } catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
        } catch (Exception e) {
            System.out.println("..:: INVALID DATA, PLEASE TRY AGAIN ::..");
        }

    }

    public static void printCompetitors() {
        String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
        try ( MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("oop");

            try {
                System.out.println("Connected successfully to server.");

                MongoCollection competitorsCollection = database.getCollection("Competitor");
                MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                Bson filter = Filters.and(Filters.gt("id", 0));

                MongoCursor<Document> competitors = competitorsCollection.find(filter).iterator();
                MongoCursor<Document> average = averagedTimeCollection.find(filter).iterator();

                try {
                    while (competitors.hasNext() && average.hasNext()) {
                        System.out.println(competitors.next().toJson());
                        System.out.println(average.next().toJson()+"\n");
                    }
                } finally {
                    competitors.close();
                    average.close();
                }

            } catch (MongoException me) {
                System.err.println("An error occurred while attempting to connect: " + me);
            }
        }
    }

    public static void updateCompetitor() {
        try {
            Scanner sc = new Scanner(System.in);
            int idToSearch;
            Document competitorExistance;
            int option;
            System.out.println("................................................\n");
            System.out.print("\n..:: Insert the id to update: ");
            idToSearch = sc.nextInt();

            String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("oop");

                try {
                    System.out.println("Connected successfully to server.");
                    MongoCollection competitorsCollection = database.getCollection("Competitor");

                    Bson filter = Filters.and(Filters.eq("id", idToSearch));
                    competitorExistance = (Document) competitorsCollection.find(filter).first();

                    if (competitorExistance != null) {
                        do {
                            System.out.println("************************************************");
                            System.out.println("*                                              *");
                            System.out.println("*     ..:: What do you want to update? ::..    *");
                            System.out.println("*\t\t1. Competitor name             *");
                            System.out.println("*\t\t2. Competitor times            *");
                            System.out.println("*\t\t0. Exit                        *");
                            System.out.println("*                                              *");
                            System.out.println("************************************************");
                            System.out.print("Select an option ======> ");
                            option = sc.nextInt();
                            System.out.println("................................................\n");
                            switch (option) {
                                case 1 ->
                                    updateNameCompetitor(idToSearch);

                                case 2 ->
                                    updateTimesCompetitor(idToSearch);

                                case 0 ->
                                    System.out.println("*** YOU HAVE EXITED SUCCESSFULLY ***");

                                default ->
                                    System.out.println("*** INVALID OPTION ***");

                            }
                        } while (option != 0);
                    } else {
                        System.out.println("..:: DATA TO UPDATE DOESN'T EXIST");
                    }
                } catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
        } catch (Exception e) {
            System.out.println("..:: INVALID DATA, PLEASE TRY AGAIN ::..");
        }
    }

    public static void deleteCompetitor() {
        try {
            Scanner sc = new Scanner(System.in);
            int idToSearch;
            Document competitorExistance;
            int option;

            System.out.print("\n..:: Insert the id to delete: ");
            idToSearch = sc.nextInt();

            String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
            
            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("oop");

                try {
                    System.out.println("Connected successfully to server.");
                    MongoCollection competitorsCollection = database.getCollection("Competitor");
                    MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");
                    
                    Bson filter = Filters.and(Filters.eq("id", idToSearch));
                    competitorExistance = (Document) competitorsCollection.find(filter).first();
                    
                    if (competitorExistance != null) {
                        competitorsCollection.findOneAndDelete(new Document("id",idToSearch));
                        averagedTimeCollection.findOneAndDelete(new Document("id",idToSearch));
                        System.out.println("..:: THE COMPETITOR WITH ID: {"+idToSearch+"} HAS BEEN SUCCESSFULLY DELETED ::..");
                    } else {
                        System.out.println("..:: DATA TO DELETE DOESN'T EXIST");
                    }
                } catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
        } catch (Exception e) {
            System.out.println("..:: INVALID DATA, PLEASE TRY AGAIN ::..");
        }
    }

    public static Document insertCompetitorData() {

        Scanner sc = new Scanner(System.in);
        Competitor competitor = new Competitor();
        String name;
        double time;
        ArrayList<Double> times = new ArrayList<>();
        int actualTime;
        int id;

        try {
            id = generateId();
            competitor.setId(id);
            System.out.println("................................................\n");

            System.out.print("..:: Insert the competitor's name:");
            name = sc.nextLine();
            competitor.setName(name);

            for (int i = 0; i < 3; i++) {
                actualTime = i + 1;
                System.out.print("..:: Insert the " + actualTime + "th time: ");
                time = sc.nextDouble();
                times.add(time);
            }

            competitor.setTimes(times);

            Document competitorDocument = new Document("_id", new ObjectId())
                    .append("id", competitor.getId())
                    .append("name", competitor.getName())
                    .append("times", competitor.getTimes());

            return competitorDocument;

        } catch (Exception e) {
            System.out.println("..:: INVALID DATA, PLEASE INSERT AGAIN ::..");
        }
        return null;
    }

    public static Document calculateAverage(Document competitor) {

        System.out.println("*******************************");
        Gson gson = new Gson();
        TimeAveraged average;

        ArrayList<Double> tiempos = new ArrayList<>();
        Double sumAverage = 0.0;

        average = new TimeAveraged(competitor.getInteger("id"), competitor.getString("name"), 0);

        tiempos = (ArrayList<Double>) competitor.get("times");

        for (int i = 0; i < tiempos.size(); i++) {
            sumAverage = sumAverage + tiempos.get(i);
        }

        sumAverage = sumAverage / tiempos.size();
        average.setTimeAveraged(sumAverage);
        return new Document("_id", new ObjectId())
                .append("id", average.getId())
                .append("name", average.getName())
                .append("average", average.getTimeAveraged());
    }

    public static int generateId() {
        int idGenerated;
        idGenerated = (int) (Math.random() * 9999 + 1000);
        return idGenerated;
    }

    public static void updateNameCompetitor(int idToSearch) {
        try {
            Scanner sc = new Scanner(System.in);
            String name;

            String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("oop");

                try {
                    System.out.println("Connected successfully to server.");

                    MongoCollection competitorsCollection = database.getCollection("Competitor");
                    MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                    Document idToSearchDocument = new Document("id", idToSearch);

                    System.out.print("..:: Insert new Competitor's name: ");
                    name = sc.nextLine();

                    Document updatedNameDocument = new Document("$set", new Document("name", name));
                    competitorsCollection.updateOne(idToSearchDocument, updatedNameDocument);
                    averagedTimeCollection.updateOne(idToSearchDocument, updatedNameDocument);
                    System.out.println("\n..:: NAME HAS BEEN UPDATED SUCCESFULLY ::..\n");
                } catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
        } catch (Exception e) {
            System.out.println("..:: INVALID DATA, PLEASE TRY AGAIN ::..");
        }
    }

    public static void updateTimesCompetitor(int idToSearch) {
        try {
            Scanner sc = new Scanner(System.in);

            double time;
            ArrayList<Double> times = new ArrayList<>();
            int actualTime;
            double sumTimes = 0.0;
            double updatedAverage;

            String uri = "mongodb+srv://duck:duck@cluster0.14yil8d.mongodb.net/?retryWrites=true&w=majority";
            try ( MongoClient mongoClient = MongoClients.create(uri)) {
                MongoDatabase database = mongoClient.getDatabase("oop");

                try {
                    System.out.println("Connected successfully to server.");

                    MongoCollection competitorsCollection = database.getCollection("Competitor");
                    MongoCollection averagedTimeCollection = database.getCollection("AveragedTime");

                    Document idToSearchDocument = new Document("id", idToSearch);
                    for (int i = 0; i < 3; i++) {
                        actualTime = i + 1;
                        System.out.print("..:: Insert the " + actualTime + "th time: ");
                        time = sc.nextDouble();
                        sumTimes = sumTimes + time;
                        times.add(time);
                    }
                    updatedAverage = sumTimes / times.size();

                    Document updatedAverageDocument = new Document("$set", new Document("average", updatedAverage));
                    Document updatedTimesDocument = new Document("$set", new Document("times", times));
                    averagedTimeCollection.updateOne(idToSearchDocument, updatedAverageDocument);
                    competitorsCollection.updateOne(idToSearchDocument, updatedTimesDocument);
                    System.out.println("\n..:: TIME HAVE BEEN UPDATED SUCCESFULLY ::..\n");
                } catch (MongoException me) {
                    System.err.println("An error occurred while attempting to connect: " + me);
                }
            }
        } catch (Exception e) {
            System.out.println("..:: INVALID DATA, PLEASE TRY AGAIN ::..");
        }
    }

}
