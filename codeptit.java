import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GiaoDich {
    String maGiaoDich;
    String ngayGiaoDich;
    double donGia;
    double soLuong;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public double tinhThanhTien() {
        return soLuong * donGia;
    }
}

class GiaoDichVang extends GiaoDich {
    String loaiVang;

    public GiaoDichVang(String maGiaoDich, String ngayGiaoDich, double donGia, double soLuong, String loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
    }
}

class GiaoDichTienTe extends GiaoDich {
    String loaiTienTe;
    double tiGia;

    public GiaoDichTienTe(String maGiaoDich, String ngayGiaoDich, double donGia, double soLuong, double tiGia, String loaiTienTe) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tiGia = tiGia;
        this.loaiTienTe = loaiTienTe;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiTienTe.equals("USD") || loaiTienTe.equals("Euro")) {
            return soLuong * donGia * tiGia;
        } else {
            return soLuong * donGia;
        }
    }
}

public class codeptit {
    public static void main(String[] args) {
        List<GiaoDich> danhSachGiaoDich = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Them Giao Dich Vang");
            System.out.println("2. Them Giao Dich Tien Te");
            System.out.println("3. Hien Thi Danh Sach Giao Dich");
            System.out.println("4. Xem tong so luong cua cac giao dich");
            System.out.println("5. Hien thi danh sach giao dich theo ngay");
            System.out.println("6. Hien thi danh sach giao dich chua ngay");
            System.out.println("7. Hien thi danh sach giao dich theo khoang thoi gian");
            System.out.println("0. Thoat");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma giao dich: ");
                    String maGD = scanner.nextLine();
                    System.out.print("Nhap ngay giao dich (ngay/thang/nam): ");
                    String ngayGD = scanner.nextLine();
                    System.out.print("Nhap don gia: ");
                    double donGia = scanner.nextDouble();
                    System.out.print("Nhap so luong: ");
                    double soLuong = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Nhap loai vang: ");
                    String loaiVang = scanner.nextLine();

                    GiaoDichVang giaoDichVang = new GiaoDichVang(maGD, ngayGD, donGia, soLuong, loaiVang);
                    danhSachGiaoDich.add(giaoDichVang);
                    break;

                case 2:
                    System.out.print("Nhap ma giao dich: ");
                    maGD = scanner.nextLine();
                    System.out.print("Nhap ngay giao dich (ngay/thang/nam): ");
                    ngayGD = scanner.nextLine();
                    System.out.print("Nhap don gia: ");
                    donGia = scanner.nextDouble();
                    System.out.print("Nhap so luong: ");
                    soLuong = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Nhap ty gia: ");
                    double tiGia = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Nhap loai tien te (USD/Euro/VN): ");
                    String loaiTienTe = scanner.nextLine();

                    GiaoDichTienTe giaoDichTienTe = new GiaoDichTienTe(maGD, ngayGD, donGia, soLuong, tiGia, loaiTienTe);
                    danhSachGiaoDich.add(giaoDichTienTe);
                    break;

                case 3:
                    System.out.println("Danh sach giao dich:");
                    for (GiaoDich gd : danhSachGiaoDich) {
                        if (gd instanceof GiaoDichVang) {
                            GiaoDichVang gdVang = (GiaoDichVang) gd;
                            System.out.println("Ma giao dich: " + gdVang.maGiaoDich);
                            System.out.println("Ngay giao dich: " + gdVang.ngayGiaoDich);
                            System.out.println("Don gia: " + gdVang.donGia);
                            System.out.println("So luong: " + gdVang.soLuong);
                            System.out.println("Loai vang: " + gdVang.loaiVang);
                            System.out.println("Thanh tien: " + gdVang.tinhThanhTien());
                            System.out.println();
                        } else if (gd instanceof GiaoDichTienTe) {
                            GiaoDichTienTe gdTienTe = (GiaoDichTienTe) gd;
                            System.out.println("Ma giao dich: " + gdTienTe.maGiaoDich);
                            System.out.println("Ngay giao dich: " + gdTienTe.ngayGiaoDich);
                            System.out.println("Don gia: " + gdTienTe.donGia);
                            System.out.println("So luong: " + gdTienTe.soLuong);
                            System.out.println("Loai tien te: " + gdTienTe.loaiTienTe);
                            System.out.println("Thanh tien: " + gdTienTe.tinhThanhTien());
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    double tongSoLuong = 0;
                    for (GiaoDich gd : danhSachGiaoDich) {
                        tongSoLuong += gd.soLuong;
                    }
                    System.out.println("Tong so luong cua cac giao dich: " + tongSoLuong);
                    break;
                    case 5:
                    System.out.print("Nhap ngay can tim (ngay/thang/nam): ");
                    String ngayCanTim = scanner.nextLine();
                    System.out.println("Danh sach giao dich theo ngay " + ngayCanTim + ":");
                    for (GiaoDich gd : danhSachGiaoDich) {
                        if (gd.ngayGiaoDich.equals(ngayCanTim)) {
                            if (gd instanceof GiaoDichVang) {
                                GiaoDichVang gdVang = (GiaoDichVang) gd;
                                System.out.println("Ma giao dich: " + gdVang.maGiaoDich);
                                System.out.println("Ngay giao dich: " + gdVang.ngayGiaoDich);
                                System.out.println("Don gia: " + gdVang.donGia);
                                System.out.println("So luong: " + gdVang.soLuong);
                                System.out.println("Loai vang: " + gdVang.loaiVang);
                                System.out.println("Thanh tien: " + gdVang.tinhThanhTien());
                                System.out.println();
                            } else if (gd instanceof GiaoDichTienTe) {
                                GiaoDichTienTe gdTienTe = (GiaoDichTienTe) gd;
                                System.out.println("Ma giao dich: " + gdTienTe.maGiaoDich);
                                System.out.println("Ngay giao dich: " + gdTienTe.ngayGiaoDich);
                                System.out.println("Don gia: " + gdTienTe.donGia);
                                System.out.println("So luong: " + gdTienTe.soLuong);
                                System.out.println("Loai tien te: " + gdTienTe.loaiTienTe);
                                System.out.println("Thanh tien: " + gdTienTe.tinhThanhTien());
                                System.out.println();
                            }
                        }
                    }
                    break;
    
                case 6:
                    System.out.print("Nhap ngay can kiem tra (ngay/thang/nam): ");
                    String ngayCanKiemTra = scanner.nextLine();
                    boolean coGiaoDichChuaNgay = false;
                    for (GiaoDich gd : danhSachGiaoDich) {
                        if (gd.ngayGiaoDich.contains(ngayCanKiemTra)) {
                            coGiaoDichChuaNgay = true;
                            break;
                        }
                    }
                    if (coGiaoDichChuaNgay) {
                        System.out.println("Co giao dich chua ngay " + ngayCanKiemTra);
                    } else {
                        System.out.println("Khong co giao dich nao chua ngay " + ngayCanKiemTra);
                    }
                    break;
    
                case 7:
                    System.out.print("Nhap nam bat dau: ");
                    int namBatDau = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhap nam ket thuc: ");
                    int namKetThuc = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Danh sach giao dich tu nam " + namBatDau + " den nam " + namKetThuc + ":");
                    for (GiaoDich gd : danhSachGiaoDich) {
                        int namGiaoDich = Integer.parseInt(gd.ngayGiaoDich.split("/")[2]);
                        if (namGiaoDich >= namBatDau && namGiaoDich <= namKetThuc) {
                            if (gd instanceof GiaoDichVang) {
                                GiaoDichVang gdVang = (GiaoDichVang) gd;
                                System.out.println("Ma giao dich: " + gdVang.maGiaoDich);
                                System.out.println("Ngay giao dich: " + gdVang.ngayGiaoDich);
                                System.out.println("Don gia: " + gdVang.donGia);
                                System.out.println("So luong: " + gdVang.soLuong);
                                System.out.println("Loai vang: " + gdVang.loaiVang);
                                System.out.println("Thanh tien: " + gdVang.tinhThanhTien());
                                System.out.println();
                            } else if (gd instanceof GiaoDichTienTe) {
                                GiaoDichTienTe gdTienTe = (GiaoDichTienTe) gd;
                                System.out.println("Ma giao dich: " + gdTienTe.maGiaoDich);
                                System.out.println("Ngay giao dich: " + gdTienTe.ngayGiaoDich);
                                System.out.println("Don gia: " + gdTienTe.donGia);
                                System.out.println("So luong: " + gdTienTe.soLuong);
                                System.out.println("Loai tien te: " + gdTienTe.loaiTienTe);
                                System.out.println("Thanh tien: " + gdTienTe.tinhThanhTien());
                                System.out.println();
                            }
                        }
                    }
                    break;
    
                case 0:
                    System.out.println("Ket thuc chuong trinh.");
                    scanner.close();
                    System.exit(0);
                    break;
    
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        }
    }
}
    



