package com.mds;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class IRMResult_AVC  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    
    private java.lang.String label;
    
    private java.lang.String nomenclatureCode;

    public IRMResult_AVC() {
    }

    public IRMResult_AVC(java.lang.String label, java.lang.String nomenclatureCode) {
        this.label = label;
        this.nomenclatureCode = nomenclatureCode;
    }


    
    public java.lang.String getLabel() {
        return this.label;
    }

    public void setLabel(  java.lang.String label ) {
        this.label = label;
    }
    
    public java.lang.String getNomenclatureCode() {
        return this.nomenclatureCode;
    }

    public void setNomenclatureCode(  java.lang.String nomenclatureCode ) {
        this.nomenclatureCode = nomenclatureCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.mds.IRMResult_AVC that = (com.mds.IRMResult_AVC)o;
        if (label != null ? !label.equals(that.label) : that.label != null) return false;
        if (nomenclatureCode != null ? !nomenclatureCode.equals(that.nomenclatureCode) : that.nomenclatureCode != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 13 * result + (label != null ? label.hashCode() : 0);
        result = 13 * result + (nomenclatureCode != null ? nomenclatureCode.hashCode() : 0);
        return result;
    }
}