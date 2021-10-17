package control;


import model.room.Room;
import storage.FileManagerRoom;

import java.util.ArrayList;
import java.util.List;

public class RoomManager implements IGeneralManager<Room>{
    List<Room> roomList = new ArrayList<>();
    private FileManagerRoom fileManagerRoom;

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public FileManagerRoom getFileManagerRoom() {
        return fileManagerRoom;
    }

    public void setFileManagerRoom(FileManagerRoom fileManagerRoom) {
        this.fileManagerRoom = fileManagerRoom;
    }

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
