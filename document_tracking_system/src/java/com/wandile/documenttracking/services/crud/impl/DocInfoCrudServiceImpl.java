/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.crud.impl;

import com.wandile.documenttracking.domain.Document_info;
import com.wandile.documenttracking.repository.GenericDAO;
import com.wandile.documenttracking.services.crud.DocInfoCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DibaW
 */
@Service("docInfoCrudService")
@Transactional
public class DocInfoCrudServiceImpl implements DocInfoCrudService{

    @Autowired
    private GenericDAO<Document_info> dao;
    
     public final void setDao(final GenericDAO< Document_info> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Document_info.class);
    }

    public DocInfoCrudServiceImpl() {
    }
    @Override
    public Document_info findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Document_info> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Document_info entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Document_info entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Document_info entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Document_info v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Document_info> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Document_info getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Document_info> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);

    
    }
    
}
