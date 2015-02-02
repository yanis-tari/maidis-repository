package com.mds.model;

import java.rmi.server.UID;

import com.mds.gao.Generated;
import com.mds.gao.Id;
import com.mds.gao.Namespace;
import com.mds.gao.Transient;
import com.mds.gao.binding.RdfBean;


@Namespace(MdsVocabulary.NS)
public class Entity extends RdfBean<Entity> implements java.io.Serializable{
	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -2418804255464983987L;
	@Generated
	@Id
	private String id;

	public Entity() {
		super();
		this.id = new UID().toString();
	}

	public String getId() {
		return id;
	}

	
	
	

}
