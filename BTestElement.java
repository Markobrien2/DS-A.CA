/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author mark o'brien - 22103627
 */
public class BTestElement {
    
    private int key;
    private PatientData data;
    
    public BTestElement(int priority, PatientData e){
        key = priority;
        data = e;
    }
    public int getKey(){
        return key;
    }
    public void setKey(int val){
        key = val;
    }
    public PatientData getData(){
        return data;
    }
    public void setData(PatientData e){
        data = e;
    }
    public String printPatientData(){
        String message;
        message = "Name= " +data.getName()+ " -- " + "GP= " + data.getGPName()+" -- "+"Age= "+data.getAge()+" -- "+"In-Patient= "+data.getInPatient();
        return message;
    }
}
