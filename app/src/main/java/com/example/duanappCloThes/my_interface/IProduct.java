package com.example.duanappCloThes.my_interface;

public interface IProduct {
    void OnSucess();

    void OnFail();

    void getDataProduct(String id, String ten, Long gia, String hinhanh, String loaisp, String mota, Long soluong, String size, Long type, String chatlieu);
}
