/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.crud.impl;

import com.wandile.documenttracking.domain.Submission;
import com.wandile.documenttracking.repository.GenericDAO;
import com.wandile.documenttracking.services.crud.SubmissionCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DibaW
 */

@Service("submissionCrudService")
@Transactional
public class SubmissionCrudServiceImpl  implements SubmissionCrudService{
    
     @Autowired
    private GenericDAO<Submission> dao;
    
     public final void setDao(final GenericDAO< Submission> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Submission.class);
    }

    public SubmissionCrudServiceImpl() {
    }
    @Override
    public Submission findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Submission> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Submission entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Submission entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Submission entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Submission v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Submission> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Submission getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Submission> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);

    
    }
    
}
