/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.crud.impl;

import com.wandile.documenttracking.domain.Employee;
import com.wandile.documenttracking.domain.Name;
import com.wandile.documenttracking.repository.GenericDAO;
import com.wandile.documenttracking.services.crud.NameCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DibaW
 */
@Service("NameCrudService")
public class NameCrudServiceImpl implements NameCrudService{
    
    @Autowired
    private GenericDAO<Name> dao;
    
     public final void setDao(final GenericDAO< Name> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Name.class);
    }

    public NameCrudServiceImpl() {
    }
    @Override
    public Name findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Name> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Name entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Name entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Name entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Name v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Name> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Name getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Name> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);

    
    }
    
}
