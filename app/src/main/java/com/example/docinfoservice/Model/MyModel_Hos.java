package com.example.docinfoservice.Model;

public class MyModel_Hos {
    public String name, designation, speciality, chamber , address, visiting_hour, appointment, call;

    public MyModel_Hos() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getChamber() {
        return chamber;
    }

    public void setChamber(String chamber) {
        this.chamber = chamber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVisiting_hour(){return visiting_hour;}

    public void setVisiting_hour(String visiting_hour){this.visiting_hour = visiting_hour;}

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment= appointment;
    }

    public String getCall() {return call; }

    public void setCall(String Call) {this.call= appointment;}
}
