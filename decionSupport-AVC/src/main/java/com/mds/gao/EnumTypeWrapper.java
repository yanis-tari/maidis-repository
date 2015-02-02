package com.mds.gao;

import static com.mds.gao.Util.last;

import com.hp.hpl.jena.rdf.model.Resource;

public class EnumTypeWrapper extends TypeWrapper {
	
	public EnumTypeWrapper(Class<?> c) {
		super(c);
	}

	@Override
	public String uri(String id) {
		return typeUri() + '/' + id;
	}

	@SuppressWarnings("rawtypes")
	public String id(Object bean) {
		return ((Enum)bean).name();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object toBean(String uri) {
		Class<? extends Enum> d =  (Class<? extends Enum>)c;
		return Enum.valueOf(d, last(uri));
	}

	@Override
	public Object toProxyBean(Resource source, AnnotationHelper jpa) {
		return toBean(source.getURI());
	}

}
