package com.homeproject.workplacelogger.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.homeproject.workplacelogger.Model.Activity;

@Repository
public interface ActivityRepository extends CrudRepository<Activity, Integer> {

	Activity findByActivityId(Integer id);

	List<Activity> findAllCheckIn();

	List<Activity> findAllheckOut();

	List<Activity> findByTimeStamp(LocalDate time);

	void createActivity(Activity activity);

	void deleteActivityByActivityId(Integer id);

	void delete(Activity activity);
}
