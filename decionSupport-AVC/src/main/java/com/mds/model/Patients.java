package com.mds.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Patients  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    private java.util.List<com.mds.model.Patient> patients;

    public Patients() {
    }

    public Patients(java.util.List<com.mds.model.Patient> patients) {
        this.patients = patients;
    }


    
    public java.util.List<com.mds.model.Patient> getPatients() {
        return this.patients;
    }

    public void setPatients(  java.util.List<com.mds.model.Patient> patients ) {
        this.patients = patients;
    }
}