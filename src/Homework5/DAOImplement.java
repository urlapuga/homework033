package Homework5;

/**
 * Created by Андрей on 02.03.2017.
 */
public class DAOImplement implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println();
        System.out.println("save"+room.toString());
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }
}
