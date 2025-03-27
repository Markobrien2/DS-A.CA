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
    private int age;
    
    public PatientData(){
        name = new String();
        gpName = new String();
        inPatient = true;
        age = 0;
    }
    public void setName(String n){
        name = n;
    }
    public void setGPName(String g){
        name = g;
    }
    public void setInPatient(boolean p){
        inPatient = p;
    }
    public void setAge(int a){
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
    public int getAge(){
        return age;
    }
}
