package ec.edu.espe.AirporTaxiScheduling.utils;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.AirporTaxiScheduling.model.Accounting;
import ec.edu.espe.AirporTaxiScheduling.model.IdValidatorClass;
import ec.edu.espe.AirporTaxiScheduling.model.ObtainIdClass;
import ec.edu.espe.AirporTaxiScheduling.model.TarifSingleton;
import ec.edu.espe.AirporTaxiScheduling.model.Travel;
import ec.edu.espe.AirporTaxiScheduling.model.TravelerTest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Yaranga,Progress Team, DCCO-ESPE
 */
public class FileManager extends DataPersistence {

          private static Gson normalGson = new Gson();

          @Override
          public void save() {

          }

          public static void addTravelsToJson(ArrayList<Travel> travels) {

                    File travelsListFile = new File("travelsList.json");

                    JsonArray jsonArray = new JsonArray();
                    for (int i = 0; i < travels.size(); i++) {
                              jsonArray.add(normalGson.toJsonTree(travels.get(i)));
                    }

                    try {
                              PrintWriter writer = new PrintWriter(new FileWriter(travelsListFile, false));
                              writer.print(jsonArray);
                              writer.close();
                    } catch (FileNotFoundException ex) {
                              ex.printStackTrace(System.out);
                    } catch (IOException ex) {
                              ex.printStackTrace(System.out);
                    }
          }

          @Override
          public void load() {
          }

          public static ArrayList<Travel> loadFromJsonFile() {
                    ArrayList<Travel> travels = new ArrayList<Travel>();
                    Gson gson = new Gson();
                    JsonArray jsonArray = new JsonArray();
                    File travelsListJson = new File("travelsList.json");
                    try {
                              BufferedReader reader = new BufferedReader(new FileReader(travelsListJson));
                              String lineOfTheFile = "";
                              String json = "";
                              while ((lineOfTheFile = reader.readLine()) != null) {
                                        json += lineOfTheFile;
                              }

                              jsonArray = gson.fromJson(json, JsonArray.class);

                              for (int i = 0; i < jsonArray.size(); i++) {
                                        travels.add(i, gson.fromJson(jsonArray.get(i), Travel.class));
                              }
                              reader.close();
                    } catch (FileNotFoundException ex) {
                              ex.printStackTrace(System.out);
                    } catch (IOException ex) {
                              ex.printStackTrace(System.out);
                    }
                    return travels;
          }

          private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

          public static void editJson(Accounting accounting, String jsonName) {
                    File fileJson = new File(jsonName);
                    ArrayList<Accounting> valuesTestList = new ArrayList<>();
                    valuesTestList = readJson(valuesTestList, jsonName);
                    valuesTestList.add(accounting);
                    String json = gson.toJson(valuesTestList);

                    try ( FileWriter writer = new FileWriter(fileJson)) {
                              writer.write(json);
                    } catch (FileNotFoundException e) {
                              e.printStackTrace(System.out);
                    } catch (IOException e) {
                              e.printStackTrace(System.out);
                    }
          }

          public static ArrayList<Accounting> readJson(ArrayList<Accounting> valuesTestList, String fileJson) {
                    Gson gson = new Gson();
                    File file = new File(fileJson);
                    if (file.length() == 0) {
                              try ( FileWriter writer = new FileWriter(fileJson)) {
                                        writer.write("[]");
                              } catch (IOException ex1) {
                                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex1);
                              }
                    } else {
                              try {
                                        Reader reader = Files.newBufferedReader(Paths.get(fileJson));
                                        TypeToken<ArrayList<Accounting>> type = new TypeToken<ArrayList<Accounting>>() {
                                        };
                                        valuesTestList = gson.fromJson(reader, type.getType());
                                        reader.close();
                              } catch (FileNotFoundException ex) {
                                        System.out.println("File not Found");
                              } catch (IOException ex) {
                                        System.out.println("IOException");
                              }
                    }

