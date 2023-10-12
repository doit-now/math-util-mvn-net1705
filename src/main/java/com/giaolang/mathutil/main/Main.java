package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtility;

public class Main {

    public static void main(String[] args) {
        //TEST CASE #1 - XEM CHI TIẾT BÊN DƯỚI
        int n = 0; //given n = 0, ý là muốn tính 0!
        long expected = 1;  //ý muốn là hàm n! = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n);  //ý nói rằng hàm chạy ra mấy, invoke, call

        //so sánh giữa expected vs. actual 
        System.out.println(n + "! -> expected: " + expected
                + " | actual = " + actual);

        //TEST CASE #2 - N = 1 -> XEM CHI TIẾT MÔ TẢ Ở DƯỚI
        n = 1;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected
                + " | actual = " + actual);
        
        //TEST CASE #3 - N = 5 -> XEM CHI TIẾT MÔ TẢ Ở DƯỚI
        System.out.println("5! -> expected: 120" 
                + " | actual = " + MathUtility.getFactorial(5));
        
    }

}

//TEST CASE #3: Verify getFactorial(with n = 5)
//STEPS/PROCEDURES: 
//             1. Give n = 5
//             2. Call/invoke getFactorial(n = 5)

//EXPECTED RESULT: 
//              the method must return 120 in case of 5!
//STATUS: PASSED | FAILED


//TEST CASE #2: Verify getFactorial(with n = 1)
//STEPS/PROCEDURES: 
//             1. Give n = 1
//             2. Call/invoke getFactorial(n = 1)

//EXPECTED RESULT: 
//              the method must return 1 in case of 1!
//STATUS: PASSED | FAILED


//MÌNH LÀ DEV, MÌNH PHẢI TEST CODE CỦA MÌNH NGON TRƯỚC ĐÃ
//MUỐN TEST CODE (DEV) HAY TEST APP (QC/TESTER) THÌ CẦN PHẢI CHUẨN BỊ
//TEST CASE - TÌNH HUỐNG KIỂM THỬ, TRƯỜNG HỢP KIỂM THỬ - CÁCH TA
//            KIỂM THỬ TRONG 1 NGỮ CẢNH NÀO ĐÓ - BÀN VỀ BỘ DATA 
//1 TEST CASE CÓ CẤU TRÚC NHƯ SAU:
//ID | Description | Steps/Procedures | Expected Result | Status (Passed/Failed)
//DEV EM MÚN KIỂM THỬ COI HÀM CHÍNH EM VIẾT getFactorial() đúng hay sai
//thì em phải thiết ké các test case
//Test Case #1: Verify getFactorial(with n = 0)
//Steps-Procedures:            [Các bước run app để test]
//         1. Given n = 0
//         2. Execute/Call/Invoke function getFactorial(0)
//Expected Result: the function must return 1 (standing for 0! = 1)
//Status: PASSED, or FAILED, ai biết, chờ run app/hàm cái đã!!!
//RUN HÀM, RUN APP, ĐƯA TEST DATA VÀO, ĐC GỌI LÀ TEST RUN

