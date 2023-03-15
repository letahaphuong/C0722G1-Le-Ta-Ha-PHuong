package repository.impl;

import model.BenhAn;
import repository.BaseRepository;
import repository.IBenhAnRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepository implements IBenhAnRepository {
    private static final String SELECT_ALL="SELECT ba.*,bn.name FROM benh_an AS ba JOIN benh_nhan AS bn ON ba.id_benh_nhan=bn.id;";
    private static final String DELETE="CALL delete_id(?);";
    private static final String EDIT="ALL edit(?,?,?,?,?,?);";

    @Override
    public List<BenhAn> findAll() {
        Connection connection= BaseRepository.getConnectDB();
        List<BenhAn> benhAnList=new ArrayList<>();
        try {
            PreparedStatement ps=connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet=ps.executeQuery();
            while (resultSet.next()){
                String idBenhAn = resultSet.getString("id_benh_an");
                String idBenhNhan=resultSet.getString("id_benh_nhan");
                String ngayNhap=resultSet.getString("ngay_nhap");
                String ngayRa=resultSet.getString("ngay_ra");
                String lyDo=resultSet.getString("ly_do");
                String phuongPhapDieuTri=resultSet.getString("phuong_phap_dieu_tri");
                String bacSi=resultSet.getString("bac_si");
                String name=resultSet.getString("name");
                BenhAn benhAn=new BenhAn(idBenhAn,idBenhNhan,name,ngayNhap,ngayRa,lyDo,phuongPhapDieuTri,bacSi);
                benhAnList.add(benhAn);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return benhAnList;
    }

    @Override
    public boolean edit(String id, BenhAn benhAn) {
        Connection connection=BaseRepository.getConnectDB();
        try {
            PreparedStatement ps=connection.prepareStatement(EDIT);
            ps.setString(1,benhAn.getNgayNhap());
            ps.setString(2,benhAn.getNgayRa());
            ps.setString(3,benhAn.getLyDo());
            ps.setString(4,benhAn.getPhuongPhapDieuTri());
            ps.setString(5,benhAn.getBacSi());
            return ps.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean remove(String id) {
        Connection connection=BaseRepository.getConnectDB();
        try {
            CallableStatement callableStatement=connection.prepareCall(DELETE);
            callableStatement.setString(1,id);
            callableStatement.executeUpdate();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
