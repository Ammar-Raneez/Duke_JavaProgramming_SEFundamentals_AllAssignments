
/**
 * Custom LogEntry data type.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import  java.util.*;
public class LogEntry
{
     private String ipAddress;
     private Date accessTime;
     private String request;
     private int statusCode;
     private int bytesReturned;
     
   public LogEntry(String ip, Date time, String req, int status, int bytes) {
       ipAddress = ip;
       accessTime = time;
       request = req;
       statusCode = status;
       bytesReturned = bytes;
       
   }
   
   public String getIpAddress() {
         return ipAddress;
    }
    public Date getAccessTime() {
         return accessTime;
   }   
   public String getRequest() {
         return request;
   }
   public int getStatusCode() {
         return statusCode;
   }
   public int getBytesReturned() {
         return bytesReturned;
   }
   
   //remember toString() is what is called by default to when you print the object itself
   @Override
   public String toString() {
       return ipAddress + " " + accessTime + " " + request + " " + statusCode + " " + bytesReturned;
    }
}
