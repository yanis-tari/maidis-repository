package com.mds.gao;

import java.lang.annotation.Annotation;

class NullRdfProperty  {
	
	
	static RdfProperty getNullRdfProperty()
	    {
		RdfProperty annotation = new RdfProperty()
	        {
	           
			public boolean symmetric() {
				return false;
			}

			public boolean transitive() {
				return false;
			}

			public String value() {
				return "";
			}

			public Class<? extends Annotation> annotationType() {
				return null;
			}

			public String inverseOf() {
				return "";
			}
			
	        };

	        return annotation;
	    }
		
}