package com.homeproject.workplacelogger.Service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.homeproject.workplacelogger.Model.Activity;

@Service
public interface ActivityService {

	/**
	 * Finds Activity Based on its ID
	 * 
	 * @param id
	 * @return
	 */
	Activity findByActivityId(Integer id);

	/**
	 * Finds all activities that are CheckIns.
	 * 
	 * @return
	 */
	List<Activity> findAllCheckIn();

	/**
	 * Finds all activities that are CheckOuts.
	 * 
	 * @return
	 */
	List<Activity> findAllheckOut();

	/**
	 * Finds activity based on its timeStamp.
	 * 
	 * @param time
	 * @return
	 */
	List<Activity> findByTimeStamp(LocalDate time);

	/**
	 * Creates activity in the database.
	 * 
	 * @param activity
	 */
	void createActivity(Activity activity);

	/**
	 * Deletes the activity based on its Id;
	 * 
	 * @param id
	 */
	void deleteActivityByActivityId(Integer id);

	/**
	 * Deletes the activity (general).
	 * 
	 * @param activity
	 */
	void deleteActivity(Activity activity);
}
