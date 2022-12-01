/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.cameravideo.view;

import com.googleimport import static ec.edu.espe.videocamera.controller.FilesControl.readFile;
import ec.edu.espe.videocamera.model.VideoCamera;
import java.util.ArrayList;
import java.util.Scanner;
import ec.edu.espe.videocamgson.Gson;
import ec.edu.espe.videocamera.model.VideoCamera;
import java.io.*;
import java.util.*;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class VideoCameraRecordsSimulator {
    
    public static void main(String[] args) {
        var fileName = "cameraroll.json";
        var fileToLoadName = "cameraLoad.json";
        int id;
        
        VideoCamera video;
        ArrayList<VideoCamera> videos = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("\t========================");
        System.out.println("\t     Bernardo Aldaz     ");
        System.out.println("\t   Video Camera System  ");
        System.out.println("\t========================");
        
        int menuOption;
        try {
            do {
                System.out.println("---------------------------------------");
                System.out.println("-                MENU                 -");
                System.out.println("---------------------------------------");
                System.out.println("1.\tSave your video");
                System.out.println("2.\tSearch a video");
                System.out.println("3.\tReproduce your video");
                System.out.println("0.\tExit\n");
                System.out.print("-----Select just one option please-----");

                menuOption = scan.nextInt();

                switch (menuOption) {
                    case 1 -> {
                        video = addVideo();
                        System.out.println(video);
                        if (video != null) {
                            System.out.println(video);
                            videos.add(video);
                            
                            Collections.sort(videos, new Comparator<VideoCamera>() {
                                @Override
                                public int compare(VideoCamera c1, VideoCamera c2) {
                                    return Integer.valueOf(c1.getVideo()).compareTo(c2.getVideo());
                                }
                            });
                            System.out.println(video);
                            System.out.println("VIDEO ADDED");
                            writeJson(videos, fileName);
                        }
                    }
                    case 2 -> {
                        try {
                            System.out.print("Enter Record: ");
                            id = scan.nextInt();
                            searchVideo(fileName,id);
                        } catch (Exception e) {
                            System.out.println("PLEASE ENTER CORRECT INFO");
                        }
                    }
                    case 3 -> readFile(fileName);

                    case 0 -> System.out.println("\nYOU HAVE EXIT\n");
                    default -> System.out.println("\nINVALID OPTION\n");
                }
            } while (menuOption != 0);
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("\n NO VALID DATA, CLOSING PROGRAM");
        }
        
    }

    static VideoCamera addVideo() {
        Scanner scan = new Scanner(System.in);
        var fileName = "cameraroll.json";
        String[] data;
        
        VideoCamera newVideo = new VideoCamera(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]),);
        
        int video;
        String recordName = new String("");
        int durationVideo;

        
        try {
            System.out.print("Enter number of your video: ");
            video = scan.nextInt();
            System.out.print("Enter name of video: ");
            recordName = scan.next();
            System.out.print("..:: Enter the duration of your video");
            durationVideo = scan.next();
            System.out.print("..:: Enter chicken age: ");

            }
            newVideo = new VideoCamera(video, recordName, durationVideo);
            
            printVideo(newVideo);
        return null;
            
        }

    private static void searchVideo(String fileName, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void printVideo(VideoCamera newVideo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
catch (Exception e) {
            System.out.println("\n PLEASE ENTER VALID DATA\n");
        }
        return newVideo;

    private static class newVideo {

        public newVideo() {
        }
    }
   }
    
      }
}
    }

    private static void searchVideo(String fileName, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static VideoCamera addVideo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class videos {

        public videos() {
        }
    }
    
}