
package qlcuahangbandienthoai;
public abstract class HoaDon {
    // thuoc tinh (attributes)
  private String MaHD,NgayHD,TenHang;
  private float GiaHang;
   // constructor
  public HoaDon(){}
  public HoaDon (String MaHD,String NgayHD,String TenHang,float GiaHang){
        this.MaHD = MaHD;
        this.NgayHD = NgayHD;
        this.TenHang = TenHang;
        this.GiaHang = GiaHang;
  }
    // phuong thuc set, get
    public void SetMaHD(String MaHD){
        this.MaHD = MaHD;
    }
    public String GetMaHD(){
        return this.MaHD;
    }
    public void SetNgayHD(String NgayHD){
        this.NgayHD = NgayHD;
    }
    public String GetNgayHD(){
        return this.NgayHD;
    }    
    public void SetTenHang(String TenHang){
        this.TenHang = TenHang;
    }
    public String GetTenHang(){
        return this.TenHang;
    }
    public void SetGiaHang(float GiaHang){
        this.GiaHang = GiaHang;
    }
    public float GetGiaHang(){
        return this.GiaHang;
    
    }
    
    
public String ToString(){
        String str = "\n +Mã hóa đơn: "+GetMaHD()+
                     "\n +Ngày hóa đơn:"+GetNgayHD()+
                     "\n +Tên hàng hóa:"+GetTenHang()+
                     "\n +Giá hàng hóa:"+GetGiaHang();
        return str;   
}
  }

