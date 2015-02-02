package com.mds.gao.lazy;

import java.util.List;
import java.util.Set;

import com.hp.hpl.jena.rdf.model.Resource;

public interface Provider {

	@SuppressWarnings("rawtypes")
	List lazyList(Resource i, String property, Class type);

	@SuppressWarnings("rawtypes")
	Set lazySet(Resource i, String property, Class type);

}
