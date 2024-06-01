package controller;

import model.Customer;
import model.Pegawai;
import view.MenuCustomer;
import view.MenuPegawai;

public class LoginController {

    public static boolean Login(String nama, String password) {
        Pegawai Pegawai = new Pegawai(nama,password);
        int login = Pegawai.login(nama, password);
        if (login == 1) {
            UserSession.getInstance().setUserRole(Pegawai.getRole());
            UserSession.getInstance().setUserNama(Pegawai.getNama());
            MenuPegawai dashboardPegawai = new MenuPegawai();
            dashboardPegawai.setVisible(true);
            return true;
        }
        Customer Customer = new Customer(nama,password);
        login = Customer.login(nama, password);
        if (login == 1) {
            UserSession.getInstance().setUserRole(Customer.getRole());
            UserSession.getInstance().setUserNama(Customer.getNama());
            MenuCustomer dashboardCustomer = new MenuCustomer();
            dashboardCustomer.setVisible(true);
            return true;
        }
        return false;
        
    }
}
