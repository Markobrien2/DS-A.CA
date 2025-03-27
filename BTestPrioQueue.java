/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.*;

/**
 *
 * @author mark o'brien - 22103627
 */
public class BTestPrioQueue implements BTestInterface{
    
    private ArrayList<BTestElement> btQueue;
    
    public BTestPrioQueue() {
        btQueue = new ArrayList<BTestElement>();
    }
    public boolean isEmpty() { 
        return btQueue.isEmpty(); 
    }
  
    public int size(){
	  return btQueue.size();
    }

    private int findInsertPosition(int newkey)
      {
          boolean found;
          BTestElement elem;
          int position;
          found = false;
          position =0;
          while (position<btQueue.size() && !found)
          {
            elem = btQueue.get(position);
            if(elem.getKey()>newkey)  
                position = position +1;
            else
            {
                found = true;
            }
          }
         return position;
        }
    
    // new element with a given key and element information will be added 
    public void enqueue(int priorkey, Object item)
    {
        int index;
        BTestElement elem = new BTestElement(priorkey,(PatientData)item);
        
        index = findInsertPosition(priorkey);

        if (index ==size())
            btQueue.add(elem);
        else
            btQueue.add(index, elem);
    }



    //the first element has the highest priority
    public Object dequeue()
    {
       return btQueue.remove(0);
    }
    
    
    public String printBTQueue()
    {
        String printStr = new String();
        BTestElement elem;
        for (int i = 0; i<btQueue.size();i++)
        {
            elem = btQueue.get(i);
            printStr = printStr.concat (elem.printPatientData()+" "+"Priority ="+elem.getKey()+"\n");
        }
        return printStr;
    }
 }

