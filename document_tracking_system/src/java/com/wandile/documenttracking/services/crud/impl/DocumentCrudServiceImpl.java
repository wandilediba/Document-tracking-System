/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.services.crud.impl;

import com.wandile.documenttracking.domain.Document;
import com.wandile.documenttracking.repository.GenericDAO;
import com.wandile.documenttracking.services.crud.DocumentCrudService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author DibaW
 */

@Service("DocumentCrudService")
@Transactional
public class DocumentCrudServiceImpl implements  DocumentCrudService{
    
    @Autowired
    private GenericDAO<Document> dao;
    
     public final void setDao(final GenericDAO< Document> daoToSet) {
        this.dao = daoToSet;
        this.dao.setClazz(Document.class);
    }

    public DocumentCrudServiceImpl() {
    }
    @Override
    public Document findById(Long id) {
        setDao(dao);
        return dao.findById(id);
    }
    @Override
    public List<Document> findAll() {
        setDao(dao);
        return dao.findAll();
    }

    @Override
    public void persist(Document entity) {
        setDao(dao);
        dao.persist(entity);
    }

    @Override
    public void merge(Document entity) {
        setDao(dao);
        dao.merge(entity);
    }

    @Override
    public void remove(Document entity) {
        setDao(dao);
        dao.remove(entity);
    }

    @Override
    public void removeById(Long entityId) {
        setDao(dao);
        Document v = dao.findById(entityId);
        dao.remove(v);
    }

    @Override
    public List<Document> findInRange(int firstResult, int maxResults) {
        setDao(dao);
        return dao.findInRange(firstResult, maxResults);

    }
    @Override
    public long count() {
        setDao(dao);
        return dao.count();
    }
    @Override
    public Document getByPropertyName(String name, String value) {
        setDao(dao);
        return dao.getByPropertyName(name, value);
    }

    @Override
    public List<Document> getEntitiesByProperName(String name, String value) {
        setDao(dao);
        return dao.getEntitiesByProperName(name, value);

    
    }
    
}
