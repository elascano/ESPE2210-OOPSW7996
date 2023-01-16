package ec.edu.espe.inclass.controller;

import ec.edu.espe.InClass.model.Teacher;
import java.util.ArrayList;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class DBManager {
        public static Teacher toTeacher(Object[] teacherList) {
        Teacher teacher;

        teacher = new Teacher((String) teacherList[0], (String) teacherList[1], (Integer) teacherList[2]);

        return teacher;
    }

    public static ArrayList read(ArrayList<Object> teachersList) {
        ArrayList<Teacher> teachers;
        Object[] teacherList;

        teachers = new ArrayList<>();

        for (int i = 0; i < teachersList.size(); i++) {
            teacherList = (Object[]) teachersList.get(i);
            teachers.add(toTeacher(teacherList));
        }

        return teachers;
    }
}
