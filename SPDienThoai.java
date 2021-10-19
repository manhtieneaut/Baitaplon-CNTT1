
package qlcuahangbandienthoai;
public class SPDienThoai {
    // thuoc tinh (attributes)
  private String MaHang,TenHang;
  private float GiaHang;
   // constructor
  public SPDienThoai(){
    }
  public SPDienThoai(String MaHang,String TenHang,float GiaHang){
        this.MaHang = MaHang;
        this.TenHang = TenHang;
        this.GiaHang = GiaHang;
        
    }
    // phuong thuc set, get
    public void SetMaHang(String MaHang){
        this.MaHang = MaHang;
    }
    public String GetMaHang(){
        return MaHang;
    }
    public void SetTenHang(String TenHang){
        this.TenHang = TenHang;
    }
    public String GetTenHang(){
        return TenHang;
    }
    public void SetGiaHang(float GiaHang){
        this.GiaHang = GiaHang;
    }
    public float GetGiaHang(){
        return GiaHang;
    
    }
    
    //to string
    public String ToString(){
        System.out.println();
        String str =  " \n Mã Hàng: "+ GetMaHang()
                      +" | Tên hàng: "+ GetTenHang()
                      +" | Giá hàng: "+ GetGiaHang();
                    
        return str;
    }
}
