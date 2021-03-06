package com.educare.mindfulhome.activities.service;

import com.educare.mindfulhome.activities.model.ActivityEntity;

import java.util.List;
import java.util.UUID;

public interface ActivityService {
    public ActivityEntity createActivity(ActivityEntity activity);
    public ActivityEntity getActivityById(UUID id);
    public List<ActivityEntity> getAllActivities(boolean activeOnly);
    public ActivityEntity updateActivity(ActivityEntity activity);
}
