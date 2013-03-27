package util;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {
    
    @Test
    public void test1() {
        String entrada = "09:00";
        String saidaAlmoco = "12:00";
        String voltaAlmoco = "13:00";
        String saida = "18:00";
        String horaExtra = "";
        String saidas = "";
        String expResult = "08:00";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 1/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
    
    @Test
    public void test2(){
        String entrada = "09:10";
        String saidaAlmoco = "12:15";
        String voltaAlmoco = "13:00";
        String saida = "18:10";
        String horaExtra = "";
        String saidas = "";
        String expResult = "08:00";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 2/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }

    @Test
    public void test3(){
        String entrada = "08:50";
        String saidaAlmoco = "12:00";
        String voltaAlmoco = "13:10";
        String saida = "18:00";
        String horaExtra = "";
        String saidas = "";
        String expResult = "07:50";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 3/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
    
    @Test
    public void test4(){
        String entrada = "09:00";
        String saidaAlmoco = "12:00";
        String voltaAlmoco = "12:50";
        String saida = "17:50";
        String horaExtra = "";
        String saidas = "";
        String expResult = "07:50";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 4/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
    
    @Test
    public void test5(){
        String entrada = "09:00";
        String saidaAlmoco = "12:00";
        String voltaAlmoco = "13:00";
        String saida = "17:30";
        String horaExtra = "";
        String saidas = "";
        String expResult = "07:30";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 5/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
    
    @Test
    public void test6(){
        String entrada = "09:20";
        String saidaAlmoco = "12:15";
        String voltaAlmoco = "13:00";
        String saida = "18:00";
        String horaExtra = "";
        String saidas = "";
        String expResult = "07:55";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 6/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
    
    @Test
    public void test7(){
        String entrada = "08:20";
        String saidaAlmoco = "12:40";
        String voltaAlmoco = "13:00";
        String saida = "18:00";
        String horaExtra = "";
        String saidas = "";
        String expResult = "07:20";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 7/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
    
    @Test
    public void test8(){
        String entrada = "09:01";
        String saidaAlmoco = "12:00";
        String voltaAlmoco = "13:10";
        String saida = "18:00";
        String horaExtra = "";
        String saidas = "";
        String expResult = "07:49";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 8/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
    
    @Test
    public void test9(){
        String entrada = "09:00";
        String saidaAlmoco = "12:00";
        String voltaAlmoco = "13:20";
        String saida = "18:20";
        String horaExtra = "";
        String saidas = "";
        String expResult = "07:40";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 9/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
    
    @Test
    public void test10(){
        String entrada = "09:00";
        String saidaAlmoco = "12:00";
        String voltaAlmoco = "13:00";
        String saida = "18:15";
        String horaExtra = "";
        String saidas = "";
        String expResult = "08:00";
        Calc instance = new Calc();
        int result = instance.calculado(entrada, saidaAlmoco, voltaAlmoco, saida, horaExtra, saidas);
        assertEquals(expResult, minToDateStr(result));
        System.out.print("test 10/ ");
        System.out.println("Esperado " + expResult + " Calculado "+ minToDateStr(result));
    }
         
    public String minToDateStr(Integer time) {
        String horas = "", minutos = "";
        if (null != time && time > 0) {
            if (time > 60) {
                horas = "" + time / 60;
            } else {
                horas = "00";
            }
            if (time > 60) {
                minutos = "" + time % 60;
            } else {
                minutos = "" + time;
            }
            if (horas.length() == 1) {
                horas = "0" + horas;
            }            
            if (minutos.length() == 1) {
                minutos = "0" + minutos;
            }            
            return horas + ":" + minutos;            
        } else {
            return "00:00";
        }
    }
    
}
