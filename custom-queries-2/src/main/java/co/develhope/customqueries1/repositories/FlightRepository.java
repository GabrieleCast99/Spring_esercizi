package co.develhope.customqueries1.repositories;

import co.develhope.customqueries1.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>, JpaSpecificationExecutor<Flight> {

    @Query("SELECT f FROM Flight f WHERE f.status IN (:p1, :p2)")
    List<Flight> findByStatusIn(String p1, String p2);

}
