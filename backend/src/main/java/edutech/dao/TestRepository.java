
package edutech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import edutech.entity.Test;

public interface TestRepository extends JpaRepository<Test, Integer> {

}