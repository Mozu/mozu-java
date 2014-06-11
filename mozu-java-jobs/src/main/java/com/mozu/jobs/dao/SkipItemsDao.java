/*
 * COPYRIGHT (C) 2014 Volusion Inc. All Rights Reserved.
 */
package com.mozu.jobs.dao;

import java.util.List;

import com.mozu.jobs.models.SkipItems;


public interface SkipItemsDao {
 
    public void save(SkipItems skipElement);
    public List<com.mozu.jobs.models.SkipItems> getByJobExecutionId(Long jobExecutionId);
    public void delete (Long id);
 
}