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
        java.lang.String str0 = org.apache.commons.mail.Email.ISO_8859_1;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "iso-8859-1" + "'", str0.equals("iso-8859-1"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str0 = org.apache.commons.mail.Email.ATTACHMENTS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "attachments" + "'", str0.equals("attachments"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_TRANSPORT_PROTOCOL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.transport.protocol" + "'", str0.equals("mail.transport.protocol"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String str0 = org.apache.commons.mail.Email.SMTP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "smtp" + "'", str0.equals("smtp"));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_PASSWORD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.password" + "'", str0.equals("mail.smtp.password"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_PORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.port" + "'", str0.equals("mail.smtp.port"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String str0 = org.apache.commons.mail.Email.TEXT_PLAIN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "text/plain" + "'", str0.equals("text/plain"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_FROM;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.from" + "'", str0.equals("mail.smtp.from"));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String str0 = org.apache.commons.mail.Email.RECEIVER_EMAIL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "receiver.email" + "'", str0.equals("receiver.email"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_USER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.user" + "'", str0.equals("mail.smtp.user"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str0 = org.apache.commons.mail.Email.RECEIVER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "receiver.name" + "'", str0.equals("receiver.name"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str0 = org.apache.commons.mail.Email.TEXT_HTML;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "text/html" + "'", str0.equals("text/html"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str0 = org.apache.commons.mail.Email.EMAIL_SUBJECT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "email.subject" + "'", str0.equals("email.subject"));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String str0 = org.apache.commons.mail.Email.SENDER_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sender.name" + "'", str0.equals("sender.name"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_CONNECTIONTIMEOUT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.connectiontimeout" + "'", str0.equals("mail.smtp.connectiontimeout"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str0 = org.apache.commons.mail.Email.FILE_SERVER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "file.server" + "'", str0.equals("file.server"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String str0 = org.apache.commons.mail.Email.EMAIL_BODY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "email.body" + "'", str0.equals("email.body"));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_TRANSPORT_TLS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.starttls.enable" + "'", str0.equals("mail.smtp.starttls.enable"));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_SOCKET_FACTORY_CLASS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.socketFactory.class" + "'", str0.equals("mail.smtp.socketFactory.class"));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_AUTH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.auth" + "'", str0.equals("mail.smtp.auth"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_DEBUG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.debug" + "'", str0.equals("mail.debug"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.String str0 = org.apache.commons.mail.Email.CONTENT_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "content.type" + "'", str0.equals("content.type"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.String str0 = org.apache.commons.mail.Email.KOI8_R;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "koi8-r" + "'", str0.equals("koi8-r"));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_HOST;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.host" + "'", str0.equals("mail.smtp.host"));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_SOCKET_FACTORY_PORT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.socketFactory.port" + "'", str0.equals("mail.smtp.socketFactory.port"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_SOCKET_FACTORY_FALLBACK;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.socketFactory.fallback" + "'", str0.equals("mail.smtp.socketFactory.fallback"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.String str0 = org.apache.commons.mail.Email.SENDER_EMAIL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "sender.email" + "'", str0.equals("sender.email"));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.String str0 = org.apache.commons.mail.Email.US_ASCII;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "us-ascii" + "'", str0.equals("us-ascii"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        simpleEmail0.setSSL(true);
        try {
            org.apache.commons.mail.Email email5 = simpleEmail0.addTo("text/html", "koi8-r");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/html''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        java.lang.String[] strArray2 = new java.lang.String[] {};
        try {
            org.apache.commons.mail.Email email3 = simpleEmail0.addBcc(strArray2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        try {
            javax.mail.Session session2 = simpleEmail0.getMailSession();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Cannot find valid hostname for mail session");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        try {
            org.apache.commons.mail.Email email4 = simpleEmail0.setFrom("email.subject");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``email.subject''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        org.apache.commons.mail.Email email6 = simpleEmail0.setSubject("mail.smtp.from");
        java.util.Date date7 = simpleEmail0.getSentDate();
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(date7);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = simpleEmail0.setBounceAddress("mail.smtp.host");
        try {
            org.apache.commons.mail.Email email6 = email3.addTo("sender.email", "mail.smtp.user");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``sender.email''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.internet.MimeMultipart mimeMultipart3 = null;
        simpleEmail0.setContent(mimeMultipart3);
        try {
            org.apache.commons.mail.Email email7 = simpleEmail0.setFrom("smtp", "mail.smtp.host");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``smtp''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        try {
            org.apache.commons.mail.Email email4 = simpleEmail0.setFrom("mail.smtp.host", "receiver.email");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.host''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        try {
            org.apache.commons.mail.Email email2 = simpleEmail0.addBcc("email.subject");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``email.subject''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        org.apache.commons.mail.Email email6 = simpleEmail0.setSubject("mail.smtp.from");
        java.util.Date date7 = email6.getSentDate();
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertNotNull(date7);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        boolean boolean2 = simpleEmail0.isSSLOnConnect();
        org.apache.commons.mail.Email email4 = simpleEmail0.setSendPartial(false);
        simpleEmail0.setSmtpPort((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        java.lang.String str3 = simpleEmail0.getSslSmtpPort();
        simpleEmail0.setSSL(true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "465" + "'", str3.equals("465"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        simpleEmail0.setDebug(false);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = null;
        try {
            simpleEmail0.setHeaders(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        try {
            org.apache.commons.mail.Email email5 = simpleEmail0.setFrom("mail.smtp.password", "mail.smtp.from");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.password''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        boolean boolean2 = simpleEmail0.isSSLOnConnect();
        org.apache.commons.mail.Email email4 = simpleEmail0.setStartTLSRequired(true);
        java.lang.String[] strArray11 = new java.lang.String[] { "mail.transport.protocol", "text/plain", "sender.name", "mail.smtp.socketFactory.port", "content.type", "content.type" };
        try {
            org.apache.commons.mail.Email email12 = email4.addTo(strArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.transport.protocol''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        org.apache.commons.mail.Email email6 = simpleEmail0.setSubject("mail.smtp.from");
        try {
            org.apache.commons.mail.Email email10 = email6.addReplyTo("smtp", "mail.smtp.connectiontimeout", "mail.smtp.port");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.port");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        }
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        boolean boolean2 = simpleEmail0.isSSLOnConnect();
        javax.mail.internet.InternetAddress[] internetAddressArray3 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList4 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList4, internetAddressArray3);
        try {
            org.apache.commons.mail.Email email6 = simpleEmail0.setTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList4);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(internetAddressArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Session session3 = null;
        try {
            simpleEmail0.setMailSession(session3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no mail session supplied");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.internet.MimeMessage mimeMessage3 = simpleEmail0.getMimeMessage();
        try {
            org.apache.commons.mail.Email email6 = simpleEmail0.setFrom("email.subject", "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``email.subject''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertNull(mimeMessage3);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = simpleEmail0.setSubject("465");
        boolean boolean4 = simpleEmail0.isStartTLSEnabled();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        boolean boolean2 = simpleEmail0.isSSLOnConnect();
        org.apache.commons.mail.Email email4 = simpleEmail0.setStartTLSRequired(true);
        try {
            org.apache.commons.mail.Email email6 = simpleEmail0.addTo("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Illegal address in string ``''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email4);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = simpleEmail0.setStartTLSEnabled(true);
        java.lang.String str4 = simpleEmail0.getSslSmtpPort();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "465" + "'", str4.equals("465"));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        java.lang.String str3 = simpleEmail0.getSslSmtpPort();
        org.apache.commons.mail.Email email5 = simpleEmail0.setSendPartial(false);
        try {
            org.apache.commons.mail.Email email8 = simpleEmail0.addBcc("text/html", "mail.smtp.socketFactory.port");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``text/html''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "465" + "'", str3.equals("465"));
        org.junit.Assert.assertNotNull(email5);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        java.lang.String str3 = simpleEmail0.getSslSmtpPort();
        simpleEmail0.setSmtpPort((int) '4');
        try {
            org.apache.commons.mail.Email email9 = simpleEmail0.addCc("mail.smtp.password", "mail.smtp.socketFactory.class", "mail.debug");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.debug");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "465" + "'", str3.equals("465"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        boolean boolean2 = simpleEmail0.isSSLOnConnect();
        javax.mail.internet.MimeMessage mimeMessage3 = simpleEmail0.getMimeMessage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(mimeMessage3);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        boolean boolean2 = simpleEmail0.isSSLOnConnect();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList3 = simpleEmail0.getCcAddresses();
        simpleEmail0.setSslSmtpPort("mail.smtp.user");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(internetAddressList3);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        java.lang.String[] strArray11 = new java.lang.String[] { "mail.smtp.user", "sender.email", "mail.smtp.from", "text/plain", "mail.smtp.socketFactory.port", "file.server" };
        try {
            org.apache.commons.mail.Email email12 = simpleEmail0.addBcc(strArray11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``mail.smtp.user''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.internet.MimeMultipart mimeMultipart3 = null;
        simpleEmail0.setContent(mimeMultipart3);
        boolean boolean5 = simpleEmail0.isSendPartial();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.String str0 = org.apache.commons.mail.Email.MAIL_SMTP_TIMEOUT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "mail.smtp.timeout" + "'", str0.equals("mail.smtp.timeout"));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        simpleEmail0.setDebug(false);
        javax.mail.Authenticator authenticator4 = null;
        simpleEmail0.setAuthenticator(authenticator4);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        boolean boolean2 = simpleEmail0.isSSLOnConnect();
        org.apache.commons.mail.Email email4 = simpleEmail0.setSendPartial(false);
        java.lang.Class<?> wildcardClass5 = simpleEmail0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        simpleEmail0.setSSL(true);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = null;
        try {
            simpleEmail0.setHeaders(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        org.apache.commons.mail.Email email6 = simpleEmail0.setSubject("mail.smtp.from");
        email6.setSmtpPort(10);
        java.lang.String str9 = email6.getSmtpPort();
        java.lang.String str10 = email6.getSubject();
        org.junit.Assert.assertNotNull(email6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "10" + "'", str9.equals("10"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "mail.smtp.from" + "'", str10.equals("mail.smtp.from"));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.internet.MimeMultipart mimeMultipart3 = null;
        simpleEmail0.setContent(mimeMultipart3);
        java.lang.String str5 = simpleEmail0.getSubject();
        simpleEmail0.setSocketConnectionTimeout(0);
        java.lang.String str8 = simpleEmail0.getSslSmtpPort();
        simpleEmail0.setPopBeforeSmtp(true, "attachments", "mail.smtp.socketFactory.port", "mail.smtp.port");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "465" + "'", str8.equals("465"));
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = simpleEmail0.setBounceAddress("mail.smtp.host");
        org.apache.commons.mail.Email email5 = email3.setStartTLSRequired(false);
        org.apache.commons.mail.SimpleEmail simpleEmail6 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean7 = simpleEmail6.isSendPartial();
        boolean boolean8 = simpleEmail6.isSSLOnConnect();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList9 = simpleEmail6.getCcAddresses();
        try {
            org.apache.commons.mail.Email email10 = email5.setCc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList9);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(internetAddressList9);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        javax.mail.internet.InternetAddress[] internetAddressArray5 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList6 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList6, internetAddressArray5);
        try {
            org.apache.commons.mail.Email email8 = simpleEmail0.setBcc((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertNotNull(internetAddressArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.internet.MimeMultipart mimeMultipart3 = null;
        simpleEmail0.setContent(mimeMultipart3);
        java.lang.String str5 = simpleEmail0.getSubject();
        simpleEmail0.setSocketConnectionTimeout(0);
        java.lang.String str8 = simpleEmail0.getSslSmtpPort();
        try {
            simpleEmail0.setSmtpPort(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot connect to a port number that is less than 1 ( 0 )");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "465" + "'", str8.equals("465"));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        java.util.List<javax.mail.internet.InternetAddress> internetAddressList2 = simpleEmail0.getToAddresses();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(internetAddressList2);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        org.apache.commons.mail.Email email6 = simpleEmail0.setSubject("mail.smtp.from");
        try {
            org.apache.commons.mail.Email email10 = email6.addReplyTo("attachments", "465", "mail.smtp.timeout");
            org.junit.Assert.fail("Expected exception of type java.nio.charset.UnsupportedCharsetException; message: mail.smtp.timeout");
        } catch (java.nio.charset.UnsupportedCharsetException e) {
        }
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        boolean boolean5 = simpleEmail0.isSSLCheckServerIdentity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = simpleEmail0.setBounceAddress("mail.smtp.host");
        email3.setSSL(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        javax.mail.Authenticator authenticator3 = null;
        simpleEmail0.setAuthenticator(authenticator3);
        org.apache.commons.mail.Email email6 = simpleEmail0.setSubject("mail.smtp.from");
        try {
            org.apache.commons.mail.Email email8 = email6.setFrom("smtp");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: javax.mail.internet.AddressException: Missing final '@domain' in string ``smtp''");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertNotNull(email6);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        javax.mail.internet.MimeMultipart mimeMultipart1 = null;
        simpleEmail0.setContent(mimeMultipart1);
        java.lang.String str3 = simpleEmail0.getSslSmtpPort();
        org.apache.commons.mail.Email email5 = simpleEmail0.setSendPartial(false);
        int int6 = email5.getSocketConnectionTimeout();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "465" + "'", str3.equals("465"));
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        boolean boolean2 = simpleEmail0.isSSLOnConnect();
        org.apache.commons.mail.Email email4 = simpleEmail0.setStartTLSRequired(true);
        javax.mail.internet.InternetAddress internetAddress5 = email4.getFromAddress();
        org.apache.commons.mail.Email email7 = email4.setBounceAddress("attachments");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(email4);
        org.junit.Assert.assertNull(internetAddress5);
        org.junit.Assert.assertNotNull(email7);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.apache.commons.mail.SimpleEmail simpleEmail0 = new org.apache.commons.mail.SimpleEmail();
        boolean boolean1 = simpleEmail0.isSendPartial();
        org.apache.commons.mail.Email email3 = simpleEmail0.setBounceAddress("mail.smtp.host");
        org.apache.commons.mail.Email email5 = email3.setStartTLSRequired(false);
        javax.mail.internet.InternetAddress[] internetAddressArray6 = new javax.mail.internet.InternetAddress[] {};
        java.util.ArrayList<javax.mail.internet.InternetAddress> internetAddressList7 = new java.util.ArrayList<javax.mail.internet.InternetAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7, internetAddressArray6);
        try {
            org.apache.commons.mail.Email email9 = email5.setReplyTo((java.util.Collection<javax.mail.internet.InternetAddress>) internetAddressList7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.mail.EmailException; message: Address List provided was invalid");
        } catch (org.apache.commons.mail.EmailException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(email3);
        org.junit.Assert.assertNotNull(email5);
        org.junit.Assert.assertNotNull(internetAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

