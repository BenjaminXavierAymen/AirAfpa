/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airafpa;

import dao.BookingDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Flight;

/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 */
public class AirAfpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BookingDAO bookingInstance = new BookingDAO();
        
        try {
            if(bookingInstance.queryBuilder("SELECT * FROM bookings WHERE flight_id=18").next()){
                
                System.out.println("ok");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
}
