/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Pakaian;
import model.PakaianFavorit;

/**
 *
 * @author MSI Modern 14
 */
public class PakaianController {

    public static void HapusPakaian(String id) {
        Pakaian.HapusPakaian(id);
        PakaianFavorit.HapusSemuaFavorit(id);
    }

    public static void BeliPakaian(String id, String nama) {
        Pakaian.BeliPakainan(id, nama);
        PakaianFavorit.HapusSemuaFavorit(id);
    }

    public static List<List<String>> getDataFavorit(String nama) {
        List<String> dataID = PakaianFavorit.getDataIDPakaianFavorit(nama);
        List<List<String>> data = Pakaian.getDataPakaianFavorit(dataID);
        return data;
    }
    public static String TambahFavorit(String id,String nama){
    int cekFavorit = PakaianFavorit.cekFavorit(id,nama);
        if (cekFavorit == 1) {
            return "Pakaian sudah ada di favorit!";}
        boolean tambah = PakaianFavorit.TambahFavorit(id, nama);
        if (tambah == true) {
            return "Pakaian Berhasil Ditambahkan !";
        }
        return "Pakaian gagal ditambahkan!";}
}
