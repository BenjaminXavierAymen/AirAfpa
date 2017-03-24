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

/**
 *
 * @author Formation
 */
public class AirportController {
    private AirportDAO airportDAO = new AirportDAO();
    
    public JTable addRowTable(JTable Jt_Airport){
        DefaultTableModel model = (DefaultTableModel) Jt_Airport.getModel();
        
        ArrayList<Airport> listAirport = airportDAO.getAll();
        
        
        Object rowData[] = new Object[3];
        for(Airport airport : listAirport){
            rowData[0]= airport.getAita();
            rowData[1]= airport.getCity();
            rowData[2]= airport.getCountry();
            model.addRow(rowData);
        }
        return Jt_Airport;
    }
}
