/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.crud.impl;

import com.wandile.documenttracking.domain.Location;
import com.wandile.documenttracking.repository.GenericDAO;
import com.wandile.documenttracking.services.crud.LocationCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DibaW
 */

@Service("LocationCrudService")
@Transactional
public class LocationCrudServiceImpl implements LocationCrudService{
    
     @Autowired
    private GenericDAO<Location> dao;
    
     public final void setDao(final GenericDAO< Location> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Location.class);
    }

    public LocationCrudServiceImpl() {
    }
    @Override
    public Location findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Location> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Location entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Location entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Location entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Location v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Location> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Location getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Location> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);

    
    }
    
}
