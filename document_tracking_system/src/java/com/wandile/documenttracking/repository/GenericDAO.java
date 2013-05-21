/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wandile.documenttracking.repository;

import java.io.Serializable;

/**
 *
 * @author boniface
 */
public interface GenericDAO < T extends Serializable > extends DAO< T, Long>{
	void setClazz( final Class< T > clazzToSet );
}