                    return valuesTestList;
          }

          public static ArrayList<IdValidatorClass> readJsonIdValidator(ArrayList<IdValidatorClass> valuesTestList, String fileJson) {
                    Gson gson = new Gson();
                    File file = new File(fileJson);
                    if (file.length() == 0) {
                              try ( FileWriter writer = new FileWriter(fileJson)) {
                                        writer.write("[]");
                              } catch (IOException ex1) {
                                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex1);
                              }
                    } else {
                              try {
                                        Reader reader = Files.newBufferedReader(Paths.get(fileJson));
                                        TypeToken<ArrayList<IdValidatorClass>> type = new TypeToken<ArrayList<IdValidatorClass>>() {
                                        };
                                        valuesTestList = gson.fromJson(reader, type.getType());
                                        reader.close();
                              } catch (FileNotFoundException ex) {
                                        System.out.println("File not Found");
                              } catch (IOException ex) {
                                        System.out.println("IOException");
                              }
                    }

                    return valuesTestList;
          }

          public static ArrayList<TravelerTest> readJsonTraveler(ArrayList<TravelerTest> valuesTestList, String fileJson) {
                    Gson gson = new Gson();
                    File file = new File(fileJson);
                    if (file.length() == 0) {
                              try ( FileWriter writer = new FileWriter(fileJson)) {
                                        writer.write("[]");
                              } catch (IOException ex1) {
                                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex1);
                              }
                    } else {
                              try {
                                        Reader reader = Files.newBufferedReader(Paths.get(fileJson));
                                        TypeToken<ArrayList<TravelerTest>> type = new TypeToken<ArrayList<TravelerTest>>() {
                                        };
                                        valuesTestList = gson.fromJson(reader, type.getType());
                                        reader.close();
                              } catch (FileNotFoundException ex) {
                                        System.out.println("File not Found");
                              } catch (IOException ex) {
                                        System.out.println("IOException");
                              }
                    }

                    return valuesTestList;
          }

          public static ArrayList<ObtainIdClass> readJsonId(ArrayList<ObtainIdClass> valuesTestList, String fileJson) {
                    Gson gson = new Gson();
                    File file = new File(fileJson);
                    if (file.length() == 0) {
                              try ( FileWriter writer = new FileWriter(fileJson)) {
                                        writer.write("[]");
                              } catch (IOException ex1) {
                                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex1);
                              }
                    } else {
                              try {
                                        Reader reader = Files.newBufferedReader(Paths.get(fileJson));
                                        TypeToken<ArrayList<ObtainIdClass>> type = new TypeToken<ArrayList<ObtainIdClass>>() {
                                        };
                                        valuesTestList = gson.fromJson(reader, type.getType());
                                        reader.close();
                              } catch (FileNotFoundException ex) {
                                        System.out.println("File not Found");
                              } catch (IOException ex) {
                                        System.out.println("IOException");
                              }
                    }

                    return valuesTestList;
          }

          public static ArrayList<TarifSingleton> readJsonTarif (ArrayList<TarifSingleton> valuesTestList, String fileJson) {
                    Gson gson = new Gson();
                    File file = new File(fileJson);
                    if (file.length() == 0) {
                              try ( FileWriter writer = new FileWriter(fileJson)) {
                                        writer.write("[]");
                              } catch (IOException ex1) {
                                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex1);
                              }
                    } else {
                              try {
                                        Reader reader = Files.newBufferedReader(Paths.get(fileJson));
                                        TypeToken<ArrayList<TarifSingleton>> type = new TypeToken<ArrayList<TarifSingleton>>() {
                                        };
                                        valuesTestList = gson.fromJson(reader, type.getType());
                                        reader.close();
                              } catch (FileNotFoundException ex) {
                                        System.out.println("File not Found");
                              } catch (IOException ex) {
                                        System.out.println("IOException");
                              }
                    }

                    return valuesTestList;
          }
}
