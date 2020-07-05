package com.webware.bootessentials.initialbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    RoomServices roomServices;

    public ApiController (RoomServices roomServices) {
        super();
        this.roomServices = roomServices;
    }

    @GetMapping("/rooms")
    public List<Room> getAllRooms() {
        return this.roomServices.getAllRooms();
    }
}
