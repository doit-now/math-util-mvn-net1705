package com.giaolang.mathutil.core;

//class này sẽ chứa 1 loạt các hàm static dùng để làm thư viên cho các
//nơi khác/class khác xài!!!

public class MathUtility {
    public static final double PI = 3.14;
    //public const double Pi = 3.14;  //C# ko cần static mà vẫn giống
                                      //vì có chữ const ~ final
    
    //hàm tính n! = 1.2.3...n
    //0! = 1! = 1 - quy ước
    //ko tính đc giai thừa số âm
    //n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    //vậy 21! ko chứa trong long đc, tràn kiểu dữ liệu
    //quy ước < 0 ! và > 20! NÉM NGOẠI LỆ, HOK TÍNH ĐC
    
    //5! = 1.2.3.4.   5
    //5! =       4! x 5 = 5 x 4!
    //4! = 1.2.3   .4
    //        3!  x 4 = 4 x 3! đuổi nhau
    //3! = 3 x 2!
    //2! = 2 x 1!  DỪNG NHEN. ĐỆ QUY LUÔN PHẢI DỪNG
    //N! = N X (N - 1)!  ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
    //                   BÚP BÊ NGA
    public static long getFactorial(int n) { //n!
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        
        if (n == 0 || n == 1)
            return 1;  //kết thúc sớm hàm, nếu có thể
        //DÙNG ĐỆ QUY
        
        return n * getFactorial(n - 1); 
    }
    //KĨ THUẬT KIỂM THỬ GỌI LÀ: REGRESSION TESTING
    //                          KIỂM THỬ HỒI QUY - TEST LẠI NHỮNG THỨ
    //                          ĐÃ TỪNG TEST
    //Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa
    //sửa vì:
    //fix bug thì phải sửa code, sửa hàm
    //thêm hàm, thêm tính năng
    //tối ưu hàm cũ, làm hàm cũ gọn hơn, dễ đọc hơn, chạy nhanh hơn
    //HÀM ĐANG NGON - MÀU XANH, NẾU TA SỬA HÀM VÌ LÍ DO GÌ ĐÓ
    //LIỆU RẰNG HÀM CÒN XANH HAY KO, THÌ PHẢI TEST LẠI
    //NẾU TEST = TAY, BẰNG LOG, THÌ CỰC KÌ TỐN THỜI GIAN, MẤT SỨC
    //NẾU CODE CỦA TA CÓ SẴN TEST SCRIPT - CODE KIỂM THỬ
    //TA CHỈ VIỆC RUN LẠI CÁI TEST SCRIPT NÀY
    //NẾU HÀM SỬA NGON, NÓ PHẢI RA MÀU XANH
    //NẾU HÀM SỬA KO NGON, BỊ MÀU ĐỎ!!!
    //NHỜ TEST SCRIPT TA VERIFY LẠI 1 HÀM RẤT NHANH -> KIỂM THỬ LẠI 
    //THỨ ĐÃ TỪNG KIỂM THỬ ĐỂ ĐẢM BẢO NÓ CÒN NGON SO VỚI TRƯỚC 
    //KHI SỬA ĐC GỌI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESTING
    //NHỜ CI, HỒI QUY LIÊN TỤC 
    
    //BÀI NÀY MÌNH THỬ HỒI QUY = CÁCH SỬA LẠI HÀM THEO THUẬT TOÁN
    //ĐỆ QUY - RECURSION 
    
    
    
    
    
//    public static long getFactorial(int n) {
//        
//        if (n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1;  //kết thúc sớm hàm, nếu có thể
//        
//        long result = 1;  //biến tích luỹ, gom dồn việc nhân, biến con heo đất 
//                          //acc accumulation
//            
//        //sống sót đến for, sure n = 2..20                  
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//                
//        return result;
//    }
}
