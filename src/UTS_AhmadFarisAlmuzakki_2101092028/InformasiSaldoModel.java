/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_AhmadFarisAlmuzakki_2101092028;

/**
 *
 * @author LENOVO
 */
public class InformasiSaldoModel {
    int saldo=2000000;
    int saldo1=1950000;
    int saldo2=1900000;
    int saldo3=1800000;
    int saldo4=1500000;
    int transfer;
    int setoran;
    int transfer1=50000;
    int transfer2=100000;
    int transfer3=200000;
    int transfer4=500000;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public int getSaldo1() {
        return saldo1;
    }

    public void setSaldo1(int saldo1) {
        this.saldo1 = saldo1;
    }
    
    public int getSaldo2() {
        return saldo2;
    }

    public void setSaldo2(int saldo2) {
        this.saldo2 = saldo2;
    }
    
    public int getSaldo3() {
        return saldo3;
    }

    public void setSaldo3(int saldo3) {
        this.saldo3 = saldo3;
    }
    
    public int getSaldo4() {
        return saldo4;
    }

    public void setSaldo4(int saldo4) {
        this.saldo4 = saldo4;
    }
    
    public int getTransfer() {
        return transfer;
    }
    
    public void setTransfer(String transfer) {
        this.transfer = Integer.parseInt(transfer);
    }
    
    public int prosesTransfer(){
        saldo=saldo-transfer;
        return saldo;
    }
    
    public int getTransfer1() {
        return transfer1;
    }

    public void setTransfer1(int transfer1) {
        this.transfer1 = transfer1;
    }
    
    public int getTransfer2() {
        return transfer2;
    }

    public void setTransfer2(int transfer2) {
        this.transfer2 = transfer2;
    }
    
    public int getTransfer3() {
        return transfer3;
    }

    public void setTransfer3(int transfer3) {
        this.transfer3 = transfer3;
    }
    
    public int getTransfer4() {
        return transfer4;
    }

    public void setTransfer4(int transfer4) {
        this.transfer4 = transfer4;
    }
    
    public int getSetoran() {
        return setoran;
    }
    
    public void setSetoran(String setoran) {
        this.setoran = Integer.parseInt(setoran);
    }
    
    public int prosesSetoran(){
        saldo=saldo+setoran;
        return saldo;
    }
}
