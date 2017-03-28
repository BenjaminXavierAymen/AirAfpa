/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.RowData;
import dao.AirportDAO;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Airport;
import model.Flight;
import view.AirportsView;

/**
 *
 * @author SEGHAIER
 */
public class AirportController {
    private AirportDAO airportDAO;
    private AirportsView airportsView;
    
   

    public AirportController(AirportDAO airportDAO) {
        this.airportDAO = airportDAO;
    }
    
    public JTable addRowTable(JTable Jt_Airport){
        
        DefaultTableModel table = (DefaultTableModel) Jt_Airport.getModel();
        ArrayList<Airport> listAirport = airportDAO.getAll();
        
        
        Object rowData[] = new Object[3];
        for(Airport airport : listAirport){
            rowData[0]= airport.getAita();
            rowData[1]= airport.getCity();
            rowData[2]= airport.getCountry();
            table.addRow(rowData);
            
        } 
        return Jt_Airport;
    }
    
    public Airport selectAirport(String aita){
        Airport airport = airportDAO.find(aita);
        return airport;
    }
    
    public boolean deleteAirport(String aita){
        boolean result = false;
        result = airportDAO.delete(aita);
        
        //airportsView.getJt_Airport().removeAll();
        
        return result;
    }
}
