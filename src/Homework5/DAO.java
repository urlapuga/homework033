package Homework5;

import Homework5.Room;

/**
 * Created by Андрей on 02.03.2017.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
