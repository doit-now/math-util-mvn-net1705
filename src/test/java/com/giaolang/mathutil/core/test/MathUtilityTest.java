/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author giao.lang
 */
public class MathUtilityTest {
    
    //Test case #1 - Verify getFactorial(with n = 0)
    //Steps/Procedures
    //           1. Given n = 0
    //           2. Call/invoke getFactorial(n = 0)
    //Expected Result:
    //           The method must return 1 as the result of 0! = 1
    //Status: PASSED | FAILED chờ đến lúc runtime mới biết
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk() {        
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk() {        
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk() {        
        assertEquals(120, MathUtility.getFactorial(5));
    }
}

//3 TEST CASE TRÊN KO ĐẸP, BỐC MÙI, BAD SMELLS VÌ CHỈ KHÁC NHAU PHẦN DATA
//TRONG NGHỀ KIỂM THỬ CÓ 1 KĨ THUẬT ĐÓ LÀ TÁCH HẲN DATA KIỂM THỬ RA 
//1 CHỖ, CHO DỄ NHÌN, DỄ QUẢN LÍ ĐC DATA THIẾU ĐỦ HAY KO

//SAU ĐÓ TA ĐƯA BỘ DATA NÀY VÀO TRONG CÂU LỆNH SO SÁNH ASSERT()
//QUA CÁC THAM SỐ (PARAMETER)
//TỨC LÀ ASSERTEQUALS(EXPECTED, ACTUAL) LÀ 2 THAM SỐ 
//ỨNG VỚI BỘ DATA ĐC TÁCH RA
//                      120       5!
//                      720       6!
//                       24       4!
//                        6       3!
//                        2       2!
//                     ...

//                MẢNG [5][2] {0, 1} {1, 1} {2, 2} {3, 6} {5, 120} 
//CODE NHÌN GỌN, PHÁT HIỆN ĐC THIẾU ĐỦ TEST DATA, TEST CASE
//KĨ THUẬT TÁCH DATA KIỂM THỬ RA KHỎI CÂU LỆNH SO SÁNH -> ĐC GỌI
//LÀ DDT - DATA DRIVEN TESTING - KIỂM THỬ THEO HƯỚNG TÁCH DATA RIÊNG RẼ

