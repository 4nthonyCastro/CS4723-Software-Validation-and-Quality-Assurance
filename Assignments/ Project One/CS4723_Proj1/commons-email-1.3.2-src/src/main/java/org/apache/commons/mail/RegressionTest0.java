package org.apache.commons.mail;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        try {
            long long1 = java.util.Date.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.time.Instant instant0 = null;
        try {
            java.util.Date date1 = java.util.Date.from(instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getHours();
        java.util.Date date2 = new java.util.Date();
        int int3 = date2.getYear();
        date2.setSeconds(0);
        boolean boolean6 = date0.after(date2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Date date0 = new java.util.Date();
        java.lang.String str1 = date0.toString();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Date date0 = new java.util.Date();
        long long1 = date0.getTime();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        int int2 = date0.getDay();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        long long6 = java.util.Date.UTC(0, 0, (int) '#', (int) (byte) 10, (-1), 69);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2206015191000L) + "'", long6 == (-2206015191000L));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.Date date5 = new java.util.Date((int) (short) -1, (int) (byte) 10, 9, (-1), 10);
        int int6 = date5.getSeconds();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.Date date3 = new java.util.Date((int) (short) 0, (int) (byte) 10, (int) (byte) 100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        int int2 = date0.getYear();
        int int3 = date0.getMinutes();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.Date date1 = new java.util.Date((long) ' ');
        java.time.Instant instant2 = date1.toInstant();
        long long3 = date1.getTime();
        org.junit.Assert.assertNotNull(instant2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.Date date1 = new java.util.Date((long) ' ');
        java.util.Date date2 = new java.util.Date();
        date2.setDate((int) (byte) 10);
        int int5 = date2.getMonth();
        boolean boolean6 = date1.equals((java.lang.Object) int5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.Date date1 = new java.util.Date("Oct 31, 2018 4:57:33 PM");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        long long6 = java.util.Date.UTC(100, (int) (byte) 100, 100, (int) (byte) 0, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1218153601000L + "'", long6 == 1218153601000L);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        date0.setTime(1541023053790L);
        date0.setDate((int) (byte) 10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.Date date3 = new java.util.Date((int) '4', 118, 118);
        date3.setHours((int) (byte) -1);
        date3.setHours(10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        java.lang.String str2 = date0.toLocaleString();
        java.util.Date date3 = new java.util.Date();
        date3.setDate((int) (byte) 10);
        date3.setYear((int) (byte) 10);
        date3.setYear((int) (byte) 1);
        boolean boolean10 = date0.before(date3);
        date0.setMinutes((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.Date date3 = new java.util.Date((int) '4', 118, 118);
        date3.setHours((int) (byte) -1);
        java.util.Date date6 = new java.util.Date();
        int int7 = date6.getYear();
        java.lang.String str8 = date6.toLocaleString();
        java.util.Date date9 = new java.util.Date();
        date9.setDate((int) (byte) 10);
        date9.setYear((int) (byte) 10);
        date9.setYear((int) (byte) 1);
        boolean boolean16 = date6.before(date9);
        date6.setHours((int) 'a');
        int int19 = date3.compareTo(date6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.Date date0 = new java.util.Date();
        date0.setDate((int) (byte) 10);
        int int3 = date0.getMonth();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getYear();
        java.lang.String str6 = date4.toLocaleString();
        java.util.Date date7 = new java.util.Date();
        date7.setDate((int) (byte) 10);
        date7.setYear((int) (byte) 10);
        date7.setYear((int) (byte) 1);
        boolean boolean14 = date4.before(date7);
        boolean boolean15 = date0.after(date7);
        int int16 = date0.getYear();
        java.lang.String str17 = date0.toGMTString();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        java.lang.String str2 = date0.toLocaleString();
        java.util.Date date3 = new java.util.Date();
        date3.setDate((int) (byte) 10);
        date3.setYear((int) (byte) 10);
        date3.setYear((int) (byte) 1);
        boolean boolean10 = date0.before(date3);
        java.time.Instant instant11 = date0.toInstant();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(instant11);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getHours();
        date0.setTime((long) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Date date3 = new java.util.Date((int) '4', 118, 118);
        date3.setHours((int) (byte) -1);
        int int6 = date3.getMonth();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        java.lang.String str2 = date0.toLocaleString();
        java.util.Date date3 = new java.util.Date();
        date3.setDate((int) (byte) 10);
        date3.setYear((int) (byte) 10);
        date3.setYear((int) (byte) 1);
        boolean boolean10 = date0.before(date3);
        java.lang.String str11 = date3.toString();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        date0.setTime(1541023053790L);
        java.time.Instant instant4 = date0.toInstant();
        java.util.Date date5 = java.util.Date.from(instant4);
        java.util.Date date6 = java.util.Date.from(instant4);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertNotNull(date6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.Date date0 = new java.util.Date();
        date0.setDate((int) (byte) 10);
        java.lang.String str3 = date0.toString();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.Date date1 = new java.util.Date(1L);
        int int2 = date1.getTimezoneOffset();
        date1.setSeconds((int) (byte) 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        int int2 = date1.getYear();
        int int3 = date1.getSeconds();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getHours();
        int int6 = date4.getSeconds();
        int int7 = date1.compareTo(date4);
        java.util.Date date9 = new java.util.Date((long) (short) 0);
        boolean boolean10 = date1.equals((java.lang.Object) (short) 0);
        date1.setMonth((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.Date date1 = new java.util.Date(1L);
        date1.setMonth(0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        date0.setTime(1541023053790L);
        date0.setDate((int) (short) 0);
        int int6 = date0.getMinutes();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.Date date5 = new java.util.Date((int) (byte) 100, 33, 100, 3, 69);
        java.lang.String str6 = date5.toString();
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.Date date0 = new java.util.Date();
        date0.setDate((int) (byte) 10);
        date0.setYear((int) (byte) 10);
        date0.setYear((int) (byte) 1);
        java.lang.String str7 = date0.toLocaleString();
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        date1.setSeconds((int) (short) -1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.Date date5 = new java.util.Date((int) (short) 10, 118, 16, 118, (int) (byte) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        long long6 = java.util.Date.UTC((-1), (int) (byte) 100, (-1), 3, 3, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1977944220000L) + "'", long6 == (-1977944220000L));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.Date date5 = new java.util.Date((int) (byte) 100, 33, 100, 3, 69);
        int int6 = date5.getDate();
        date5.setDate(100);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.Date date5 = new java.util.Date((int) (byte) 100, 33, 100, 3, 69);
        date5.setDate(33);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.util.Date date6 = new java.util.Date(1, 69, (int) '#', 16, (int) (byte) -1, (int) (byte) -1);
        date6.setSeconds((int) (byte) 10);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.util.Date date5 = new java.util.Date((int) (short) 0, (int) (short) -1, (int) (byte) 0, (int) (byte) 100, 0);
        java.lang.String str6 = date5.toGMTString();
        java.util.Date date8 = new java.util.Date(1L);
        boolean boolean9 = date5.equals((java.lang.Object) 1L);
        date5.setHours(8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.Date date1 = new java.util.Date(1L);
        int int2 = date1.getDay();
        java.lang.String str3 = date1.toString();
        int int4 = date1.getTimezoneOffset();
        int int5 = date1.getDate();
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        java.lang.String str2 = date0.toLocaleString();
        java.util.Date date3 = new java.util.Date();
        date3.setDate((int) (byte) 10);
        date3.setYear((int) (byte) 10);
        date3.setYear((int) (byte) 1);
        boolean boolean10 = date0.before(date3);
        boolean boolean12 = date3.equals((java.lang.Object) "Wed Dec 31 18:00:00 CST 1969");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        int int2 = date0.getMinutes();
        java.util.Date date4 = new java.util.Date((long) (byte) 1);
        int int5 = date4.getYear();
        int int6 = date4.getSeconds();
        java.util.Date date7 = new java.util.Date();
        int int8 = date7.getHours();
        int int9 = date7.getSeconds();
        int int10 = date4.compareTo(date7);
        java.util.Date date12 = new java.util.Date((long) (short) 0);
        boolean boolean13 = date4.equals((java.lang.Object) (short) 0);
        int int14 = date0.compareTo(date4);
        date4.setMinutes(360);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.Date date0 = new java.util.Date();
        date0.setDate((int) (byte) 10);
        date0.setYear((int) (byte) 10);
        date0.setSeconds(0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.Date date5 = new java.util.Date((int) (byte) 100, 33, 100, 3, 69);
        long long6 = date5.getTime();
        date5.setSeconds(8);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.Date date5 = new java.util.Date((int) (byte) 100, 33, 100, 3, 69);
        int int6 = date5.getDate();
        long long7 = date5.getTime();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getYear();
        int int2 = date0.getMinutes();
        int int3 = date0.getTimezoneOffset();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.Date date1 = new java.util.Date((long) (short) 0);
        long long2 = date1.getTime();
        date1.setMinutes(0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        int int2 = date1.getYear();
        int int3 = date1.getSeconds();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getHours();
        int int6 = date4.getSeconds();
        int int7 = date1.compareTo(date4);
        java.lang.Class<?> wildcardClass8 = date1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        long long6 = java.util.Date.UTC((int) '#', (int) (short) 0, 8, (int) (short) 1, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1103923199000L) + "'", long6 == (-1103923199000L));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.util.Date date0 = new java.util.Date();
        date0.setDate((int) (byte) 10);
        int int3 = date0.getMonth();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getYear();
        java.lang.String str6 = date4.toLocaleString();
        java.util.Date date7 = new java.util.Date();
        date7.setDate((int) (byte) 10);
        date7.setYear((int) (byte) 10);
        date7.setYear((int) (byte) 1);
        boolean boolean14 = date4.before(date7);
        boolean boolean15 = date0.after(date7);
        int int16 = date0.getYear();
        date0.setMinutes(69);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.util.Date date6 = new java.util.Date(33, (int) '#', 300, 100, (int) ' ', (int) (byte) 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.util.Date date0 = new java.util.Date();
        date0.setDate((int) (byte) 10);
        int int3 = date0.getMonth();
        int int4 = date0.getMinutes();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.util.Date date1 = new java.util.Date("Oct 10, 1901 4:57:34 PM");
        int int2 = date1.getTimezoneOffset();
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.util.Date date1 = new java.util.Date((long) (byte) 1);
        int int2 = date1.getYear();
        int int3 = date1.getSeconds();
        java.util.Date date4 = new java.util.Date();
        int int5 = date4.getHours();
        int int6 = date4.getSeconds();
        int int7 = date1.compareTo(date4);
        int int8 = date4.getDate();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }
}

