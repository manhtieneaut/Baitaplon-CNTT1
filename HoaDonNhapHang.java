
package qlcuahangbandienthoai;

public class HoaDonNhapHang extends HoaDon {
    // thuoc tinh (attributes)
  private String NguonNhap;
  private int SoLuong;
  private float ChietKhau;
  
  
   // constructor
  public HoaDonNhapHang() {
}
  public HoaDonNhapHang (String MaHD,String NgayHD,String TenHang,float GiaHang,int SoLuong,String NguonNhap,float ChietKhau){
      super(MaHD,NgayHD,TenHang,GiaHang);
      this.SoLuong=SoLuong;
      this.NguonNhap=NguonNhap;
      this.ChietKhau=ChietKhau;
      
        
  }
    // phuong thuc set, get
    public void SetSoLuong(int SoLuong){
        this.SoLuong = SoLuong;
    }
    public int GetSoLuong(){
        return this.SoLuong;
    }
    public void SetNguonNhap(String NguonNhap){
        this.NguonNhap = NguonNhap;
    }
    public String GetNguonNhap(){
        return this.NguonNhap;
    }
    public void SetChietKhau(float ChietKhau){
        this.ChietKhau = ChietKhau;
    }
    public float GetChietKhau(){
        return this.ChietKhau;
    }
    
    //gia tien
    public float ThanhTien(){
    return GetSoLuong()* GetGiaHang()-GetChietKhau();
    }
    
    //to string
@Override
public String ToString(){
        String str = super.ToString()+"\n + Số lượng: "+GetSoLuong()
                                     +"\n + Nguồn nhập: " +GetNguonNhap()
                                     +"\n + Chiết khấu:"+GetChietKhau()
                                     +"\n + Thành tiền:"+ThanhTien();
        return str;   
}
    
}
