package com.webware.bootessentials.initialbootapp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RoomServices {
    private static List<Room> rooms = new ArrayList<>();

    static {
        for (int i=0; i<10; i++) {
            rooms.add(new Room(i, "Room " + i, "R"+i, "Q"));
        }
    }

    public List<Room> getAllRooms() {
        return rooms;
    }

}
