package com.room.roomdemo.service;

import com.room.roomdemo.model.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import java.util.List;
@Service
public class RoomService {
    static List<Room> roomList = new ArrayList<>();

    static {
        roomList.add(new Room(1, 101, "single", "no"));
        roomList.add(new Room(2, 102, "double", "yes"));
        roomList.add(new Room(3, 103, "single", "yes"));
        roomList.add(new Room(4, 104, "single", "no"));
        roomList.add(new Room(5, 105, "double", "yes"));
    }
    public static List<Room> getRoomListS() {
        return roomList;
    }

    public static boolean isRoomPresentS(int id) {
        for (Room room : roomList) {
            if (room.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public List<Room> availableRoomsS() {
        List<Room> availableRoomsList = new ArrayList<>();
        for (Room room : roomList) {
            if (room.getAvailability().equals("yes")) {
                availableRoomsList.add(room);
            }
        }
        return availableRoomsList;
    }

    public Room getByIdS(int id) {

        for (Room list : roomList) {
            if (list.getId() == id) {
                return list;
            }
        }
        return null;
    }

    public List<Room> addListS(Room newRow) {
        roomList.add(newRow);
        return roomList;
    }

    public List<Room> deleteListS(int id) {
        Room room = getByIdS(id);
        roomList.remove(room);
        return roomList;
    }

    public List<Room> updateListS(Room updatedRoom) {
        deleteListS(updatedRoom.getId());
        addListS(updatedRoom);
        return roomList;
    }
}
