package com.mds.gao.binding;

import static com.mds.gao.TypeWrapper.instanceURI;
import static com.mds.gao.TypeWrapper.wrap;

import java.util.Collection;

import com.hp.hpl.jena.rdf.model.Resource;
import com.mds.gao.NotFoundException;

public class RdfBean<T> {

	protected transient Jenabean binder;
	
	public RdfBean() {
		binder = Jenabean.instance();
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public T load(String id) throws NotFoundException {
		return (T)binder.load(this.getClass(), id);
	}
	
	@SuppressWarnings("unchecked")
	public T refresh() {
		return (T)binder.reader().load(this);
	}
	
	@SuppressWarnings("unchecked")
	public T save() {
		binder.writer().save(this);
		return (T)this;
	}
	
	public void delete() {
		binder.writer().delete(this);
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public T fill(String s) {
		binder.reader().fill(this, s);
		return (T)this;
	}
	
	@SuppressWarnings({ "static-access", "unchecked" })
	public Collection<T> query(String query) {
		return (Collection<T>)binder.query(getClass(), query);
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	public T fill() {
		for (String pd : wrap(this.getClass()).collections())
			binder.reader().fill(this, pd);
		return (T)this;
	}
	
	public Resource asIndividual() {
		return binder.model().getResource(instanceURI(this));
	}
	
	
}
