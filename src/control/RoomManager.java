package control;


import model.room.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomManager implements IGeneralManager<Room>{
    List<Room> roomList = new ArrayList<>();


    @Override
    public List<Room> findAll() {
        return roomList;
    }

    @Override
    public void saveList(Room room) {
        roomList.add(room);
    }

    @Override
    public void removeByIndex(int index) {
        roomList.remove(index);
    }

    @Override
    public void updateByIndex(int index, Room room) {
        roomList.set(index, room);
    }

    @Override
    public Room searchById(String id) {
        Room room  =  null;
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getCode().equalsIgnoreCase(id)) {
                room = roomList.get(i);
                break;
            }
        }
        return room;
    }

    @Override
    public Room searchByName(String name) {
        return null;
    }

    @Override
    public void showAllList() {
        for (Room room: roomList
             ) {
            System.out.println(room);
        }
    }
}
