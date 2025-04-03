/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author mark o'brien - 22103627
 */
public class PatientData {
    private String name;
    private String gpName;
    private boolean inPatient;
    private String age;
    
    public PatientData(){
        name = new String();
        gpName = new String();
        inPatient = true;
        age = new String();
    }
    public void setName(String n){
        name = n;
    }
    public void setGPName(String g){
        gpName = g;
    }
    public void setInPatient(boolean p){
        inPatient = p;
    }
    public void setAge(String a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public String getGPName(){
        return gpName;
    }
    public boolean getInPatient(){
        return inPatient;
    }
    public String getAge(){
        return age;
    }
}
