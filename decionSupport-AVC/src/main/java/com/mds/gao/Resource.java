package com.mds.gao;

public class Resource {
	String uri;

	public Resource(String s) {
		uri = s;
	}
	
	@SuppressWarnings("deprecation")
	@Uri
	public String getUri() {
		return uri;
	}

	public String toString() {
		return uri;
	}
}
