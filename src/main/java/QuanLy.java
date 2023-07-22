
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Giang
 */
public class QuanLy extends Connect {

    public static void ThemNV(String manv, String tennv, String chucvu, String gioitinh, String ngaysinh, String quequan) {
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "insert into nhanvien values(?,?,?,?,?,?)";
        try {
            c = getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1, manv);
            ps.setString(2, tennv);
            ps.setString(3, chucvu);
            ps.setString(4, gioitinh);
            ps.setString(5, ngaysinh);
            ps.setString(6, quequan);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<NhanVien> layTatCaNhanVien() {
        List<NhanVien> DSNV = new ArrayList<>();
        Connection c = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM nhanvien";

        try {
            c = getConnection();
            st = c.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString("manv"), rs.getString("tennv"),
                        rs.getString("chucvu"), rs.getString("gioitinh"), rs.getString("ngaysinh"), rs.getString("quequan"));
                DSNV.add(nv);
            }

        } catch (Exception e) {
        }

        return DSNV;
    }

    public static void XoaNv(String manv) {
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "delete from nhanvien where manv =?";
        try {
            c = getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1, manv);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<NhanVien> TimNhanVien(String manv) {
        List<NhanVien> DSNV = new ArrayList<>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from nhanvien where manv like ? ";

        try {
            c = getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(1, "%" + manv + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString("manv"), rs.getString("tennv"),
                        rs.getString("chucvu"), rs.getString("gioitinh"), rs.getString("ngaysinh"), rs.getString("quequan"));
                        DSNV.add(nv);
            }

        } catch (Exception e) {
        }

        return DSNV;
    }
    public static void SuaNV(String manv, String tennv, String chucvu, String gioitinh, String ngaysinh, String quequan) {
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "UPDATE nhanvien\n"
                + "SET tennv = ? , chucvu = ?, gioitinh = ?, ngaysinh = ?, quequan = ?\n"
                + "WHERE manv=?;";
        try {
            c = getConnection();
            ps = c.prepareStatement(sql);
            ps.setString(6, manv);
            ps.setString(1, tennv);
            ps.setString(2, chucvu);
            ps.setString(3, gioitinh);
            ps.setString(4, ngaysinh);
            ps.setString(5, quequan);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    

}
