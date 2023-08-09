package com.room.roomdemo;
import com.room.roomdemo.controller.RoomController;
import com.room.roomdemo.model.Room;
import com.room.roomdemo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RoomDemoApplication {

    @Autowired
    RoomController roomController;

    public static void main(String[] args) {
        SpringApplication.run(RoomDemoApplication.class, args);}
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
//            List<Room> Rooms = RoomService.getRoomListS();
//            System.out.println("Rooms:" + roomController.getRoomListC());
//
//            List<Room> RoomList = RoomService.getRoomList();
//            System.out.println("Room by id:" + roomController.getByIdC(3));
//
//            List<Room> AvailableRooms = RoomService.getRoomList();
//            System.out.println("Room availability:" + roomController.availableRoomsC("yes"));
//
//            Room data = new Room(6, 106, "Single", "no");       //Add
//            List<Room> newList = roomController.addListC(data);
//            System.out.println("added:" + newList);
//
//            System.out.println("Removed:" + roomController.deleteListC(5));     //Remove by id
//
//            System.out.println("Updated list:" + roomController.updateListC(new Room(4,106,"single","no")));      //Update an existing room
        };
    }
}