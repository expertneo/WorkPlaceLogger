package com.homeproject.workplacelogger.Service;

import java.time.LocalDate;
import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeproject.workplacelogger.Model.Activity;
import com.homeproject.workplacelogger.Repository.ActivityRepository;

@Service
public class ActivityServiceImpl implements ActivityService {

	@Autowired
	ActivityRepository activityRepository;

	private static final Logger LOG = Logger.getLogger(ActivityServiceImpl.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.homeproject.workplacelogger.Service.ActivityService#findByActivityId(java
	 * .lang.Integer)
	 */
	@Override
	public Activity findByActivityId(Integer id) {
		return activityRepository.findByActivityId(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.homeproject.workplacelogger.Service.ActivityService#findAllCheckIn()
	 */
	@Override
	public List<Activity> findAllCheckIn() {
		return activityRepository.findAllCheckIn();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.homeproject.workplacelogger.Service.ActivityService#findAllheckOut()
	 */
	@Override
	public List<Activity> findAllheckOut() {
		return activityRepository.findAllheckOut();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.homeproject.workplacelogger.Service.ActivityService#findByTimeStamp(java.
	 * time.LocalDate)
	 */
	@Override
	public List<Activity> findByTimeStamp(LocalDate time) {
		return activityRepository.findByTimeStamp(time);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.homeproject.workplacelogger.Service.ActivityService#createActivity(com.
	 * homeproject.workplacelogger.Model.Activity)
	 */
	@Override
	public void createActivity(Activity activity) {
		activityRepository.createActivity(activity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.homeproject.workplacelogger.Service.ActivityService#
	 * deleteActivityByActivityId(java.lang.Integer)
	 */
	@Override
	public void deleteActivityByActivityId(Integer id) {
		activityRepository.deleteActivityByActivityId(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.homeproject.workplacelogger.Service.ActivityService#deleteActivity(com.
	 * homeproject.workplacelogger.Model.Activity)
	 */
	@Override
	public void deleteActivity(Activity activity) {
		activityRepository.delete(activity);
	}
}
