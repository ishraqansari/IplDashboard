package io.iplproject.ipldashboard.Repository;

import io.iplproject.ipldashboard.Model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);

}