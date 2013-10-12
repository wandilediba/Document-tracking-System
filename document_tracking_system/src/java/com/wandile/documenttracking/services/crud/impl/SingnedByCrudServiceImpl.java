/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.crud.impl;

import com.wandile.documenttracking.domain.SingnedBy;
import com.wandile.documenttracking.repository.GenericDAO;
import com.wandile.documenttracking.services.crud.SingnedByCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DibaW
 */
@Service("singnedByCrudService")
public class SingnedByCrudServiceImpl implements SingnedByCrudService{
    
    @Autowired
    private GenericDAO<SingnedBy> dao;
    
     public final void setDao(final GenericDAO< SingnedBy> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(SingnedBy.class);
    }

    public SingnedByCrudServiceImpl() {
    }
    
    @Override
    public SingnedBy findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<SingnedBy> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(SingnedBy entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(SingnedBy entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(SingnedBy entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        SingnedBy v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<SingnedBy> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public SingnedBy getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<SingnedBy> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);

    
    }
    
}
