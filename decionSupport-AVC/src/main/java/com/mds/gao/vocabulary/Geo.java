package com.mds.gao.vocabulary;

import com.mds.gao.As;
import com.mds.gao.Functional;
import com.mds.gao.Namespace;

@Namespace("http://www.w3.org/2003/01/geo/wgs84_pos#")
public interface Geo extends As {
	
	interface Point extends Geo{}

	@Functional
	Geo lat(float l);
	Float lat();

	@Functional
	Geo long_(float l);
	Float long_();

}
