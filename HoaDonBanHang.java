
package qlcuahangbandienthoai;

public class HoaDonBanHang extends HoaDon{
    
    // thuoc tinh (attributes)
  private String KhachHang;
  private int SDT,SoLuong;
  
  
   // constructor
  public HoaDonBanHang() {
}
  public HoaDonBanHang (String MaHD,String NgayHD,String TenHang
  ,float GiaHang,int SoLuong,String KhachHang,int SDT){
      
      super(MaHD,NgayHD,TenHang,GiaHang);
      this.SoLuong=SoLuong;
      this.KhachHang=KhachHang;
      this.SDT=SDT;
        
  }
    // phuong thuc set, get
    public void SetSoLuong(int SoLuong){
        this.SoLuong = SoLuong;
    }
    public int GetSoLuong(){
        return this.SoLuong;
    }
    public void SetKhachHang(String KhachHang){
        this.KhachHang = KhachHang;
    }
    public String GetkhachHang(){
        return this.KhachHang;
    }
    public void SetSDT(int SDT){
        this.SDT = SDT;
    }
    public int GetSDT(){
        return this.SDT;
    }
    //gia tien
    public float ThanhTien(){
    return GetSoLuong()*GetGiaHang();
    }
    
    //to string
@Override
public String ToString(){
        String str = super.ToString()+"\n + Số lượng: "+GetSoLuong()
                                     +"\n + Khách hàng: " +GetkhachHang()
                                     +"\n + Số điện thoại:"+GetSDT()
                                     +"\n + Thành tiền: "+ThanhTien();
        return str;   
}
}
