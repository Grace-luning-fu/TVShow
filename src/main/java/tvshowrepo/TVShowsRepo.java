package tvshowrepo;

import models.TVShows;
import org.springframework.data.repository.CrudRepository;


public interface TVShowsRepo extends CrudRepository<TVShows,Long> {
}