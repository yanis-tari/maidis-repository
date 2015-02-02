package com.mds.gao;

import com.mds.gao.vocabulary.Foaf;
import com.mds.gao.vocabulary.Geo;
import com.mds.gao.vocabulary.Sioc;

import com.hp.hpl.jena.rdf.model.Resource;
public interface As {
	
	/**
	 * Polymorph this proxied interface into a new vocabulary by
	 * providing it's class.
	 * 
	 * @return a dynamic proxy related to the connected Jena model
	 * of this proxy.
	 */
	public <T> T as(Class<T> c);

	/**
	 * Polymorph and reclassify this proxied interface into a new vocabulary by
	 * providing it's class.
	 * 
	 * @return a dynamic proxy related to the connected Jena model
	 * of this proxy.
	 */
	public <T> T isa(Class<T> c);

	/**
	 * Provides access to the raw Jena resource in focus.  All requests or sets on this
	 * proxy apply the the resource
	 * 
	 * @return the underlying Jena resource targeted by this proxy.
	 */
	public Resource asResource();
}
