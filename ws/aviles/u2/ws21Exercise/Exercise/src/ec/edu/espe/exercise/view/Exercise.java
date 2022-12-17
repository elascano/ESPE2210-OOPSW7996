package ec.edu.espe.exercise.view;

import ec.edu.espe.exercise.model.SoundMixer;
import ec.edu.espe.exercise.controller.FileManager;
import ec.edu.espe.exercise.model.SoundMixer;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Daniel Aviles, DeltaTeam, DCCO-ESPE
 */
public class Exercise {

    public static void main(String[] args) throws IOException {
        ArrayList<SoundMixer> soundMixers;
        soundMixers = new ArrayList();
        int position;
        int option = 0;
        soundMixers = FileManager.readJson(soundMixers);
        do {
            System.out.println("\n==================================");
            System.out.println("1. Enter new Sound Mixer  ");
            System.out.println("2. Delete a Sound Mixer");
            System.out.println("3. Update a Sound Mixer");
            System.out.println("4. View Sound Mixers information");
            System.out.println("5. Exit and Save  ");
            System.out.println("==================================\n");
            option = FileManager.chooseOption(option);
            switch (option) {
                case 1:
                    soundMixers = FileManager.addSoundMixer(soundMixers);
                    FileManager.writeJson(soundMixers);
                    break;
                case 2:
                    position = FileManager.findSoundMixer(soundMixers);
                    if (position > -1) {
                        soundMixers = FileManager.deleteSoundMixer(position, soundMixers);
                    }
                    FileManager.writeJson(soundMixers);
                    break;
                case 3:
                    position = FileManager.findSoundMixer(soundMixers);
                    if (position > -1) {
                        soundMixers = FileManager.updateSoundMixer(position, soundMixers);
                    }
                    FileManager.writeJson(soundMixers);
                    break;
                case 4:
                    FileManager.printSoundMixers(soundMixers);
                    break;
                case 5:
                    FileManager.writeJson(soundMixers);
                    break;
                default:
                    System.out.println("Incorrect");
                    FileManager.writeJson(soundMixers);
                    break;
            }
        } while (option != 5);
        FileManager.writeJson(soundMixers);
    }

}
