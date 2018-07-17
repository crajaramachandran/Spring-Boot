package com.frankmoley.landon.data.repository;

import com.frankmoley.landon.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long> { //Long corresponds to our long id;
    Room findByNumber(String number);
}
