package weekAssess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import weekAssess.beans.House;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Oct 21, 2021
 */
@Repository
public interface HouseRepository extends JpaRepository<House, Long>{

}
