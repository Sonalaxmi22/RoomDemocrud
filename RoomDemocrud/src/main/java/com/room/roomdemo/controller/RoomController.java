package com.room.roomdemo.controller;

import com.room.roomdemo.model.Room;
import com.room.roomdemo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    RoomService roomService;

    @GetMapping("/getRoomListC")
    public List<Room> getRoomListC() {
        return RoomService.getRoomListS();
    }

    @GetMapping("/isRoomPresentC")
    public Boolean isRoomPresentC(@RequestParam int id) {
        return RoomService.isRoomPresentS(id);
    }

    @GetMapping("/getByIdC")
    public Room getByIdC(@RequestParam int id) {
        Room byId = roomService.getByIdS(id);
        return byId;
    }

    @GetMapping("/availableRoomsC")
    public List<Room> availableRoomsC(@RequestParam String yes) {
        return roomService.availableRoomsS();
    }

    @PutMapping("/addListC")
    public List<Room> addListC(@RequestParam Room newRow){
        return roomService.addListS(newRow);
    }

    @DeleteMapping("/deleteListC")
    public List<Room> deleteListC(@RequestParam int id) {
        return roomService.deleteListS(id);
    }
    @PutMapping("/updateListC")
    public List<Room> updateListC(Room updatedRoom) {
        return roomService.updateListS(updatedRoom);
    }
}
