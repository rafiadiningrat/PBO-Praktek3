/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacollections;

/**
 *
 * @author DELL
 */
class ServicePackage {

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
    
    private String service;
    private long value;

}
