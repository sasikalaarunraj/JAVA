package pailagam;

import java.io.*;
import java.text.DateFormatSymbols;
import java.util.*;

public class Date_cal{
    public static void main(String[] args) 
    {
        try {
            String data[] = new String[2];
            InputStreamReader sr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(sr);
            for (int i = 0; i < 2; i++) 
            {
                data[i] = br.readLine();
                Calendar cal = Calendar.getInstance();
               
                cal.set(Integer.parseInt(data[i].split("-")[0]), Integer.parseInt(data[i].split("-")[1]), 28);
                String dayName = new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
                System.out.println(dayName.toUpperCase());
            }
        } catch (Exception ex) 
        {
            System.out.println(ex.toString());
        }

    }
}

